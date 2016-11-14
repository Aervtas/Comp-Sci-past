package study;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Temp hoi = new Temp();
		String c = "";
		Double n;
		
		System.out.print("Enter F for Fahrenheit or C for Celcius: ");
		c = sc.next();
		System.out.print("Temp: ");
		n = sc.nextDouble();
		
		if(c.equals("F")){
			System.out.println("The temperature in Celsius: "+hoi.FtoC(n));
		}
		else if(c.equals("C")){
			System.out.println("The temperature in Fahrenheit: "+hoi.CtoF(n));
		}
		else
			System.out.println("Not a valid option.");
	}

}
