
public class Rational {

	//DATA FIELDS SHOULD GO UP HERE
	private int numer=0, denom=0;
	
	//Constructor
	public Rational(int numerIn, int denomIn) {
		//Remove the below line when you are ready to implement this method.
		numer = numerIn;
		denom = denomIn;
	}
	
	
	
	
	//Getters
	public int getNumer() {
		//Remove the below line when you are ready to implement this method.
		return numer;
	}
	
	public int getDenom() {
		//Remove the below line when you are ready to implement this method.
		return denom;
	}
	
	
	
	
	
	
	public String toString() {
		//Remove the below line when you are ready to implement this method.
		return numer+"/"+denom;
	}
	
	
	
	

	public static Rational multiply(Rational a, Rational b) {
		//Remove the below line when you are ready to implement this method.
		return new Rational(a.getNumer()*b.getNumer(), a.getDenom()*b.getDenom());
	}
	
	
	
	
	
	public Rational reciprocal() {
		//Remove the below line when you are ready to implement this method.
		return new Rational(denom, numer);
	}
	
	public Rational divide(Rational a) {
		//Remove the below line when you are ready to implement this method.
		return new Rational(getNumer()*a.getDenom(),getDenom()*a.getNumer());
	}
	
	public Rational add(Rational a) {
		//Remove the below line when you are ready to implement this method.
		return new Rational(getNumer()*a.getDenom()+a.getNumer()*getDenom(), a.getDenom()*getDenom());
	}
	
	
	//NOTE: We are not writing an equals method for this class at this time.
	//      For this reason, do not use assertEquals to try to test whether
	//      two Rational objects are equal in value.
	
}
