import java.util.Scanner;
public class User {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		CentChange hoi = new CentChange();
		int cents;
		
		System.out.print("Enter an amount in cents: ");
		cents = sc.nextInt();
		hoi.hello(cents);
		hoi.jello(cents);
		hoi.cello(cents);
	}
}
