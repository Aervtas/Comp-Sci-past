
public class Limerick extends Poem{

	private int[] l = {9, 9, 6, 6, 9};
	
	public int numLines() {
		return 5;
	}

	
	public int getSyllables(int k) {
		return l[k-1];
	}
	
	public void printRhythm() {
		super.printRhythm();
	}
}
