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
	  
	  //Update methods ("PEULOT IDKUN")
	  public void setOwnerName (String ownerName) {
		  this.ownerName = ownerName;
	  }
	  
	  public void setAccountID (long accountID) {
		  this.accountID = accountID;
	  }
	  
	  public void setBalance (double balance) {
		  this.balance = balance;
	  }
	  //Access methods: ("PEULOT GISHA")
	  public String getOwnerName () {
		  return this.ownerName;
	  }
	  
	  public long getAccountID () {
		  return this.accountID;
	  }
	  
	  public double getBalance () {
		  return this.balance;
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
	  
	    public String toString() {
	        return "Account Id: "+ this.accountID +
	        		", Owner name: " + this.ownerName + 
	        		", Balance:" + this.balance;
	    }
}




