import java.util.Scanner;
public class CoinTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coins hoi;
		
		System.out.print("Enter an amount of cents: ");
		hoi = new Coins(sc.nextInt());
		
		System.out.println("Quarters: "+hoi.getQuarters()+"\tDimes: "+hoi.getDimes()+"\tNickels: "+hoi.getNickels()+"\tPennies: "+hoi.getPennies());
		
	}

}
