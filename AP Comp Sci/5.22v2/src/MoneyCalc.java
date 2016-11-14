
public class MoneyCalc {
	
	public double computeShippingCost(int nJars){
		double price=0;
		
		if(nJars<=10){
			price += nJars*3.0;
		}
		else if(nJars<=30){
			price += nJars*2.0;
		}
		else
			price += nJars*1.5;
		
		return price;
	}
}
