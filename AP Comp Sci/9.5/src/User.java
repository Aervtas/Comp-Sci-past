import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RPS hoi = new RPS();
		
		System.out.println("Press enter to return a character of 'r', 'p', 's'");
		sc.nextLine();
		System.out.println(">> "+hoi.getRandomRps()+" <<");
	}

}
