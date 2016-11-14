import java.util.Scanner;

public class StopMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		String first="",last="";
		int c=0;
		while(!input.equals("STOP")){
			c++;
			if(input.compareTo(first)<0)
				first = input;
			if(input.compareTo(last)>0)
				last = input;
			input = sc.next();
		}
		
	}

}
