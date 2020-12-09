package topic3.repeat;

public class Topic3_7_PrintStarsShape {
	public static void main(String[] args) {
		for (int i=4;i>-5; i--) {
			for (int j=0;j<Math.abs(i)+1; j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
