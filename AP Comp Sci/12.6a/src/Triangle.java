public abstract class Triangle
{
  private double side;

  public Triangle(double side)
  {
    this.side = side;
  }

  public abstract double getPerimeter();

  public abstract double getArea();
  
  public double getRatio()
  {
    return getArea()/getPerimeter();
  }
  
  public double getSide(){
	  return side;
  }
}
