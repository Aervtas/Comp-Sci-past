import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the vehicle being used to transport 40 students.");
		System.out.println("1) Sportscar: Seats maximum of 2 incl. driver, Max speed 180 mph, Tank holds 14 gallons");
		System.out.println("2) Minivan: Seats maximum of 7 incl driver, Max speed 100, tanks holds 25 Gallons");
		System.out.println("3) Helicopter: Holds 5 people including driver, Max effective speed 100 mph, Tank holds 200 gallons.");
		System.out.print("Choose a vehicle by their number to race in: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the speed at which the vehicle is to go at:");
		int b = sc.nextInt();
		
		switch(a){
		case(1):  PeopleMoverRace sport = new PeopleMoverRace(3771, b, 2, 14, "Sportscar");
		PeopleMoverRace mini = new PeopleMoverRace(3771, 100, 7, 25, "Minivan");
		PeopleMoverRace heli = new PeopleMoverRace(2820.8, 100, 5, 200, "Helicopter");
		System.out.println(sport);
		System.out.println(mini);
		System.out.println(heli);
		break;
		case(2): PeopleMoverRace sport2 = new PeopleMoverRace(3771, 180, 2, 14, "Sportscar");
		PeopleMoverRace mini2 = new PeopleMoverRace(3771, b, 7, 25, "Minivan");
		PeopleMoverRace heli2 = new PeopleMoverRace(2820.8, 100, 5, 200, "Helicopter");
		System.out.println(sport2);
		System.out.println(mini2);
		System.out.println(heli2);
		break;
		case(3): PeopleMoverRace sport3 = new PeopleMoverRace(3771, 180, 2, 14, "Sportscar");
		PeopleMoverRace mini3 = new PeopleMoverRace(3771, 100, 7, 25, "Minivan");
		PeopleMoverRace heli3 = new PeopleMoverRace(2820.8, b, 5, 200, "Helicopter");
		System.out.println(sport3);
		System.out.println(mini3);
		System.out.println(heli3);
		break;
		}
		
		System.out.println("That Concludes the Race! Have a Good Time in Alaska");
	}

}
