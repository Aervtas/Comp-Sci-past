import java.util.Scanner;

public class User {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		MoneyCalc hoi = new MoneyCalc();
		
		System.out.print("Enter the number of Jars: ");
		double i = hoi.computeShippingCost(sc.nextInt());
		System.out.println("The shipping and jars will cost $"+i); 
	}
}
