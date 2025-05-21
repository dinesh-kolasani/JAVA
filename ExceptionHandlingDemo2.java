class ErrorException extends Exception {
	ErrorException (String message){
		super(message);
	}
}

public class ExceptionHandlingDemo2 {

	private String account_holder_name;
	private double account_balance;
	private long account_number;

	public ExceptionHandlingDemo2(String accountHolderName, double balance, long accountNumber){
        	this.account_holder_name = accountHolderName;
        	this.account_balance = balance;
		this.account_number = accountNumber;
	}


    	public String getAccountHolderName() {
        	return account_holder_name;
    	}
	public void setAccountHolderName(String accountHolderName) {
		this.account_holder_name = accountHolderName;
	}
    

    	public double getBalance() {
        	return account_balance;
    	}
	public void setBalance(double balance) {
		this.account_balance = balance;
	}


	public long getAccountNumber() {
        	return account_number;
 	}
	public void setAccountNumber(long accountNumber) {
		this.account_number = accountNumber;
	}

	public void deposit(double amount) throws ErrorException {
		if (amount <= 0){
			throw new ErrorException("Negative amount not deposit");
		}

		account_balance += amount;
		System.out.println("Deposit amount: " + amount);
		System.out.println("Total account balance: " + account_balance);


	}

	public void withdraw(double amount) throws ErrorException {
		if (amount <= 0){
			throw new ErrorException("Negative amount not withdraw");
		}

		if (amount > account_balance){
			throw new ErrorException("Insufficient account balance");
		}

		account_balance -= amount;

		System.out.println("withdraw amount: " + amount);
		System.out.println("Total account balance: " + account_balance);
		
	}
    

	void printInfo() {

		System.out.println("Account_holder_name:  " + getAccountHolderName());
        	System.out.println("Bank_balance: " + getBalance());
		System.out.println("Account_Number: " + getAccountNumber());

	}

	public static void main(String[] args){

		ExceptionHandlingDemo2 account = new ExceptionHandlingDemo2("Dinesh Raj", -200, 1234567);
		account.printInfo();
		try {

			account.deposit(400);
	
			account.withdraw(200);

		} catch(Exception e) {
			System.out.println("Error: " + e);

		}

		account.setAccountHolderName(null);
		System.out.println("Get account holder name: " + account.getAccountHolderName());

		try {
			System.out.println(account.getAccountHolderName().length());
		} catch (Exception e) {
			System.out.println("Exception error: " + e);
		}

	}
}


