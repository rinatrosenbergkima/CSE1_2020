package week03.repeat;

import java.util.Random;
import java.util.Scanner;

public class W3_4_MultiGameForCount {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); //create a Scanner object 
		Random rnd = new Random();  //create a Random object
		int x,y,answer;
		int numCorrect=0;
		
		for (int i=0; i<10; i++)
		{
			x = rnd.nextInt(9)+1; //random integer between 1-9
			y = rnd.nextInt(9)+1; //random integer between 1-9
			System.out.print ("("+(i+1)+") "+ x + " * " + y +" = ?  You answer:" );
			answer = in.nextInt(); //input the user answer
			if (answer== x*y) {
				System.out.println ("Very good!");
				numCorrect++;
			}
			else {
				System.out.println ("Nope. The correct answer is "+x*y);
			}
		}
		if (numCorrect>7)
			System.out.print("Super! You answered "+numCorrect+ "/10 correctly");
		else if (numCorrect>5)
			System.out.print("Nice! You answered "+numCorrect+ "/10 correctly");
		else
			System.out.print("You answered "+numCorrect+ "/10 correctly. Practice some more");
	}
}
