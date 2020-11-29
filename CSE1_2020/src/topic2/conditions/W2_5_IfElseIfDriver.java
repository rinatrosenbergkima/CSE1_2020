package topic2.conditions;

import java.util.Scanner;

public class W2_5_IfElseIfDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in); //create a scanner 
		System.out.println("Enter your age:");
		int age = in.nextInt();
		System.out.println("Do you are a driver license? Please enter yes or no");
		String license = in.next();
		System.out.println(license);
		if (age >= 17)
		{
			if (license.equals("yes"))
			{
				System.out.println("You can drive");
			}
			else 
			{
				System.out.println("You can start working on your driver license");
			}
		}
		else 
		{
			System.out.println("You will be able to start working on your driving license in " + (17-age) + " years");
		}
		
	}
}
