import java.util.ArrayList;
import java.util.Scanner;

public class User {
	
	static public void main(String [] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> hello = new ArrayList<>();
		Duplicates hoi = new Duplicates();
		
		System.out.print("Enter the first string: ");
		hello.add(sc.nextLine());
		System.out.print("Enter the second string: ");
		hello.add(sc.nextLine());
		System.out.print("Enter the third string: ");
		hello.add(sc.nextLine());
		System.out.print("Enter the fourth string: ");
		hello.add(sc.nextLine());
		System.out.print("Enter the fifth string: ");
		hello.add(sc.nextLine());
		System.out.print("Enter the sixth string: ");
		hello.add(sc.nextLine());
		System.out.print("Enter the seventh string: ");
		hello.add(sc.nextLine());
		System.out.print("Enter the eighth string: ");
		hello.add(sc.nextLine());
		System.out.print("Enter the ninth string: ");
		hello.add(sc.nextLine());
		
		System.out.println(hello);
		System.out.println("After removing duplicates");
		hoi.removeConsecutiveDuplicates(hello);
		System.out.println(hoi.getLst());
		
	}
}
