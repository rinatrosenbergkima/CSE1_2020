package week02.conditions;

import java.util.Scanner;

public class W2_3_IfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter, nextLetter;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		letter = in.next().charAt(0);
		if (letter =='z') 
		{
			nextLetter = 'a';
		}
		else
		{
			nextLetter = (char)(letter + 1);
		}
		System.out.println("The letter after "+ letter + " is "+nextLetter );
		

	}
}
