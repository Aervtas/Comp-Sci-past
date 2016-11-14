import java.util.Scanner;
public class User {
	static public void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Palindrome hoi = new Palindrome();
		String s="";
		
		System.out.println("Enter text to test if it is a palindrome.");
		System.out.print(">> ");
		s = sc.nextLine();
		System.out.println("Is "+s+" a palindrome?   "+hoi.isPalindrome(s));
	}
}
