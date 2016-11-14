
public class DartPlayer {
	String player="";
	private int score, darts;
	private final double BULLSEYE=.18, BULL=.72, SSCORE=18.13, TRING=21.94, SSCOREBAD=72.55, DRING=79.99;		//these are the values that have been precalculated
	
	DartPlayer(String name){
		player = name;
	}
	
	public int howManyDarts(){							//Roll dice for amount of darts
		darts = rollDice();
		return darts;
	}
	
	public int score(){									//Check each score
		double gLuck = Math.random()*100;
		if(gLuck<=BULLSEYE)
			return 30;
		else if(gLuck<=BULL && gLuck>BULLSEYE)
			return 15;
		else if(gLuck<=SSCORE && gLuck>BULL)
			return 5;
		else if(gLuck<=TRING && gLuck>SSCORE)
			return 25;
		else if(gLuck<=SSCOREBAD && gLuck>TRING)
			return 2;
		else if(gLuck<=DRING && gLuck>SSCOREBAD)
			return 20;
		else
			return 0;
	}
	
	public int dartsRemaining(int throwNumber, int numDarts){			//remaining darts
		return numDarts - throwNumber;
	}
	
	public void whoWon(int points1, int points2, String name1, String name2){		//check who wins
		System.out.println(name1+": "+points1+"\t"+name2+": "+points2);
		if(points1 > points2)
			System.out.println(name1+" Won!");
		else if(points1 == points2)
			System.out.println("You both lose!");
		else
			System.out.println(name2+" Won!");
	}
	
	private int rollDice(){				//roll dice function that is private to keep code neat
		int num;
		
		num = (int)((Math.random()+(100/6.0)/100)*6);
		
		return num;
	}
}
