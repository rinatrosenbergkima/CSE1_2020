package topic4.the.classString;

import java.util.Scanner;
//read more here: https://www.java67.com/2014/08/difference-between-string-literal-and-new-String-object-Java.html#:~:text=String%20strLiteral%20%3D%20%22Java%22%3B,new%20object%20in%20heap%20memory.&text=Otherwise%20it%20will%20create%20a,pool%20for%20future%20re%2Duse.

public class Topic4_3_StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1, s2;
		s1=new String("ABC");
		s2=new String("ABC");
		System.out.println("s1==s2? "+(s1==s2));
		System.out.println("s1.equals(s2)? "+(s1.equals(s2)));
		
		s1="ABC";
		s2="ABC";
		System.out.println("s1==s2? "+(s1==s2));
		System.out.println("s1.equals(s2)? "+(s1.equals(s2)));
		
	}

}
