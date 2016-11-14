import java.util.Scanner;
public class User {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		ExpGrowth hoi = new ExpGrowth();
		
		System.out.print("Enter the a population in millions: ");
		System.out.println("It will be "+hoi.popToYear(sc.nextDouble())+" year(s) for Mexico to be that population.");
	}
}
