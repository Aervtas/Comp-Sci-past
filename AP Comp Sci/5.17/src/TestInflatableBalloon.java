import java.util.Scanner;

public class TestInflatableBalloon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InflatableBalloon hoi = new InflatableBalloon();
		int r = hoi.getRadius();
		
		System.out.print("Enter the percentage you want to increase the volume by: ");
		hoi.inflate(sc.nextInt());
		System.out.println("The radius "+r+" is now "+hoi.getRadius());
		
	}

}
