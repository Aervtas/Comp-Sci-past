import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayManip hoi = new ArrayManip();
		double[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		double[][] m2 = new double[3][3];
		
		System.out.println("m2 is a 2 dimensional array that is 3 by 3");
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++){
				System.out.print("Enter element "+i+"|"+j+": ");
				m2[i][j] = sc.nextInt();
			}
		System.out.println("Does array m1 cover array m2? "+hoi.covers(m1, m2));
		
		System.out.println("Enter the number of rows in a two dimensional array: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of columns in this two dimensional array: ");
		int m = sc.nextInt();
		double[][] arr = new double[n][m];
		for(int i=0; i<arr.length ; i++)
			for(int j=0; j<arr[i].length ; j++){
				System.out.print("Enter element "+i+"|"+j+": ");
				arr[i][j] = sc.nextInt();
			}
		System.out.println("The largest positive number is "+hoi.positiveMax(arr));
		
		System.out.println("Enter the length of this array: ");
		int[] arr2 = new int[sc.nextInt()];
		for(int j=0; j<arr2.length ; j++){
				System.out.print("Enter element "+j+": ");
				arr2[j] = sc.nextInt();
			}
		System.out.println("The average of all the numbers is "+hoi.average(arr2));
		
		System.out.println("Enter the length of a one dimensional array: ");
		double[] arr3 = new double[sc.nextInt()];
		for(int j=0; j<arr3.length ; j++){
			System.out.print("Enter element "+j+": ");
			arr3[j] = sc.nextDouble();
		}
		System.out.println("Enter a number to check if that is the median: ");
		double num = sc.nextDouble();
		System.out.println("Is "+num+" a median? "+hoi.isMedian(arr3, num));
	}

}
