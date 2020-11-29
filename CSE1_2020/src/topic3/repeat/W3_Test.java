package topic3.repeat;

import java.util.Scanner;

public class W3_Test {
	public static void main(String[] args) {
		//Q1
		for (int i=1; i<200; i=i*2) {
			System.out.print(i+"\t");
		}
		
		//Q2
		Scanner in = new Scanner (System.in); //create a Scanner object 
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int i=0;
		while (i<num+1)
			i = i + 2;
		System.out.println(i);
		
		//Q3 - print the number of digits
		//Scanner in = new Scanner (System.in); //create a Scanner object 
		System.out.print("Enter a number: ");
		int x = 0;
		int y = in.nextInt();
		while (y>0)
		{
			y = y/10;
			x++;
		}
		System.out.println(x);
		
		//Q4
		for (i=5;i>-5; i--) {
			for (int j=0;j<5-Math.abs(i); j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
