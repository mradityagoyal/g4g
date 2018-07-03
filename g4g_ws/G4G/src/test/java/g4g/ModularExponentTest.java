package g4g;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ModularExponentTest {
	
	@Test
	public void testPower() {
		
		assertEquals("2^3 is 8", 8, ModularExponent.pow(2, 3, 1));
		assertEquals("5^3 is 8", 125, ModularExponent.pow(5, 3, 1));
		
		assertEquals("2^3 is 8", 8, ModularExponent.powIter(2, 3));
		assertEquals("5^4 is 8", 625, ModularExponent.powIter(5, 4));
	}
	
	public void testModExp() {
		assertEquals("2^3%5 == 3 ", 3, ModularExponent.modExp(2, 3, 5));
		assertEquals("2^5%13 == 6 ", 3, ModularExponent.modExp(2, 5, 13));
	}

}
