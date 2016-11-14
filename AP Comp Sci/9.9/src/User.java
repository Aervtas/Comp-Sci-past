import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PythTriples hoi = new PythTriples();
		int m=-1, n=-1;
		int[] a;
		char[] b = {'a', 'b', 'c'};
		
		System.out.println("Enter 2 positive integers to create a Pythagorean Triple.");
		while(m<=0 && n<=0){
			System.out.print("Integer 1>> ");
			m = sc.nextInt();
			System.out.print("Integer 2>> ");
			n = sc.nextInt();
		}
		if(m > n)
			a = hoi.makePythagoreanTriple(m, n);
		else
			a = hoi.makePythagoreanTriple(n, m);
		System.out.print("The pythagorean triples are: [ ");
		for(int i=0; i<3; i++)
			System.out.print(" "+b[i]+"="+a[i]+" ");
		System.out.println("]");
	}

}
