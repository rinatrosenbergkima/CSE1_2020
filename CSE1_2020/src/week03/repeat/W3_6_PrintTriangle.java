package week03.repeat;

public class W3_6_PrintTriangle {
	public static void main(String[] args) {
		for (int i=0;i<5; i++) {
			for (int j=0;j<i+1; j++ ) {
				System.out.print(i+1);
			}
			System.out.println("");
		}
	}
}
