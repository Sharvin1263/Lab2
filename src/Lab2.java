import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		System.out.println("Welecome to Grand Circus' Room Detail Generator");
		System.out.println();

		Scanner scnr = new Scanner(System.in);
		char continueCalc = 'y';

		while (continueCalc == 'y') {

			System.out.print("Enter Length:");
			double roomLength = scnr.nextDouble();

			System.out.print("Enter Width:");
			double roomWidth = scnr.nextDouble();

			double roomArea = roomLength * roomWidth;
			double roomPerimeter = (2 * roomLength) + (2 * roomWidth);

			System.out.println("Area: " + roomArea);
			System.out.println("Perimeter: " + roomPerimeter);

			System.out.println();
			System.out.println();

			System.out.println("Continue? (y/n)");
			continueCalc = scnr.next().charAt(0);
		}

	}

}
