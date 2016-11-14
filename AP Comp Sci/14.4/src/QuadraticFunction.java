import java.util.Comparator;

public class QuadraticFunction implements Comparable<QuadraticFunction>, Comparator<QuadraticFunction>{
	
	private int a ,b,c;
	
	public QuadraticFunction(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double valueAt(double x){
		return a*Math.pow(x, 2)+b*x+c;
	}
	
	public String toString(){
		if(a == 1)
			return "x^2+"+b+"x+"+c;
		if(a == -1)
			return "-x^2+"+b+"x+"+c;
		return a+"x^2+"+b+"x+"+c;
	}
	
	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
	public int getC(){
		return c;
	}
	
	public boolean equals(QuadraticFunction a, QuadraticFunction b){
		if(a.getA()==b.getA() && a.getB()==b.getB() && a.getC()==b.getC())
			return true;
		else
			return false;
	}

	public int compareTo(QuadraticFunction arg0) {
		if(arg0.a == a)
			if(arg0.b == b)
				if(arg0.c == c)
					return 0;
		return 1;
	}

	@Override
	public int compare(QuadraticFunction o1, QuadraticFunction o2) {
		
		return 0;
	}
}
