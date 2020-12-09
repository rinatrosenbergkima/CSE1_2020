package topic4.the.classString;
import java.util.Scanner;

public class Topic4_2_ReadStrings {
	public static void main(String[] args) {
		
		//Several ways to declare and assign value to a String
		String readString; //declare two objects of class String 
		
		Scanner in = new Scanner (System.in); //create a scanner 
		
		//Reading String:
		System.out.print("Enter you full name:");
		readString = in.next(); //notice! next() reads the next word
		System.out.println("Your first name is "+ readString);
		readString = in.nextLine();
		System.out.println("Your last name is "+ readString);
		System.out.println("Enter you full name again:");
		readString = in.nextLine(); //Notice! nextLine() reads the entire sentence
		System.out.println("Nice to meet you "+ readString);
	}
}
