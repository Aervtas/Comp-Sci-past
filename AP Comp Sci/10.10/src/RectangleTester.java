
public class RectangleTester {

	public static void main(String[] args) {
		Rectangle hoi = new Rectangle();
		Rectangle hoi2 = new Rectangle(5, 9);
		Rectangle hoi3 = new Rectangle(7);

		System.out.println("Rectangle 1: Width: "+hoi.getWidth()+"\tLength: "+hoi.getLength());
		System.out.println("Rectangle 2: Width: "+hoi2.getWidth()+"\tLength: "+hoi2.getLength());
		System.out.println("Rectangle 3: Width: "+hoi3.getWidth()+"\tLength: "+hoi3.getLength());

		System.out.println("\nIs Rectangle 1 a square? "+hoi.isSquare());
		System.out.println("Is Rectangle 2 a square? "+hoi2.isSquare());
		System.out.println("Is Rectangle 3 a square? "+hoi3.isSquare());
		
		System.out.println("\nQuadratizing Rectangle 2...");
		hoi2.quadratize();
		System.out.println("Is Rectangle 2 a square? "+hoi2.isSquare());
	}

}
