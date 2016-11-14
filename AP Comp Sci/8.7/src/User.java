import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Names hoi = new Names();
		
		System.out.println("Enter your name in the format (von Neumann, John)");
		System.out.print(">> ");
		System.out.println(hoi.convertName(sc.nextLine()));
	}

}
