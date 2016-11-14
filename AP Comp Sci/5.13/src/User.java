import java.util.Scanner;

public class User {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		QuadraticFunction hoi;
		System.out.println("Enter integers for abc values of ax^2+bx+c");
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
		System.out.print("C: ");
		c = sc.nextInt();
		hoi = new QuadraticFunction(a, b, c);
		System.out.println("The first zero is: "+hoi.calcPos());
		System.out.println("The second zero is: "+hoi.calcNeg());
	}
}
