package topic4.the.classString;

public class Topic4_1_DeclareStrings {

	public static void main(String[] args) {
		//Several ways to declare and assign value to a String
		int i=0; 
		char letter='a'; 
		String myString1, myString2; //declare two objects of class String 
		myString1 = new String("ABCD"); //initiate space for the object
		myString2 = "EFGH"; //this is a shorter way to initiate space for the object
		String myString3 = "IJKL"; //it is possible to declare and initiate space at the same line
				
        System.out.println(myString1+myString2+myString3);

	}

}
