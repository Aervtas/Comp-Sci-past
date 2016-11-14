//Elite player that does not miss the dart board

public class ElitePlayer extends DartPlayer{
	
	private final double BULLSEYE=.23, BULL=.91, SSCORE=22.68, TRING=27.44, SSCOREBAD=90.7, DRING=100;
	
	public ElitePlayer(String name){
		super(name);
	}
	
	public int score(){
		double gLuck = Math.random()*100;
		if(gLuck<=BULLSEYE)
			return 29;
		else if(gLuck<=BULL && gLuck>BULLSEYE)
			return 14;
		else if(gLuck<=SSCORE && gLuck>BULL)
			return 4;
		else if(gLuck<=TRING && gLuck>SSCORE)
			return 24;
		else if(gLuck<=SSCOREBAD && gLuck>TRING)
			return 1;
		else if(gLuck<=DRING && gLuck>SSCOREBAD)
			return 19;
		else
			return 0;
	}
}
