
public class EquilateralTriangle extends Triangle{
	
	public EquilateralTriangle(int i) {
		super(i);
	}

	public double getPerimeter()
	  {
	     return 3 * super.getSide();
	  }
	
	public double getArea()
	  {
	      return Math.sqrt(3) / 4 * super.getSide() * super.getSide();
	  }
}
