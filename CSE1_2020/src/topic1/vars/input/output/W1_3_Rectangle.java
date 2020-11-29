package topic1.vars.input.output;

/*
 * This program reads the width and length of a rectangle and calculates his area and perimeter 
 */
import java.util.Scanner;
public class W1_3_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length, width, area, perimeter;
		Scanner in = new Scanner (System.in);
		System.out.print("Enter length: ");
		length = in.nextInt();
		System.out.print("Enter width: ");
		width = in.nextInt();
		area = length * width;
		perimeter = (width + length) * 2;
		System.out.println("The area is: " + area);
		System.out.println("The perimeter " + perimeter);
	}
}
