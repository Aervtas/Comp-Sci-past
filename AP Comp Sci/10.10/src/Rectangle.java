
public class Rectangle {
	
	private int width, height;
	
	Rectangle(int x, int y){
		if(x<0 || y<0)
			throw new IllegalArgumentException();
		width = x;
		height = y;
	}
	
	Rectangle(int x){
		if(x<0)
			throw new IllegalArgumentException();
		width = x;
		height = x;
	}
	
	Rectangle(){
		width = 1; height = 1;
	}
	
	public boolean isSquare(){
		if(width == height)
			return true;
		else
			return false;
	}
	
	public void quadratize(){
		double temp = Math.sqrt(width*height);
		width = (int)(temp + 0.5);
		height = width;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getLength(){
		return height;
	}
}
