import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;


public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigFibon hoi = new BigFibon();
		
		System.out.println("Enter how many numbers of the fibonacci sequence you want the computer to go up to.");
		System.out.print(">> ");
		System.out.println(hoi.fibTime(sc.nextInt()));
		
		
	}

}
