
public class RPS {
	public char getRandomRps(){
		char[] rps = {'r', 'r', 'r', 'p', 'p', 'p', 'p', 'p', 's', 's', 's', 's', 's', 's',};
		
		return rps[(int)(Math.random()*14)];
	}
}
