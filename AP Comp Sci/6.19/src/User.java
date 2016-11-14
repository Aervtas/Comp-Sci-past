import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fit hoi = new Fit();
		int a, b, c;
		
		System.out.print("Size of file 1: ");
		a = sc.nextInt();
		System.out.print("Size of file 2: ");
		b = sc.nextInt();
		System.out.print("Size of space left: ");
		c = sc.nextInt();
		a = hoi.findBestFit(a, b, c);
		switch(a){
			case(0):System.out.println("Neither files fit on the card.");
					break;
			case(1):System.out.println("Only file 1 fits on the card.");
					break;
			case(2):System.out.println("Only file 2 fits on the card.");
					break;
			case(3):System.out.println("Both files fit on the card.");
					break;
			default:System.out.println("Congrajualtions on breaking the program. Unless you didn't enter anything there is no way to get to this text.");
		}
	}

}
