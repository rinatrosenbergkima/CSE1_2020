package topic6.classes;

public class BankManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank myBank = new Bank("The Greatest Bank"); 
		BankAccount bankAccount1 = new BankAccount("Amy", 111, 1000);
		BankAccount bankAccount2 = new BankAccount("John", 112, 2000);
		myBank.addAccount(bankAccount1);
		myBank.addAccount(bankAccount2);
		System.out.println(myBank);
	}

}
