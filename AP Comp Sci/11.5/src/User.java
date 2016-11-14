import java.util.ArrayList;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		ArrayList<String> hoi = new ArrayList<>();
		Reverse rev = new Reverse();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first String: ");
		hoi.add(sc.nextLine());
		System.out.print("Enter the Second String: ");
		hoi.add(sc.nextLine());
		System.out.print("Enter the Third String: ");
		hoi.add(sc.nextLine());
		
		System.out.println(hoi);
		System.out.println("Reverse:");
		System.out.println(rev.doIt(hoi));
		
	}

}
