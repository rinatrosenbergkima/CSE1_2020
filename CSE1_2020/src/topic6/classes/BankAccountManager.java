package topic6.classes;

import java.util.Scanner;

public class BankAccountManager {
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    System.out.println("Enter account name:");
	    String name = read.next();
	    System.out.println("Enter account id");
	    long accountID = read.nextLong();
	    System.out.println("Enter initial deposit:");
	    double initialDeposit = read.nextDouble(); 
	    BankAccount myBankAccount1 = new BankAccount(name, accountID, initialDeposit); 
	    System.out.println("Enter amound to withdraw");
	    myBankAccount1.withdraw(read.nextDouble());
	    
	    myBankAccount1.setOwnerName("Rinat2");
	    
	}

}