package studentCode;

import java.util.Scanner;

public class MultilingualGreetings {
	private static String greetingString;
	

	//CODE ABOVE HERE IS GIVEN TO YOU - DO NOT ALTER IT
	//YOUR CODE SHOULD USE THE ABOVE VARIABLE 

	
	
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		
		
		//YOUR CODE IN HERE - THE COMMENTS ARE THERE TO HELP GUIDE YOU

		
		//Ask what language they would like to use.

		System.out.println("1) English   2) Espanol   3) Francais:");
		//Based on the language selected above, set the greetingString 
		//  variable in that language.
		int i = myScanner.nextInt();
		//YOUR CODE IN HERE
		switch(i){
			case 1: greetingString = "Hello World!";break;
			case 2: greetingString = "Hola Mundo!";break;
			case 3: greetingString = "Bonjour le Monde!";break;
			default: greetingString = "###########";break;
		}
		
		
		//Now, we'll print out the greeting...
		System.out.println(greetingString);
		
		myScanner.close();
	}
}
