
public class FancyWord {

	private String word;  // the word that this FancyWord currently represents

	/* Create a FancyWord based on an existing String */
	public FancyWord(String wordIn) {
		word = wordIn;
	}

	/* Change the word so that the letters are reversed.  
	 * 
	 * We start with an empty string, then concatenate the letters from the 
	 * original word one by one starting from the right and working our way 
	 * to the left.*/
	public void reverse() {
			String newWord = "";
			for (int i = word.length() - 1; i > 0; i--) {				newWord += word.charAt(i);
				char newChar = word.charAt(i);
				newWord += newChar;
			}
			word = newWord;
	}

 
	/* Change the word by shifting all of the letters to the right one spot.
	 * The character that was on the right-end will be moved to the left end.
	 * 
	 * We start with a String consisting of just the LAST character from the
	 * original word.  Then we concatenate the other letters from the original
	 * word one by one.  */
	public void shiftRight() {
		String newWord = "" + word.charAt(word.length() - 1);
		for (int i = 0; i < word.length() - 1; i++) {
			char newChar = word.charAt(i);
			newWord += newChar;
		}
		word = newWord;
	}

	/* Change the word by shifting all of the letters to the left one spot.
	 * The character that was on the left-end will be moved to the right end.
	 * 
	 * We start with an empty String and concatenate the letters from the
	 * original word one by one starting with the second letter.  Then we
	 * concatenate the first letter from the original word. */
	public void shiftLeft() {
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			char newChar = word.charAt(i);
			newWord += newChar;
		}
		newWord += word.charAt(0);
		word = newWord;
	}
 

	/* This method will normally return the parameter, but it will return '4' 
	 * if the parameter is 'A' or 'a'; it will return '3' if the parameter is 
	 * 'E' or 'e'; it will return '6' if the parameter is 'g' or 'G'; it will 
	 * return '7' if the parameter is 'T' or 't'.
	 */
	private static char translateCharacter(char c) {
		if (c == 'a' || c == 'A'){
			c = '4';
		if (c == 'e' || c == 'E')
			c = '3'; }
		if (c == 'g' || c == 'G')
			c = '6';
		if (c == 'T' || c == 't')
			c = '7';
		
		return c;
	}
	
	/* Change the word by replacing all of the Es with 3s, replacing all
	 * of the As with 4s, all of the Gs with 6s, and all of the Ts with 7s. 
	 */
	public void translateToGamerSpeak() {
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			char newChar = translateCharacter(c);
			newWord += newChar;
		}
		word = newWord;
	}


	/* Returns the String that this FancyWord currently represents */
	public String toString() {
		return word;
	}
}


