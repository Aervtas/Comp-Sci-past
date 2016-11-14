import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Checker hoi = new Checker();
		int h;
		
		System.out.print("Enter the dimensions of the checkerboard: ");
		h = sc.nextInt();
		hoi.board(h);
	}

}
