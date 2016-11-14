import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Meethods hoi = new Meethods();
		int[] yo; int[][] po;
		int n=0, m=0;
		
		
		System.out.println("1) Sum of one dimensional array");
		System.out.println("2) Sum of two dimensional array");
		while(n!=1 && n!=2){
		System.out.print("Enter 1 or 2: ");
		n = sc.nextInt();
		}
		switch(n){
			case 1:
				System.out.print("Length of your array: ");
				n = sc.nextInt();
				yo = new int[n];
				for(int i=0; i<n; i++){
					System.out.print(i+": ");
					yo[i] = sc.nextInt();
				}
				System.out.println("Sum: "+hoi.sum(yo));
				break;
			case 2:
				System.out.print("Rows in your array: ");
				n = sc.nextInt();
				System.out.print("Columns in this array: ");
				m = sc.nextInt();
				po = new int[n][m];
				for(int i=0; i<n; i++){
						for(int j=0; j<m; j++){
							System.out.print(i+"|"+j+": ");
							po[i][j] = sc.nextInt();
						}
				}
				System.out.println("The sum of each row is: ");
				int[] result = hoi.sum2(po);
				for(int i=0; i<result.length; i++){
					System.out.println(i+" row: "+result[i]+"     ");
				}
				break;
			default:
				break;
		}
	}

}
