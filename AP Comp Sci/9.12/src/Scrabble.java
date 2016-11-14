
public class Scrabble {
	public int computeScore(String word){
		String letter = "abcdefghijklmnopqrstuvwxyz";
		int[] scores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
		int sum=0;
		
		word = word.toLowerCase();
		
		for(int i=0; i<word.length(); i++){
			sum += scores[letter.indexOf(word.substring(i, i+1))];
		}
		
		return sum;
	}
}
