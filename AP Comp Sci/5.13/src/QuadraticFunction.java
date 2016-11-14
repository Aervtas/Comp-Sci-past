
public class QuadraticFunction {
	
	private int bT, aT;
	double x;
	
	public QuadraticFunction(int a, int b, int c){
		x = Math.sqrt(Math.pow(b, 2) - (4*a*c));
		bT = b;
		aT = a;
	}
	
	public double calcPos(){
		return ((-bT)+x)/(2*aT);
	}
	
	public double calcNeg(){
		return ((-bT)-x)/(2*aT);
	}
}
