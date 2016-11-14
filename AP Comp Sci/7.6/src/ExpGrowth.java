
public class ExpGrowth {
	private double year;
	
	public double popToYear(double pop){
		year = Math.log((pop/123.8))/Math.log(1.5);
		return year;
	}
}
