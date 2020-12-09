package topic5.arrays;

import java.util.Scanner;

public class Topic5_1_Average {
	
	public static void main(String[] args) {
		//print the average of two arrays
		Scanner in = new Scanner (System.in); //create a scanner 
		int [] grades1 = {80,70,87,95,99,100,55,89,75,92};
		int [] grades2 = new int[10];
		double total1=0, total2=0;
		double average1=0, average2=0;

		System.out.println("Enter 10 grades:");
		for (int i=0; i< grades2.length; i++) {
			grades2[i] = in.nextInt();
		}
		//Calculate averages:
		for (int i=0; i< grades1.length; i++) {
			total1 = total1 + grades1[i];
			total2 = total2 + grades2[i];
		}
		average1=total1/grades1.length;
		average2=total2/grades2.length;
		System.out.println("average1 = " + average1);
		System.out.println("average2 = " + average2);	
	}
}

