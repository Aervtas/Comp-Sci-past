import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scroll hoi = new Scroll();
		
		System.out.println("Enter a String to Scroll the first letter to the last.");
		System.out.print(">> ");
		System.out.println(hoi.doIt(sc.nextLine()));
		
	}

}
