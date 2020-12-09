package topic3.repeat;

import java.util.Scanner;

public class Topic3_8_DoWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); //create a Scanner object 
		String enterPassword;
		String thePassword ="Open sesame";
		boolean bGuessed = false;
		
		while (!bGuessed) {
			System.out.println("Say the magic words:");
			enterPassword = in.nextLine(); // import a sentence
			if (thePassword.equals(enterPassword)) {
				bGuessed=true;
				System.out.println("YESSSSSSSS!!!!!!");
			}
			else
			{
				System.out.println("NOOOOOOO! Try again!");
			}
		}
	}
}
