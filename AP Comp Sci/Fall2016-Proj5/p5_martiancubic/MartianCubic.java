package p5_martiancubic;

import p5_utility.DoubleWithAppx;

/**
 * A general representation of a Martian Cubic of the form:
 *     (a*x^3 + b*x^2 + c*x + d)
 * 
 * @author Evan Golub
 * @date August-October 2016
 */

public class MartianCubic {
	private final DoubleWithAppx a;
	private final DoubleWithAppx b;
	private final DoubleWithAppx c;
	private final DoubleWithAppx d;

	public MartianCubic() {
		a=DoubleWithAppx.ZERO;
		b=DoubleWithAppx.ZERO;
		c=DoubleWithAppx.ZERO;
		d=DoubleWithAppx.ZERO;
	}

	public MartianCubic(DoubleWithAppx dIn) {
		a=DoubleWithAppx.ZERO;
		b=DoubleWithAppx.ZERO;
		c=DoubleWithAppx.ZERO;
		d=dIn;
	}

	public MartianCubic(DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a=DoubleWithAppx.ZERO;
		b=DoubleWithAppx.ZERO;
		c=cIn;
		d=dIn;
	}

	public MartianCubic(DoubleWithAppx bIn, DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a=DoubleWithAppx.ZERO;
		b=bIn;
		c=cIn;
		d=dIn;
	}

	public MartianCubic(DoubleWithAppx aIn, DoubleWithAppx bIn, DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a=aIn;
		b=bIn;
		c=cIn;
		d=dIn;
	}

	public MartianCubic(MartianCubic other) {
		a=other.getA();
		b=other.getB();
		c=other.getC();
		d=other.getD();
	}

	public DoubleWithAppx getA() {
		return a;
	}

	public DoubleWithAppx getB() {
		return b;
	}

	public DoubleWithAppx getC() {
		return c;
	}

	public DoubleWithAppx getD() {
		return d;
	}





	public DoubleWithAppx eval(DoubleWithAppx x) {
		//I disapprove of this, but instructions said to chain
		return (((getA().multiply(x.power(3))).add(getB().multiply(x.power(2)))).add(getC().multiply(x))).add(getD());
	}


	public MartianCubic add(MartianCubic martianCubicIn) {
		return new MartianCubic(getA().add(martianCubicIn.getA()), getB().add(martianCubicIn.getB()), getC().add(martianCubicIn.getC()), getD().add(martianCubicIn.getD()));
	}

	public MartianCubic subtract(MartianCubic martianCubicIn) {
		return new MartianCubic(getA().subtract(martianCubicIn.getA()), getB().subtract(martianCubicIn.getB()), getC().subtract(martianCubicIn.getC()), getD().subtract(martianCubicIn.getD()));
	}



	public MartianCubic glorp(MartianCubic martianCubicIn) {
		if(!((getA().multiply(martianCubicIn.getB())).add(getB().multiply(martianCubicIn.getA()))).isZero())
			return null;
		return new MartianCubic(getA().multiply(martianCubicIn.getA()),
							   (getC().multiply(martianCubicIn.getB())).add(getB().multiply(martianCubicIn.getA())).add(getA().multiply(getD())),
							   (getC().multiply(martianCubicIn.getA())).add(getB().multiply(getD())),
							   getC().multiply(getD()).multiply(martianCubicIn.getC().multiply(martianCubicIn.getD())));
	}




	public MartianCubic splee() {
		return new MartianCubic((new DoubleWithAppx(18)).multiply(getA()).multiply(getB()).multiply(getC()).multiply(getD()),
				DoubleWithAppx.ZERO,
				(new DoubleWithAppx(-4)).multiply(getB().power(3)).multiply(getD()),
				DoubleWithAppx.ZERO);
	}



	public DoubleWithAppx cliff() {
		if(((getA().power(3)).add(getB().power(3)).add(getC().power(3)).add(getD().power(3))).compareTo(DoubleWithAppx.ZERO) >= 0)
			return new DoubleWithAppx(((getA().power(3)).add(getB().power(3)).add(getC().power(3)).add(getD().power(3))).realroot(4));
		else
			return new DoubleWithAppx(42);
	}



	public int compareTo(MartianCubic martianPolyIn) {
		if(cliff().compareTo(martianPolyIn.cliff())==1)
			return 1;
		else if(cliff().compareTo(martianPolyIn.cliff())==-1)
			return -1;
		else
			return 0;
	}




	public String toString() { 
		String res = "";

		//x^3 term
		if(this.getA().isZero())
			res+="";
		else
			res+=this.getA().toString() + "x^3";
		//the sign of term x^2
		if(this.getB().compareTo(DoubleWithAppx.ZERO)<0)
			res+="-";
		if(!this.getA().isZero())
			if(this.getB().compareTo(DoubleWithAppx.ZERO)>0)
				res+="+";
		//x^2 term
		if(this.getB().isZero())
			res+="";
		else
			res+=this.getB().abs().toString() + "x^2";
		//the sign of term x
		if(this.getC().compareTo(DoubleWithAppx.ZERO)<0)
			res+="-";
		if(this.getA().isZero() && this.getB().isZero());
		else
			if(this.getC().compareTo(DoubleWithAppx.ZERO)>0)
				res+="+";
		//x term
		if(this.getC().isZero())
			res+="";
		else
			res+=this.getC().abs().toString() + "x";
		//the sign of term constant
		if(this.getD().compareTo(DoubleWithAppx.ZERO)<0)
			res+="-";
		if(this.getA().isZero() && this.getB().isZero() && this.getC().isZero());
		else
			if(this.getD().compareTo(DoubleWithAppx.ZERO)>0)
				res+="+";
		//constant term
		if(this.getD().isZero()){
			res+="";
			if(this.getD().isZero()&&this.getC().isZero()&&this.getB().isZero()&&this.getA().isZero())
				res+="0";
		}
		else
			res+=this.getD().abs().toString();

		return res;
	} 







	//NOTE: THIS IS WRITTEN FOR YOU - DO NOT CHANGE
	@Override
	public boolean equals (Object other) {
		if (other == null) {
			return false;
		}
		else if (this.getClass()!=other.getClass()) {
			return false;
		}
		else {
			MartianCubic casted = (MartianCubic)other;
			return (
					a.equals(casted.a) && 
					b.equals(casted.b) && 
					c.equals(casted.c) && 
					d.equals(casted.d)
					);
		}
	}


}