// Chapter 5 Question 18

// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class GasMileage
{
  public static double gasMileage(int miles, double mpg)
  {
    return miles*mpg;
  }
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Miles traveled: ");
    int miles = input.nextInt();
    System.out.print("Your car's gas mileage: ");
    double mpg = input.nextDouble();
    
    input.close();
    
    double gallons = gasMileage(miles, mpg);
    System.out.printf("Your spent %g gallons of gas.\n", gallons);
  }
}