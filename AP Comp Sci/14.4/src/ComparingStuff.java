import java.util.Comparator;

public class ComparingStuff implements Comparator<QuadraticFunction>{

	
	private double x=0;
	
	public ComparingStuff(double a){
		x = a;
	}
	
	@Override
	public int compare(QuadraticFunction o1, QuadraticFunction o2) {
		if(o1.valueAt(x) > o2.valueAt(x))
			return 1;
		if(o1.valueAt(x) < o2.valueAt(x))
			return -1;
		return 0;
	}
	
	public String toString(){
		return "The ";
	}

}
