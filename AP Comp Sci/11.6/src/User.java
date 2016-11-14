import java.util.ArrayList;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> hello = new ArrayList<>();
		Smallest hoi = new Smallest();
		
		System.out.print("Enter first integer: ");
		hello.add(sc.nextInt());
		System.out.print("Enter second integer: ");
		hello.add(sc.nextInt());
		System.out.print("Enter third integer: ");
		hello.add(sc.nextInt());
		System.out.print("Enter fourth integer: ");
		hello.add(sc.nextInt());
		System.out.print("Enter fifth integer: ");
		hello.add(sc.nextInt());
		
		System.out.println(hello);
		System.out.println("The smallest taken out.");
		System.out.println(hoi.sremove(hello));
	}

}
