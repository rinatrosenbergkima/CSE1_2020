package topic1.vars.input.output;

import java.util.Scanner;
public class W1_9_DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int num;
		int absNum;
		int tens;
		int units;
		int sum;
		System.out.print("Enter a two digit number: ");
		num = in.nextInt();
		absNum = Math.abs(num);
		tens = absNum / 10;
		units = absNum % 10;
		sum = tens + units;
		System.out.println("The sum of the digit is: "+sum);
		
	}

}
