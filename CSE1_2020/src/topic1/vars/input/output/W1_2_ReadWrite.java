package topic1.vars.input.output;
import java.util.Scanner;


/* 
 * Read two integers and print them as output
 */
public class W1_2_ReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOne, numTwo;
		Scanner in = new Scanner (System.in); //create a scanner 
		System.out.print("Enter first number: ");
		numOne = in.nextInt(); //this is the way to read an integer input in Java
		System.out.print("Enter second number: ");
		numTwo = in.nextInt();
		System.out.println("The two numbers are: ");
		System.out.print(numOne);
		System.out.print(" ");
		System.out.print(numTwo);
	}
}
