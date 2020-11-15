package week01.vars.input.output;

/*
 * Circle move to the left
 */
public class W1_6_CircleFlip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int element1=1, element2=2, element3=3, temp;
		System.out.println("element1="+element1+", element2="+element2+" element3="+element3);
		//flip element1 and element2
		temp=element1;
		element1=element2;
		element2=temp;
		
		//flip element2 and element 3
		temp=element2;
		element2=element3;
		element3=temp;
		System.out.println("element1="+element1+", element2="+element2+" element3="+element3);
	}

}
