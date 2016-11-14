import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fibon hoi = new Fibon();
		int[] a;
		int n=-1;
		
		System.out.println("Enter up to which number of the fibonacci sequence you wish to go up to.");
		while(n<=0){
			System.out.print(">> ");
			n = sc.nextInt();
		}
		a = hoi.fibonacci(n);
		for(int i=0; i<a.length; i++)
			System.out.print(" "+a[i]+" ");
	}

}
