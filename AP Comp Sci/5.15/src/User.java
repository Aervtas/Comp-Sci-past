import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TenSwap hoi;
		int i;
		
		System.out.print("Enter an integer: ");
		i = sc.nextInt();
		hoi = new TenSwap(i);
		System.out.println("The swapped number is "+hoi.swap());
	}

}
