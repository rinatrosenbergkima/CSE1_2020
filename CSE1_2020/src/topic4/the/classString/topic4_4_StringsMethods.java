package topic4.the.classString;

public class topic4_4_StringsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2,s3;
		s1 = "hello world";
		s2 = "Apple";
		s3 = "Banana";
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		System.out.println("s1.length() = "+s1.length());
		System.out.println("s1.charAt(0) = " + s1.charAt(0));
		System.out.println("s1.substring(6) = " + s1.substring(6));
		System.out.println("s1.substring(0,4) = " + s1.substring(0,4));
		System.out.println("s1.indexOf('o') = " + s1.indexOf('o'));
		System.out.println("s1.indexOf('o',6) = " + s1.indexOf('o',6));
		System.out.println("s1.indexOf(\"world\") = " + s1.indexOf("world"));
		System.out.println("s1.equals(s2) = " + s1.equals(s2));
		System.out.println("s1.toLowerCase() = " + s1.toLowerCase());
		System.out.println("s1.toUpperCase() = " + s1.toUpperCase());
	}
}

