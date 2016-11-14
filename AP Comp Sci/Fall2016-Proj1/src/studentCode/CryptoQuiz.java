package studentCode;
import java.util.Scanner;


public class CryptoQuiz {
	//NOTE: You MUST use these named constants.  The submit server will
	//      fail you on the Task 4 tests if you do not use these named
	//      constants in your code but rather use the actual values.
	static int NUM_BITS1 = 80, NUM_BITS2 = 128, NUM_BITS3 = 168;
	static String CRYPT1 = "Skipjack", CRYPT2 = "Rijndael", CRYPT3 = "TripleDES";
		
		
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter 1 to guess a cryptographic system, 2 to guess how many BITs:");
		int a = myScanner.nextInt();
		String lul = "";
		if(a==1){
			System.out.print("Choose number of BITs:");
			a = myScanner.nextInt();
			if(a == NUM_BITS1){
				System.out.println("Which cryptographic system uses "+a+" BITs?");
				lul = myScanner.next();
				if(lul.equals(CRYPT1))
					System.out.println("Correct!");
				else
					System.out.println("Incorrect!");
			}
			else if(a == NUM_BITS2){
				System.out.println("Which cryptographic system uses "+a+" BITs?");
				lul = myScanner.next();
				if(lul.equals(CRYPT2))
					System.out.println("Correct!");
				else
					System.out.println("Incorrect!");
			}
			else if (a == NUM_BITS3){
				System.out.println("Which cryptographic system uses "+a+" BITs?");
				lul = myScanner.next();
				if(lul.equals(CRYPT3))
					System.out.println("Correct!");
				else
					System.out.println("Incorrect!");
			}
			else
				System.out.println("Invalid choice.");
		}
		else if(a==2){
			System.out.print("Choose a cryptographic system:");
			String lel = myScanner.next();
			if(lel.equals(CRYPT1)){
				System.out.println("How many BITs used in a "+lel+" system?");
				a = myScanner.nextInt();
				if(a == NUM_BITS1)
					System.out.println("Correct!");
				else
					System.out.println("Incorrect!");
			}
			else if(lel.equals(CRYPT2)){
				System.out.println("How many BITs used in a "+lel+" system?");
				a = myScanner.nextInt();
				if(a == NUM_BITS2)
					System.out.println("Correct!");
				else
					System.out.println("Incorrect!");
			}
			else if (lel.equals(CRYPT3)){
				System.out.println("How many BITs used in a "+lel+" system?");
				a = myScanner.nextInt();
				if(a == NUM_BITS3)
					System.out.println("Correct!");
				else
					System.out.println("Incorrect!");
			}
			else
				System.out.println("Invalid choice.");
		}
		
		myScanner.close();
	}
}
