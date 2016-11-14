
public class User {

	public static void main(String[] args) {
		Limerick lim = new Limerick();
		Haiku hai = new Haiku();

		System.out.println("The number of lines in a Haiku: "+hai.numLines());
		System.out.println("The number of lines in a Limerick: "+lim.numLines());
		
		System.out.println("\nRhythm:");
		lim.printRhythm();

		System.out.print("\nThe syllables in a haiku: ");
		for(int i=1; i<4; i++)
			System.out.print(hai.getSyllables(i)+" ");
		System.out.print("\nThe syllables in a limerick: ");
		for(int i=1; i<6; i++)
			System.out.print(lim.getSyllables(i)+" ");
	}

}
