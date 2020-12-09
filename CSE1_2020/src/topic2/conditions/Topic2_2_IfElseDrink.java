package topic2.conditions;

import java.util.Scanner;

public class Topic2_2_IfElseDrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in); //create a scanner 
		System.out.println("Enter your age:");
		int age = in.nextInt();
		if (age >= 18)
		{
			System.out.println("You can drink alchohol");
		}
		else
		{
			System.out.println("You will be able to drink alchogol in " + (18-age) + " years");
		}
		
	}

}
