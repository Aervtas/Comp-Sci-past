package testingCode;
import org.junit.Test;
import junit.framework.TestCase;


public class SampleTests extends TestCase {
	
	@Test
	public void isItSafe() {
		assertTrue(studentCode.CryptoCode.safeToUse("CMSC131"));
	}
	
	@Test
	public void testRotate31() {
		String plaintext = "CMSC 131";
		String ciphertext = "$.4$?PRP";
		assertEquals(
			ciphertext,
			studentCode.CryptoCode.rot31(plaintext)
		);
	}
		
	@Test
	public void testCaesar() {
		String plaintext = "Computer Science";
		int shift = 131;
		String ciphertext = "JVTW\\[LY\'ZJPLUJL";

		assertEquals(
			ciphertext,
			studentCode.CryptoCode.toCaesar(plaintext, shift)
		);
	}

	@Test
	public void testBellaso() {
		String plaintext = "Computer Science";
		String keyword = "CMSC131";
		String ciphertext = "(>B5()V7MH(ZX!(4";

		assertEquals(
			ciphertext,
			studentCode.CryptoCode.toBellaso(plaintext, keyword)
		);
	}

	
	

}
