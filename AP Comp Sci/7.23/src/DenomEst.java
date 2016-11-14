
public class DenomEst {
	final double h=17.0/76;
	
	public double highEst(){
		double est = 0;
		double i;
		for(i=100; i>0 ; i-=1){
			est = 1.0 / i;
			if(est>=h)
				return i;
		}
		return i;
	}
	
	public double lowEst(){
		double est = 0.0;
		double i;
		for(i=1; i<100 ; i+=1){
			est = 1.0 / i;
			if(est<h){
				return i;
			}
		}
		return i;
	}
}
