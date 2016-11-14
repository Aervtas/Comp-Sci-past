package studentCode;

import java.util.Scanner;

public class MaxOfTwoV1 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int first = myScanner.nextInt();
		int second = myScanner.nextInt();
		
		if(first>second)
			System.out.println(first+" is greater than "+second);
		else
			System.out.println(second+" is greater than or equal to "+first);
		
		myScanner.close();
	}
	
	
}
