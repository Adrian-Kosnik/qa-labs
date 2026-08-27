package testExample;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.Test;

public class BrokenAuditAppTest {

    // check the log line is exactly what we expect. 
    @Test
    public void formatAuditWorksCorrectly(){
        BrokenAuditApp.AuditEvent event =
        new BrokenAuditApp.AuditEvent(
            "abc12345",
            Instant.parse("2026-08-27T14:22:46.977271725Z"),
            "AuthTeam",
            "user-100",
            "OK",
            true
        );
        String result = BrokenAuditApp.formatAuditEvent(event);

        assertEquals("id=abc12345"
                + " date=2026-08-27T14:22:46.977271725Z"
                + " team=AuthTeam"
                + " user=user-100"
                + " result=OK"
                + " known=true", 
                result);
    }


}
