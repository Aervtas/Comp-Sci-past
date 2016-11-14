
public class Die {
	
	private int x;
	
	public int getNumDots(){
		return x;
	}
	
	public void roll(){
		int num;
		
		num = (int) (6.0*(Math.random()+.1));
		x = num;
	}
}
