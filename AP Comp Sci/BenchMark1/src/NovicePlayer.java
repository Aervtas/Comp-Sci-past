//Novice player that misses dart board 50% of the time

public class NovicePlayer extends DartPlayer{
	
	private final double BULLSEYE=.11, BULL=.45, SSCORE=11.33, TRING=13.71, SSCOREBAD=45.34, DRING=49.99;
	
	NovicePlayer(String name){
		super(name);
	}
	
	public int score(){
		double gLuck = Math.random()*100;
		if(gLuck<=BULLSEYE)
			return 31;
		else if(gLuck<=BULL && gLuck>BULLSEYE)
			return 16;
		else if(gLuck<=SSCORE && gLuck>BULL)
			return 6;
		else if(gLuck<=TRING && gLuck>SSCORE)
			return 26;
		else if(gLuck<=SSCOREBAD && gLuck>TRING)
			return 3;
		else if(gLuck<=DRING && gLuck>SSCOREBAD)
			return 21;
		else
			return 0;
	}
}
