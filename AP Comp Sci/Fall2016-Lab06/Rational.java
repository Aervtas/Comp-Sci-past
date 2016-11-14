

//Don't forget to start off by copying the contents of any methods that
//   do not need to change from your Lab05 to this Lab06.


public class Rational {

	private final int numer, denom;

	public Rational(int numerIn, int denomIn) {
		if(denomIn==0)
			throw new ArithmeticException("Divide by Zero");
		numer = numerIn;
		denom = denomIn;
	}

	//The new copy constructor!!!
	public Rational(Rational other) {
		if(other.getDenom()==0)
			throw new ArithmeticException("Divide by Zero");
		numer = other.getNumer();
		denom = other.getDenom();
	}

	public int getNumer() {
		return numer;
	}

	public int getDenom() {
		return denom;
	}

	public String toString() {
		return numer+"/"+denom;
	}

	public Rational reciprocal() {
		if(numer==0)
			throw new ArithmeticException("Divide by Zero");
		return new Rational(denom, numer);
	}


	public static Rational multiply(Rational first, Rational second) {
		if(first.getDenom()==0 || second.getDenom()==0)
			throw new ArithmeticException("Divide by Zero");
		return new Rational(first.getNumer()*second.getNumer(), first.getDenom()*second.getDenom());
	}

	public Rational divide(Rational otherRational) {
		if(getDenom()==0||otherRational.getNumer()==0)
			throw new ArithmeticException("Divide by Zero");
		return new Rational(getNumer()*otherRational.getDenom(),getDenom()*otherRational.getNumer());
	}

	public Rational add(Rational otherRational) {
		return new Rational(getNumer()*otherRational.getDenom()+otherRational.getNumer()*getDenom(), otherRational.getDenom()*getDenom());
	}

	//The new subtract!!!
	public Rational subtract(Rational otherRational) {
		return new Rational(getNumer()*otherRational.getDenom()-otherRational.getNumer()*getDenom(), otherRational.getDenom()*getDenom());
	}
}
