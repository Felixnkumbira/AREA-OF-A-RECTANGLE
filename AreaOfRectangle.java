//THIS PROGRAME WAS WRITTEN BY FELIX NKUMBIRA (BSC-ELE-16-18)

import java.util.Scanner;
//Method Name
public class AreaOfRectangle {

	//declaire private scanner
	private static Scanner sc ;

// Main Method
	public static void main(String[] args) {
		double width, length; 
		Scanner input = new Scanner(System.in);
		// Enter width of a rectangle
		System.out.println("\n Please Enter the Width of a Rectangle =  ");
		width = sc.nextDouble();

		// Enter length of Rectangle
		System.out.println("\n Please Enter the Length of a Rectangle = ");
		length = sc.nextDouble();

		AreaofRectangle(width, length);
	}
	// declare the methods
	public static void AreaofRectangle( double width, double length ) {
		double Area; 
		// Compute the area
		Area = width * length;

        // Display the outcome
		System.out.format("\n The Area of a Rectangle = %.2f\n",Area);

		
   }
}