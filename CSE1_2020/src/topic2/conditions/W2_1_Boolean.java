package topic2.conditions;

public class W2_1_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bExpression1, bExpression2, bExpression3, bExpression4, bExpression5, bExpression6;  
		int x = 12;
		bExpression1 = (x <= 10);
		bExpression2 = (x == 12);
		bExpression3 = ((x / 2) > 5);
		bExpression4 = (x != 12);
		bExpression5 = ((x % 3 == 0) || (x % 4 == 0));
		bExpression6 = ((x>0) && (x<0));
		
		System.out.println("bExpression1=" + bExpression1);
		System.out.println("bExpression2=" + bExpression2);
		System.out.println("bExpression3=" + bExpression3);
		System.out.println("bExpression4=" + bExpression4);
		System.out.println("bExpression5=" + bExpression5);
		System.out.println("bExpression6=" + bExpression6);
	}

}
