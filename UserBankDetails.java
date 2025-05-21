public class UserBankDetails {

	// Instance variable
	private String accountHolderName;
	private double balance;
	private long accountNumber;

	// Constructor 
	public UserBankDetails(String accountHolderName, double balance, long accountNumber){
        	this.accountHolderName = accountHolderName;
        	this.balance = balance;
		this.accountNumber = accountNumber;
	}

	// Getter
    	public String getAccountHolderName() {
        	return accountHolderName;
    	}
	// Setter
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
    
    	public double getBalance() {
        	return balance;
    	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccountNumber() {
        	return accountNumber;
 	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
    

	// Method
	void printInfo() {

		System.out.println("Account holder name:  " + getAccountHolderName());
        	System.out.println("Bank balance: " + getBalance());
		System.out.println("Account Number: " + getAccountNumber());

	}

	public static void main(String[] args){

		UserBankDetails userDetails = new UserBankDetails("Dinesh", 59802, 12345678);
		
		userDetails.printInfo();
		userDetails.setBalance(40);

		userDetails.printInfo();
	}
} 