import java.util.Scanner;
public class User {
	static public void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Hyppo hoi = new Hyppo();
		int j, k;
		String s1, s2;
		
		System.out.println("Enter positive integers to be stored as strings.");
		System.out.print("String 1 >> ");
		s1 = sc.nextLine();
		System.out.print("String 2 >> ");
		s2 = sc.nextLine();
		j =hoi.testS(s1, s2);
		k =hoi.testI(s1, s2);
		System.out.println("String method comparTo results in: "+j);
		System.out.println("Integer method parseInt results in: "+k);
		if(j == k)
			System.out.println("It is the same.");
		else
			System.out.println("It is not the same.");
	}
}


