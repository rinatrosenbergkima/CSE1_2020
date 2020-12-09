package topic5.arrays;

import java.util.Scanner;

public class Topic5_2_LowerThanAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in); //create a scanner 
		int [] grades = {80,70,87,95,99,100,55,89,75,92};
		double total =0;
		double average =0;
		int counter=0;

		//Calculate averages:
		for (int i=0; i<grades.length;i++) {
			total = total + grades[i];
		}
		average = total / grades.length;
		System.out.println("The grades average is " + average);
		for (int i=0; i<grades.length;i++) {
			if (grades[i] > average) {
				counter++;
			}
		}
		
		System.out.println("There are " + counter + " grades above the average");

	
	}

}

