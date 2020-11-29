package topic2.conditions;

import java.util.Random;
import java.util.Scanner;

public class W2_6_Case {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month, year;
		Random rnd = new Random();
		month = rnd.nextInt(12)+1;
		year = rnd.nextInt(2000)+2000;
		switch (month)
		{
			case 1:
				System.out.println("You will fly to the moon in January "+year);
				break;
			case 2:
				System.out.println("You will fly to the moon in Februaty "+year);
				break;
			case 3:
				System.out.println("You will fly to the moon in March "+year);
				break;
			case 4:
				System.out.println("You will fly to the moon in April "+year);
				break;
			case 5:
				System.out.println("You will fly to the moon in May "+year);
				break;
			case 6:
				System.out.println("You will fly to the moon in June "+year);
				break;
			case 7:
				System.out.println("You will fly to the moon in July "+year);
				break;
			case 8:
				System.out.println("You will fly to the moon in August "+year);
				break;
			case 9:
				System.out.println("You will fly to the moon in September "+year);
				break;
			case 10:
				System.out.println("You will fly to the moon in October "+year);
				break;
			case 11:
				System.out.println("You will fly to the moon in November "+year);
				break;
			case 12:
				System.out.println("You will fly to the moon in December "+year);
				break;		
		}

	}
}
