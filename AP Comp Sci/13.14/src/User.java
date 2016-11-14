import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReFibon hoi = new ReFibon();
		
		
		System.out.print("Enter the n-th Fibonacci number you want to find: ");
		System.out.println("#: "+hoi.fibonacci(sc.nextInt()));
		

	}

}
