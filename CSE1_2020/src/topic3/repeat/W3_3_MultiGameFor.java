package topic3.repeat;

import java.util.Random;
import java.util.Scanner;

public class W3_3_MultiGameFor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); //create a Scanner object 
		Random rnd = new Random();  //create a Random object
		int x,y, answer;
		
		for (int i=0; i<10; i++)
		{
			x = rnd.nextInt(9)+1; //random integer between 1-9
			y = rnd.nextInt(9)+1; //random integer between 1-9
			System.out.print ("("+(i+1)+") "+ x + " * " + y +" = ?  You answer:" );
			answer = in.nextInt(); //input the user answer
			if (answer== x*y) {
				System.out.println ("Very good!");
			}
			else {
				System.out.println ("Nope. The correct answer is "+x*y);
			}
		}
		System.out.print("Nice work!");
	}
}
