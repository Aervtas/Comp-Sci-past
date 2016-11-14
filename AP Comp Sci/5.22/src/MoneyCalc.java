
public class MoneyCalc {
	public double computeShippingCost(int nJars){
		int nCartons = (nJars + 11) / 12;
		int totalOunces = (nJars*21) + nCartons*25;
		int lbs = (int) (totalOunces/16.0 + .99);
		return nCartons*1.44 + .96*lbs + 3;
	}
}
