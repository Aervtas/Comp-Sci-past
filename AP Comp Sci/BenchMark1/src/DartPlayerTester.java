/*Kevin Lin
 * AP Computer Science
 * Period 9
 * Dart Game Benchmark
 * Mrs. Snelson
 */

import java.util.Scanner;

public class DartPlayerTester {
	enum Player {ELITE, CLUB, NOVICE};									//the three tiers of players
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String name1="", name2="";
		int playAgain=0;
		do{
		int darts, throwNum1=0, throwNum2=0, score1=0, score2=0, a, b;
		DartPlayer hoi = null;
		DartPlayer hoi2 = null;
		Player p1, p2;
		
		System.out.print("Enter the name of the first player: ");						//have the player enter their name and tier
		name1 = sc.nextLine();
		System.out.print("Enter the level (ELITE, CLUB, NOVICE) of player 1: ");
		p1 = Player.valueOf(sc.nextLine());
		switch(p1){
			case ELITE: hoi = new ElitePlayer(name1); break;
			case CLUB: hoi = new DartPlayer(name1); break;
			case NOVICE: hoi = new NovicePlayer(name1); break;
		}
		System.out.print("Enter the name of the second player: ");
		name2 = sc.nextLine();
		System.out.print("Enter the level (ELITE, CLUB, NOVICE) of player 2: ");
		p2 = Player.valueOf(sc.nextLine());
		switch(p2){
			case ELITE: hoi2 = new ElitePlayer(name2); break;
			case CLUB: hoi2 = new DartPlayer(name2); break;
			case NOVICE: hoi2 = new NovicePlayer(name2); break;
		}
		darts = hoi.howManyDarts();
		System.out.println(darts+" darts will be used in this game.");
		
		while((hoi.dartsRemaining(throwNum1, darts)!=0) && (hoi2.dartsRemaining(throwNum2, darts)!=0)){			//Loop until there are no more darts left
			throwD1(name1, hoi.dartsRemaining(throwNum1, darts));
			throwNum1++;
			a = hoi.score();
			score1+=a;
			System.out.println("You got a "+a+"! Your total score is "+score1);
			System.out.println("Press Enter to Continue");
			sc.nextLine();
			System.out.println("\n\n\n");
			throwD2(name2, hoi2.dartsRemaining(throwNum2, darts));
			throwNum2++;
			b = hoi2.score();
			score2+=b;
			System.out.println("You got a "+b+"! Your total score is "+score2+"\n\n\n");
			System.out.println("Press Enter to Continue");
			sc.nextLine();
			System.out.println("\n\n\n");
		}
		hoi.whoWon(score1, score2, name1, name2);				//Check who won the game
		System.out.print("Do You Want to Play Again? Enter the Number\n1) Yes\n2) No\n>> ");		//Ask if they want to play again
		playAgain = sc.nextInt();
		}while(playAgain==1);
	}

	private static void throwD1(String name1, int remaining){					//these 2 functions are so I don't have to type the prompts over and over again
		System.out.println(name1);
		System.out.println("-------------------------------------------");
		System.out.print("Darts: ");
		for(int i=0;i<remaining;i++)
			System.out.print("t");
		System.out.print("\n");
		System.out.println("Press Enter to Throw Dart.");
		sc.nextLine();
		
	}
	
	private static void throwD2(String name2, int remaining){
		System.out.println(name2);
		System.out.println("-------------------------------------------");
		System.out.print("Darts: ");
		for(int i=0;i<remaining;i++)
			System.out.print("t");
		System.out.print("\n");
		System.out.println("Press Enter to Throw Dart.");
		sc.nextLine();
	}
	
}