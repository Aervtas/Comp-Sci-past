package studentCode;
import java.util.Scanner;

public class LoopsPhase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Shape? ");
		String shape = sc.next();

		if (shape.equals("square")) {
			System.out.print("Size? ");
			int size = sc.nextInt();

			//YOUR CODE HERE
			
			for(int i=0; i<size; i++){
				for(int j=0; j<size; j++)
					System.out.print("*");
				System.out.print("\n");
			}
			
			//YOUR CODE HERE

		} 
		else { //assume rectangle
			System.out.print("Width? ");
			int width = sc.nextInt();
			System.out.print("Height? ");
			int height = sc.nextInt();

			//YOUR CODE HERE
			for(int i=0; i<height; i++){
				for(int j=0; j<width; j++)
					System.out.print("*");
				System.out.print("\n");
			}
			
			
			//YOUR CODE HERE
			
			
		}

		sc.close();
	}

}
