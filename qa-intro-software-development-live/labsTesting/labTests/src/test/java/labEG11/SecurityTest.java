package labEG11;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class SecurityTest extends TestCase {

	@Test
	public void testLoginEmptyUserId() {
		String userId = "", password = "Freddy99";
		Security security = new Security();
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
		// assertFalse(actual);   // can also use this assert
	}
	
	@Test
	public void testLoginSpecialCharacter() {
		String userId = "", password = "\r\r\r\r\r\r\r\r";
		Security security = new Security();
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
		// assertFalse(actual);   // can also use this assert
	}

}
