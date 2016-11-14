package p5_testing;
import static org.junit.Assert.*;

import org.junit.Test;

import p5_martiancubic.MartianCubic;
import p5_utility.DoubleWithAppx;


public class YourTests {
	//SOME EXAMPLE JUNIT TESTS TO GET YOU STARTED THINKING ABOUT 
	//  WRITING JUNIT TESTS
	

	@Test
	public void testDefaultConstructor() {
		MartianCubic testMartianCubic = new MartianCubic();
		assertTrue(testMartianCubic.getA().isZero()
				&& testMartianCubic.getB().isZero()
				&& testMartianCubic.getC().isZero()
				&& testMartianCubic.getD().isZero());
	}
	
	
	
	@Test
	public void testSingleValConstructor() {
		DoubleWithAppx dVal = new DoubleWithAppx(27.8);
				
		MartianCubic testMartianCubic = new MartianCubic(dVal);
		assertTrue(testMartianCubic.getA().isZero()
				&& testMartianCubic.getB().isZero()
				&& testMartianCubic.getC().isZero()
				&& testMartianCubic.getD().equals(dVal));
	}


	
	@Test
	public void testTwoValConstructor() {
		DoubleWithAppx cVal = new DoubleWithAppx(23.2);
		DoubleWithAppx dVal = new DoubleWithAppx(-4.7);
				
		MartianCubic testMartianCubic = new MartianCubic(cVal, dVal);
		assertTrue(testMartianCubic.getA().isZero()
				&& testMartianCubic.getB().isZero()
				&& testMartianCubic.getC().equals(cVal)
				&& testMartianCubic.getD().equals(dVal));
	}


	
	@Test
	public void testThreeValConstructor() {
		DoubleWithAppx bVal = new DoubleWithAppx(15.7);
		DoubleWithAppx cVal = new DoubleWithAppx(-23.7);
		DoubleWithAppx dVal = new DoubleWithAppx(4.3);
				
		MartianCubic testMartianCubic = new MartianCubic(bVal, cVal, dVal);
		assertTrue(testMartianCubic.getA().isZero()
				&& testMartianCubic.getB().equals(bVal)
				&& testMartianCubic.getC().equals(cVal)
				&& testMartianCubic.getD().equals(dVal));
	}


	
	@Test
	public void testFourValConstructor() {
		DoubleWithAppx aVal = new DoubleWithAppx(43.1);
		DoubleWithAppx bVal = new DoubleWithAppx(15.7);
		DoubleWithAppx cVal = new DoubleWithAppx(-23.7);
		DoubleWithAppx dVal = new DoubleWithAppx(4.3);
				
		MartianCubic testMartianCubic = new MartianCubic(aVal, bVal, cVal, dVal);
		assertTrue(testMartianCubic.getA().equals(aVal)
				&& testMartianCubic.getB().equals(bVal)
				&& testMartianCubic.getC().equals(cVal)
				&& testMartianCubic.getD().equals(dVal));
	}


	
	@Test
	public void testCopyConstructor() {
		DoubleWithAppx aVal = new DoubleWithAppx(-19.2);
		DoubleWithAppx bVal = new DoubleWithAppx(24.2);
		DoubleWithAppx cVal = new DoubleWithAppx(-3.2);
		DoubleWithAppx dVal = new DoubleWithAppx(18.7);
		
		MartianCubic testMartianCubic = new MartianCubic(aVal, bVal, cVal, dVal);
		MartianCubic testCopyCubic = new MartianCubic(testMartianCubic);
		
		// Check to be sure they are not aliased!
		assertTrue(testMartianCubic != testCopyCubic);     
		
		assertTrue(testMartianCubic.getA().equals(testCopyCubic.getA())
				&& testMartianCubic.getB().equals(testCopyCubic.getB())
				&& testMartianCubic.getC().equals(testCopyCubic.getC())
				&& testMartianCubic.getD().equals(testCopyCubic.getD()));
		
		assertEquals(testMartianCubic, testCopyCubic);
	}


	
	@Test
	public void testGetters() {
		DoubleWithAppx one = new DoubleWithAppx(1.1);
		DoubleWithAppx two = new DoubleWithAppx(2.2);
		DoubleWithAppx three = new DoubleWithAppx(3.3);
		DoubleWithAppx four = new DoubleWithAppx(4.4);
		
		MartianCubic p = new MartianCubic(one, two, three, four);

		assertTrue(p.getA().equals(one));
		assertTrue(p.getB().equals(two));
		assertTrue(p.getC().equals(three));
		assertTrue(p.getD().equals(four));
	}


	

	//You need to implement at least three of the JUnit tests below.
	//  We encourage you to implement more as part of your regular
	//  testing of your project.
	
	@Test
	public void testAdd() {
	}

	@Test
	public void testSubtract() {
		
	}

	@Test
	public void testGlorp() {
		
	}

	@Test
	public void testSplee() {
		
	}

	@Test
	public void testCliff() {
		MartianCubic hoi = new MartianCubic(new DoubleWithAppx(-41.7), new DoubleWithAppx(-23.3), new DoubleWithAppx(37), new DoubleWithAppx(8));
		System.out.println(hoi.toString());
	}

	@Test
	public void testCompareTo() {
	}

	
}
