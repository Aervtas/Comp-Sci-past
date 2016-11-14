import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mellow hoi = new Mellow();
		String s = "My mama is mad about making amazing mashed marshmallows!";
		String q = "ma";
		
		System.out.print("Enter a string: ");
		s = sc.nextLine();
		System.out.print("Enter a string to be searched for: ");
		q = sc.nextLine();
		
		System.out.println("The characters appeared "+hoi.melCount(q.toLowerCase(), s.toLowerCase())+" times.");
		
	}

}
