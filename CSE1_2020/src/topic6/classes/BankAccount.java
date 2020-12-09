package topic6.classes;
import java.util.Scanner;

class BankAccount {
	  private String ownerName;
	  private long accountID;
	  private double balance;

	  //Default constructor that asks for missing information
	  public BankAccount(){
	    Scanner read = new Scanner(System.in);
	    this.ownerName = read.next();
	    this.accountID = read.nextLong();
	    this.balance = read.nextDouble(); 
	  }
	
	  //Constructor with parameters
	  public BankAccount(String ownerName, long accountID, double balance){
	    this.ownerName = ownerName;
	    this.accountID = accountID;
	    this.balance = balance; 
	  }
	  //Deposit adds an amount to the balance
	  public void deposit(double amount){
	     this.balance += amount;
	  }
	  //Withdraw an amount to the balance, 
	  //and returns a boolean indicating
	  //the success of the operation  
	  public boolean withdraw(double amount){
	     boolean withdrawn = false;
	     if (balance > amount){
	       balance -= amount;
	       withdrawn = true;
	       System.out.println("Amount withdrew succesfully");
	    } else {
	       System.out.println("Not enough funds");
	    }
	    return withdrawn;
	  }
}




