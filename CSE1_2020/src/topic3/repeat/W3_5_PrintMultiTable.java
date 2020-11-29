package topic3.repeat;

public class W3_5_PrintMultiTable {
	public static void main(String[] args) {
		for (int i=1;i<10; i++) {
			for (int j=1;j<10; j++ ) {
				System.out.print(i*j + "\t");
			}
			System.out.println("");
		}
	}
}
