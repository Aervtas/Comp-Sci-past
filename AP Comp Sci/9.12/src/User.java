import java.util.Scanner;

public class User {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Scrabble hoi = new Scrabble();
		
		System.out.println("Enter a word to find the score of it in Scrabble.");
		System.out.print(">> ");
		int n = hoi.computeScore(sc.nextLine());
		System.out.println("Score: "+n);
	}
}
