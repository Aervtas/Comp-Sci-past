import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Orders hoi = new Orders();
		int a,b;
		
		System.out.print("Enter the amount of \"Be Prepared\" books you want: ");
		a = sc.nextInt();
		System.out.print("Enter the amount of \"Next Best\" books you want: ");
		b = sc.nextInt();
		System.out.println("The order total is $"+Math.round(hoi.getOrderTotal(a, b)*100)/100.0);
	}

}
