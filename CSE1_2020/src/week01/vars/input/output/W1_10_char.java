package week01.vars.input.output;

import java.util.Scanner;
public class W1_10_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter, nextLetter;
		String word;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		letter = in.next().charAt(0);
		nextLetter = (char)(letter + 1);
		System.out.println("The letter after "+ letter + " is "+nextLetter );
		System.out.print("Enter a word: ");
		word = in.next();
		

	}
}
