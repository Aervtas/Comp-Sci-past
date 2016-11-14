import java.util.Scanner;
import java.util.ArrayList;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Buckets hoi = new Buckets();
		ArrayList<String> words = new ArrayList<>();
		String k="";

		System.out.println("Enter words until you are done, then enter a blank.");
		
		while(true){
			System.out.print(">>");
			k = sc.nextLine();

			if(k.isEmpty())
				break;

			words.add(k);
		}
		
		//for(int i=0; i>26; i++)
			System.out.println(hoi.wut(words));

	}

}
