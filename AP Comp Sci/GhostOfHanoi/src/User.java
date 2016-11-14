import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hanoi hoi = new Hanoi();
		int a=0;
		
		System.out.println("Enter the amount of disks for on the tower of hanoi for the computer to solve.");
		System.out.print(">> ");
		a = sc.nextInt();
		if(a%2==0)
			hoi.evenTrouble(a, 1, 2, 3);
		else
			hoi.oddOnTheDouble(a,1,2,3);

	}

}
