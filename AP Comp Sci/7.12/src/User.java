import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Wut hoi = new Wut();
		int j=-1;
		
		while(j<0){
		System.out.println("Enter a number to get the sum of the digits.");
		System.out.print("Number: ");
		j = sc.nextInt();
		}
		System.out.println("The sum is "+ hoi.sumDigits(j));
	}
}
