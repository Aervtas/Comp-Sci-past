import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WhyComment hoi = new WhyComment();
		
		System.out.println("Enter text with comments (/* or */) that will be taken out.");
		System.out.print(">> ");
		System.out.println(hoi.doIt(sc.nextLine()));
	}

}
