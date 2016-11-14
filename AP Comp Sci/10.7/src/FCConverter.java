
public class FCConverter {

	private double temp;
	
	public void setFahrenheit(double degrees) {
		temp = degrees;
		
	}

	public double getCelsius() {
		temp = (5.0/9.0)*(temp - 32.0);
		return temp;
	}

	public void setCelsius(double degrees) {
		temp = degrees;
		
	}

	public double getFahrenheit() {
		temp = temp*(9.0/5.0)+32.0;
		return temp;
	}

}
