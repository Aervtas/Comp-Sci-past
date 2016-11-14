import java.util.Scanner;
public class User {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		perfSq hoi = new perfSq();
		int h;
		
		System.out.println("Find out whether a number is a perfect square.");
		System.out.print("Number: ");
		h = sc.nextInt();
		System.out.println("Is "+h+" a perfect square? "+hoi.isPerfectSquare(h));
	}
}
