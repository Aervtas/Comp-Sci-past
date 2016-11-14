package studentCode;

import java.util.Scanner;

public class MaxOfTwoV2 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int first = myScanner.nextInt();
		int second = myScanner.nextInt();
		
		if(first>second)
			System.out.println(first+" is greater than "+second);
		else if(second>first)
			System.out.println(second+" is greater than "+first);
		else
			System.out.println(first+" is equal to "+second);
		myScanner.close();
	}
	
	
}
