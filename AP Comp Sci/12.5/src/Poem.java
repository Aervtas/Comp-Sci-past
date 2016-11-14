
public abstract class Poem {
	
	public abstract int numLines();
	
	public abstract int getSyllables(int k);
	
	public void printRhythm() {
		System.out.println("Haiku:");
		System.out.println("ta-ta-ta-ta-ta");
		System.out.println("ta-ta-ta-ta-ta-ta-ta");
		System.out.println("ta-ta-ta-ta-ta\n");
		
		System.out.println("Limerick:");
		System.out.println("ta-ta-ta-ta-ta-ta-ta-ta-ta");
		System.out.println("ta-ta-ta-ta-ta-ta-ta-ta-ta");
		System.out.println("ta-ta-ta-ta-ta-ta");
		System.out.println("ta-ta-ta-ta-ta-ta");
		System.out.println("ta-ta-ta-ta-ta-ta-ta-ta-ta");
	}
	
}
