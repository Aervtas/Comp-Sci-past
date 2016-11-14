import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DogYears hoi = new DogYears();
		int age, dogy;
		
		System.out.println("Enter 1 for Human to Dog years conversion.");
		System.out.println("Enter 2 for Dog to Human years conversion.");
		System.out.print("> ");
		age = sc.nextInt();
		if(age == 2){
			System.out.print("Enter an amount of time in dog years: ");
			dogy = sc.nextInt();
			age = hoi.convertToHumanAge(dogy);
			System.out.println(dogy+" dog year(s) is "+age+" human years.");
		}
		else if(age == 1){
			System.out.print("Enter an amount of time in human years: ");
			dogy = sc.nextInt();
			age = hoi.convertToDogAge(dogy);
			System.out.println(dogy+" human year(s) is "+age+" dog years.");
			}
		else
			System.out.println("That is not valid.");
	}

}
