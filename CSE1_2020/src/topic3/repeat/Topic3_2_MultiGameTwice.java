package topic3.repeat;

import java.util.Random;
import java.util.Scanner;

public class Topic3_2_MultiGameTwice {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); //create a Scanner object 
		Random rnd = new Random();  //create a Random object
		int x,y, answer;
		
		//first exercise:
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
			
		//second exercise:
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
