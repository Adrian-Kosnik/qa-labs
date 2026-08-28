package testExample;

import java.time.Instant;


public class BrokenAuditAppExaTest {

    // check the log line is exactly what we expect. 
    @Test
    public void formatAuditWorksCorrectly(){
        BrokenAuditAppExa.AuditEvent event =
        new BrokenAuditAppExa.AuditEvent(
            "abc12345",
            Instant.parse("2026-08-27T14:22:46.977271725Z"),
            "AuthTeam",
            "user-100",
            "OK",
            true
        );
        String result = BrokenAuditAppExa.formatAuditEvent(event);

        assertEquals("id=abc12345"
                + " date=2026-08-27T14:22:46.977271725Z"
                + " team=AuthTeam"
                + " user=user-100"
                + " result=OK"
                + " known=true", 
                result);
    }

    @Test
    public void timestampFormatTest(){

		BrokenAuditAppExa.Attempt attempt = new BrokenAuditAppExa.Attempt("user-100", true);

        Instant before = Instant.now();

        BrokenAuditAppExa.AuditEvent event = BrokenAuditAppExa.createAuditEvent(attempt);

        Instant after = Instant.now();

        assertFalse(event.timestamp().isBefore(before));
        assertFalse(event.timestamp().isAfter(after));

        assertTrue(event.timestamp().toString().endsWith("Z"));

    }


    // known_user - user-100 returns true user999 returns false
    // failed attempt = not_ok, passed attempt = OK. 
}


