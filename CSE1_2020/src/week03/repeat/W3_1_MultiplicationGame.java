package week03.repeat;
import java.util.Scanner;
import java.util.Random;

public class W3_1_MultiplicationGame {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); //create a Scanner object 
		Random rnd = new Random();  //create a Random object
		int x,y, answer;
		x = rnd.nextInt(9)+1; //random integer between 1-9
		y = rnd.nextInt(9)+1; //random integer between 1-9
		System.out.print (x + " * " + y +" = ?  You answer:" );
		answer = in.nextInt(); //input the user answer
		if (answer== x*y) {
			System.out.println ("Very good!");
		}
		else {
			System.out.println ("Nope. The correct answer is "+x*y);
		}
			

	}
}
