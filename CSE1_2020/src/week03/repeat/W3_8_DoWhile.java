package week03.repeat;

import java.util.Scanner;

public class W3_8_DoWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); //create a Scanner object 
		String enterPassword;
		String thePassword ="Open sesame";
		boolean bGuess = false;
		
		while (!bGuess) {
			System.out.println("Say the magic words:");
			enterPassword = in.nextLine(); // import a sentence
			if (thePassword.equals(enterPassword)) {
				bGuess=true;
				System.out.println("YESSSSSSSS!!!!!!");
			}
			else
			{
				System.out.println("NOOOOOOO! Try again!");
			}
		}
	}
}
