package topic6.classes;

public class Bank {

	private String bankName;
	private BankAccount[] bankAccounts; 
	static int numAccounts; 
	
	public Bank(String bankName){
		this.bankName = bankName;
        this.numAccounts = 0;
		this.bankAccounts = new BankAccount[1000];
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName(String bankName) {
		return bankName;
	}
	public void addAccount (BankAccount newbankAccount) {
		this.bankAccounts[this.numAccounts] = newbankAccount;
		this.numAccounts++;
	}
	
    public String toString() {
    	String bankToString="Bank name: "+ this.bankName + "\n";
    	
        for (int i=0; i < this.numAccounts; i++)
        {
        	bankToString = bankToString + this.bankAccounts[i].toString() + "\n";
        }
        return bankToString;
    }
	

}
