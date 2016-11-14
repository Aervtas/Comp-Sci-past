import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WutDate hoi = new WutDate();
		String dateStr;
		
		System.out.println("Enter a date in the format [mm/dd/yyy]");
		System.out.print(">> ");
		dateStr = sc.nextLine();
		System.out.println(hoi.dmChange(dateStr)+" is the date and month switched.");
	}
}
