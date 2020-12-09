package topic4.the.classString;

import java.util.Scanner;

public class Topic4_5_HangMan {

	public static void main(String[] args) {
		//Hangman game. The user is trying to guess the targetWords
		Scanner in = new Scanner (System.in); //create a scanner 
		String targetWord = "Corona";
		String foundWord = "******";
		String updatedWord = "";
		char guess;
		int index, i;
		System.out.println("Let's play hangman, guess a letter");
		while (!foundWord.equals(targetWord)) {
			guess = in.next().charAt(0);
			index=targetWord.indexOf(guess);
			if (index>=0) //the player guessed correctly
			{
				while(index >= 0) {//find all the appearances of the char guess in the word
					for (i=0; i<targetWord.length();i++) { //add guess to updatedWord
					   if (i==index)
						   updatedWord = updatedWord + guess;
					   else
						   updatedWord = updatedWord + foundWord.charAt(i);
					}
					foundWord = updatedWord;
					updatedWord="";
					index=targetWord.indexOf(guess, index+1);
				}
				System.out.println(foundWord);
				System.out.println("Nice! guess another letter");
			}
			else //the player did not guess correctly
			{
				System.out.println("Nope! try again");
			}		
		}
		System.out.println ("You got it!");
	}
}
