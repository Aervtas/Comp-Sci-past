import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socs hoi = new Socs();
		String s;
		
		System.out.println("Enter your social security number in this format (ddd-dd-dddd)");
		System.out.print(">> ");
		s = sc.nextLine();
		System.out.println(hoi.removeDashes(s)+" is your social security number without the dashes.");
	}
}
