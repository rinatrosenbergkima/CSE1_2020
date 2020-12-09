package topic5.arrays;

import java.util.Scanner;

public class Topic5_3_HangManArr {
	public static void main(String[] args) {
		//Hangman game. The user is trying to guess the targetWords
		Scanner in = new Scanner (System.in); //create a scanner 
		String targetWord = "Corona";
		char[] foundWordArr = {'*','*','*','*','*','*'};
		char guess;
		int index,i;
		boolean bDone=false;
		System.out.print(foundWordArr);
		System.out.println(" - Find what is this word!  guess a letter:");
		while (!bDone) {//continue to read char guesses until the word is found
			guess = in.next().charAt(0);
			index=targetWord.indexOf(guess);
			if (index>=0) //the char guess is in targetWord
			{
				while(index >= 0) {//find all the appearances of the char guess in the word
					foundWordArr[index]=guess;
					index=targetWord.indexOf(guess, index+1);
				}
			}
			bDone=true;
			for (i=0;i<foundWordArr.length;i++) { //check if the word was discovered:
				if (foundWordArr[i]=='*')
					bDone=false;
			}
			System.out.print(foundWordArr);
			if (bDone)
				System.out.println(" - You got it!!!");
			else
				System.out.println(" - guess another letter:");
		}
	}
}
