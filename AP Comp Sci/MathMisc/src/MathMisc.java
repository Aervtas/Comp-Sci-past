
public class MathMisc {
	
	
	public int max(int x, int y){
		if(x>y)
			return x;
		else
			return y;
	}
	
	public int max(int x, int y, int z){
		if(x>y && x>z){
			return x;
		}
		if(y>x && y>z){
			return y;
		}
		if(z>y && z>x){
			return z;
		}
		else
			return x;
	}
	
	public boolean pfsq(int x){
		double y = Math.sqrt(x);
		Math.round(y);
		return y==x;
	}
}
