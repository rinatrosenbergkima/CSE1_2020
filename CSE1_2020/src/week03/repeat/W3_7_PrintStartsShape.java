package week03.repeat;

public class W3_7_PrintStartsShape {
	public static void main(String[] args) {
		for (int i=4;i>-5; i--) {
			for (int j=0;j<Math.abs(i)+1; j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
