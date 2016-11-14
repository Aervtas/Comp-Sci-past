import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ISBN hoi = new ISBN();
		String s;
		
		System.out.println("Enter an ISBN code to test if it is valid.");
		System.out.print(">> ");
		s = sc.nextLine();
		System.out.println("Is "+s+" an ISBN number?    "+hoi.isValidISBN(s));
	}

}
