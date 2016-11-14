import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EnumGrades hoi = new EnumGrades();
		EnumGrades.Grade range = null;
		
		System.out.print("Enter the grade to see the range(Aplus, A, Aminus,...): ");
		range = EnumGrades.Grade.valueOf(sc.nextLine());
		hoi.justDoIt(range);
	}

}
