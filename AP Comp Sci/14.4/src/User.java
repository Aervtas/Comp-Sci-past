import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuadraticFunction hoi;
		int a,b,c;
		
		System.out.println("Enter integer vaules for ax^2+bx+c.");
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		System.out.print("c: ");
		c = sc.nextInt();
		hoi = new QuadraticFunction(a,b,c);
		
		System.out.println("Quadratic: "+hoi);
		
		System.out.print("Enter an X value to find the Y value: ");
		System.out.println(hoi.valueAt(sc.nextDouble()));
		
		System.out.println("Enter integer vaules for another ax^2+bx+c to compare to the first quadratic.");
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		System.out.print("c: ");
		c = sc.nextInt();
		QuadraticFunction hoi2 = new QuadraticFunction(a,b,c);
		System.out.println("Is the first function equal to the second? "+hoi.compareTo(hoi2));
		
		System.out.println("Enter a number to compare the functions one more time.");
		System.out.print("#: ");
		double d = sc.nextDouble();
		ComparingStuff hoi3 = new ComparingStuff(d);
		a = hoi3.compare(hoi, hoi2);
		if(a == 1)
			System.out.println(hoi+" is greater than "+hoi2+" at "+d);
		if(a == -1)
			System.out.println(hoi+" is less than "+hoi2+" at "+d);
		if(a == 0)
			System.out.println(hoi+" is equal to "+hoi2+" at "+d);
	}

}
