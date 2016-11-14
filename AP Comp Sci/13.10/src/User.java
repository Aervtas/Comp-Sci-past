import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Numbers hoi = new Numbers();
		int a, b;
		
		
		System.out.print("Enter an integer: ");
		a = sc.nextInt();
		System.out.print("Enter another integer: ");
		b = sc.nextInt();
		
		System.out.println("The greatest common factor is "+hoi.gcf(a, b));
	}

}
