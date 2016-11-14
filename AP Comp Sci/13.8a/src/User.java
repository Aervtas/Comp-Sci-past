import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Digits hoi = new Digits();
		
		System.out.print("Enter a number to get a sum of the digits: ");
		System.out.println(hoi.sumDigits(sc.nextInt()));
	}

}
