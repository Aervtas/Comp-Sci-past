import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="";
		int min;
		LunchTime hoi = new LunchTime();
		
		
		System.out.println("Enter the time in the format hh:mm");
		System.out.print("> ");
		s = sc.nextLine();
		int i = s.indexOf(":");
		int hours = Integer.parseInt(s.substring(0, i));
		int mins = Integer.parseInt(s.substring(i+1));
		min = hoi.minutesUntilLunch(hours, mins);
		System.out.println("There are "+min+" minutes left before lunch.");
	}

}
