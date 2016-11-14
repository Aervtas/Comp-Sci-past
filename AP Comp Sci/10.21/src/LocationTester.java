import java.util.Scanner;
public class LocationTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		Location hoi, hoi2;
		Distance yo = new Distance();
		
		System.out.print("Enter the row of location 1: ");
		row = sc.nextInt();
		System.out.print("Enter the row of location 1: ");
		col = sc.nextInt();
		hoi = new Location(row, col);
		System.out.print("Enter the row of location 2: ");
		row = sc.nextInt();
		System.out.print("Enter the row of location 2: ");
		col = sc.nextInt();
		hoi2 = new Location(row, col);
		
		System.out.println("The shortest distance for the 2 locations is "+yo.distance(hoi, hoi2)+" units");
	}

}
