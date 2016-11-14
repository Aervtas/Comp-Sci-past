
public class ComplexTest {

	public static void main(String[] args) {
		Complex hoi = new Complex(4, 9);
		Complex hoi2 = new Complex(5);
		Complex hoi3 = new Complex(8, 23);
		
		System.out.println("Complex number 1: "+hoi.toString());
		System.out.println("Complex number 2: "+hoi2.toString());
		System.out.println("Complex number 3: "+hoi3.toString());
		
		System.out.println("\nComplex number 1 + 2");
		System.out.println(hoi.add(hoi2).toString());
		System.out.println("Complex number 3 + 2");
		System.out.println(hoi3.add(hoi2).toString());
		System.out.println("Complex number 1 + 3");
		System.out.println(hoi.add(hoi3).toString());
		
		System.out.println("\nComplex number 1 * 2");
		System.out.println(hoi.multiply(hoi2).toString());
		System.out.println("Complex number 3 * 2");
		System.out.println(hoi3.multiply(hoi2).toString());
		System.out.println("Complex number 1 * 3");
		System.out.println(hoi.multiply(hoi3).toString());
	}

}
