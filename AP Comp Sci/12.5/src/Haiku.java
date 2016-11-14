
public class Haiku extends Poem{

	private int[] h = {5, 7, 5};
	
	public int numLines() {
		return 3;
	}

	
	public int getSyllables(int k) {
		return h[k-1];
	}
	
	public void printRhythm() {
		super.printRhythm();
	}
}
