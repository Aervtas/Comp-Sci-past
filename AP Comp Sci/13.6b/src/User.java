import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CountingStars hoi = new CountingStars();
		
		System.out.print("Enter the number of stars on the top row: ");
		System.out.println(hoi.printTriangle(sc.nextInt()));
	}

}
