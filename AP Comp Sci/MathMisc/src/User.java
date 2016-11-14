import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MathMisc hoi = new MathMisc();
		int i, a, b;
		
		System.out.println("Choose an option:\n2)\t2 integer comparison\n3)\t3 integer comparison\n4)\tPerfect Square check");
		System.out.print("Enter a number: ");
		i = sc.nextInt();
		switch(i){
			case(2): System.out.print("Enter 2 numbers\n> ");
					 i = sc.nextInt();
					 System.out.print("> ");
					 a = sc.nextInt();
					 System.out.println(hoi.max(i, a)+" is greater.");
					 break;
			case(3): System.out.print("Enter 3 numbers\n> ");
					 i = sc.nextInt();
					 System.out.print("> ");
					 a = sc.nextInt();
					 System.out.print("> ");
					 b = sc.nextInt();
					 System.out.print("> ");
					 System.out.println(hoi.max(i, a, b)+" is greatest.");
					 break;
			case(4): System.out.print("Enter 1 number: ");
					 System.out.println("It is "+hoi.pfsq(sc.nextInt())+" that this number is a perfect square.");
					 break;
			default: System.out.println("That is not a valid option.");
					 break;
		}
	}

}
