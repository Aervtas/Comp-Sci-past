import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		optimusPrime hoi = new optimusPrime();
		int h;
		
		
		System.out.println("Enter a positive number to test whether it is prime or not.");
		System.out.print("Number: ");
		h = sc.nextInt();
		System.out.println("Is "+h+" prime?  Answer: "+hoi.isPrime(h));
	}

}
