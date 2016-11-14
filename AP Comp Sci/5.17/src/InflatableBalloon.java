import java.awt.Color;

public class InflatableBalloon extends Balloon{
	
	
	public void inflate(int percentage){
		int r = getRadius();
		double p = 1+(percentage/100.0);
		
		setRadius((int) Math.pow(p*Math.pow(r, 3), (.333)));
	}
}