import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person hoi, hoi2;
		String f,l;
		
		System.out.println("Enter someone's name.");
		System.out.print("First Name: ");
		f = sc.nextLine();
		System.out.print("Last Name: ");
		l = sc.nextLine();
		System.out.println(f+" "+l);
		hoi = new Person(f,l);
		System.out.println("Enter someone's name.");
		System.out.print("First Name: ");
		f = sc.nextLine();
		System.out.print("Last Name: ");
		l = sc.nextLine();
		System.out.println(f+" "+l);
		hoi2 = new Person(f,l);
		
		int a = hoi.compareTo(hoi2);
		
		if(a < 0)
			System.out.println(hoi+" goes before "+hoi2);
		if(a > 0)
			System.out.println(hoi+" goes after "+hoi2);
		if(a==0)
			System.out.println("They have the same name.");
	}

}
