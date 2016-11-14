import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DogYears hoi = new DogYears();
		int age, dogy;
		
		System.out.print("Enter an amount of time in dog years: ");
		dogy = sc.nextInt();
		age = hoi.convertToHumanAge(dogy);
		System.out.println(dogy+" dog year(s) is "+age+" human years.");
	}

}
