import static org.junit.Assert.*;

import org.junit.Test;


public class TestingFancyWord {

	@Test
	public void testConstructor() {
		FancyWord testWord = new FancyWord("hamster");
		assertEquals("hamster", testWord.toString());
	}

	@Test
	public void testReverse() {
		FancyWord testWord = new FancyWord("hamster");
		testWord.reverse();
		assertEquals("retsmah", testWord.toString());
	}

	@Test
	public void testShiftRight() {
		FancyWord testWord = new FancyWord("hamster");
		testWord.shiftRight();
		assertEquals("rhamste", testWord.toString());
	}

	@Test
	public void testShiftLeft() {
		FancyWord testWord = new FancyWord("hamster");
		testWord.shiftLeft();
		assertEquals("amsterh", testWord.toString());
	}

	@Test
	public void testTranslateToGamerSpeak() {
		FancyWord testWord = new FancyWord("hamster");
		testWord.translateToGamerSpeak();
		assertEquals("h4ms73r", testWord.toString());
	}





	@Test
	public void testCornerCase1() {
		FancyWord testWord = new FancyWord("aAeE");
		testWord.translateToGamerSpeak();
		assertEquals("4433", testWord.toString());
	}



	@Test
	public void testCornerCase2_1() {
		FancyWord testWord = new FancyWord("");
		testWord.reverse();
		assertEquals("", testWord.toString());
	}

	@Test
	public void testCornerCase2_2() {
		FancyWord testWord = new FancyWord("");
		testWord.shiftLeft();
		assertEquals("", testWord.toString());
	}

	@Test
	public void testCornerCase2_3() {
		FancyWord testWord = new FancyWord("");
		testWord.shiftRight();
		assertEquals("", testWord.toString());
	}

	@Test
	public void testCornerCase2_4() {
		FancyWord testWord = new FancyWord("");
		testWord.translateToGamerSpeak();
		assertEquals("", testWord.toString());
	}












	@Test
	public void testCornerCase3_1() {
		FancyWord testWord = new FancyWord(null);
		testWord.reverse();
		assertEquals(null, testWord.toString());
	}

	@Test
	public void testCornerCase3_2() {
		FancyWord testWord = new FancyWord(null);
		testWord.shiftLeft();
		assertEquals(null, testWord.toString());
	}

	@Test
	public void testCornerCase3_3() {
		FancyWord testWord = new FancyWord(null);
		testWord.shiftRight();
		assertEquals(null, testWord.toString());
	}

	@Test
	public void testCornerCase3_4() {
		FancyWord testWord = new FancyWord(null);
		testWord.translateToGamerSpeak();
		assertEquals(null, testWord.toString());
	}






}

//Copyright 2010-2016 : Evan Golub 


