import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diploma diploma1, diploma2;
		String a, b;
		
		
		System.out.print("Enter a your name: ");
		a = sc.nextLine();
		System.out.print("Enter the MOOC course taken: ");
		b = sc.nextLine();
		diploma1 = new Diploma(a, b);
		System.out.println(diploma1);
		System.out.println();
		
		System.out.print("Enter a your name: ");
		a = sc.nextLine();
		System.out.print("Enter the MOOC course taken: ");
		b = sc.nextLine();
		diploma2 = new DiplomaWithHonors(a, b);
		System.out.println(diploma2);
		System.out.println();
	}

}
