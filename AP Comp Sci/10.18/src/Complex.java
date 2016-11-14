
public class Complex {
	
	private double x=0, y=0;
	
	public Complex(double a){
		y = a;
	}
	
	public Complex(double a, double b){
		x = a;
		y = b;
	}
	
	public double abs(Complex other){
		return Math.sqrt(Math.pow(other.getA(), 2) + Math.pow(other.getB(), 2));
	}
	
	public Complex add(Complex other){
		return new Complex(other.getA()+getA(), other.getB()+getB());
	}
	
	public Complex multiply(Complex other){
		return new Complex(other.getA()*getA()-other.getB()*getB(),getA()*other.getB()+getB()*other.getA());
	}
	
	public Complex add(double a, double b){
		return new Complex(a+getA(), b+getB());
	}
	
	public Complex multiply(double a, double b){
		return new Complex(getA()*a-getB()*b,getA()*b+getB()*a);
	}
	
	public double getA(){
		return x;
	}
	public double getB(){
		return y;
	}
	
	public String toString(){
		return getA()+" + "+getB()+"i";
	}
	
}
