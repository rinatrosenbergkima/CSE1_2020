package week01.vars.input.output;

import java.util.Random;
public class W2_11_rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dice two numbers:
		int num1, num2;
		Random rnd = new Random();
		num1 = rnd.nextInt(6)+1; //a number between 1-6
		num2 = rnd.nextInt(6)+1; //a number between 1-6
		System.out.println("the numbers diced are: "+num1+" "+num2);
	}

}
