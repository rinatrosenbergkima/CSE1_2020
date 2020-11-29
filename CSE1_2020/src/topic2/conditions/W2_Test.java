package topic2.conditions;

import java.util.Scanner;

public class W2_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter, nextLetter;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		letter = in.next().charAt(0);
		nextLetter = (char)(letter + 1);
		System.out.println("The letter after "+ letter + " is "+nextLetter );
		
		boolean bExpression1, bExpression2, bExpression3, bExpression4;  
		int x=7;
		bExpression1 = (x <= 10);
		bExpression2 = ((x / 5) / 2 > 0);
		bExpression3 = ((x % 3 == 1) || (x / 3 == 2));
		bExpression4 = (bExpression1 && bExpression2);
		
		System.out.println("bExpression1=" + bExpression1); 
		System.out.println("bExpression2=" + bExpression2);
		System.out.println("bExpression3=" + bExpression3);
		System.out.println("bExpression4=" + bExpression4);
		
		if (bExpression3) 
		{
			if (bExpression4) 
			{
				System.out.println("A");
			}
			else if (bExpression2) 
			{
				System.out.println("B");
			}
			else
			{
				System.out.println("C");
			}
		}
		else 
		{
			System.out.println("D");
		}
		
	}

}
