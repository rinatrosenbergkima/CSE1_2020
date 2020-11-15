package week01.vars.input.output;

public class W1_5_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10, num2=7, sum;
		final int COUNT = 2;
		double average;
		sum = num1+num2;
		average=sum/COUNT;
		System.out.println("The average is: "+average);
		average=(double) sum/2;
		System.out.println("The average is: "+average);
	}

}
