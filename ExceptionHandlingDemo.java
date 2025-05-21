public class ExceptionHandlingDemo {

	private String account_holder_name;
	private double account_balance;
	private long account_number;

	public ExceptionHandlingDemo(String accountHolderName, double balance, long accountNumber){
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

	public void deposit(double amount) {

		try {
			if (amount <= 0){
				System.out.println("Negative deposits are not allowed");
				Exception e = new Exception();

			} else {
				account_balance += amount;
				System.out.println("Deposit amount: " + amount);
			}
		}catch (Exception e){
			System.out.println("Exception error: " + e);
		} finally {
			System.out.println("Deposit completed");
			System.out.println("Total account_balance: " + account_balance);
		}
	}

	public void withdraw(double amount) {
		try {
			if (amount <= 0){
				System.out.println("Negative withdrawal are not allowed");
				Exception e = new Exception();
				
			} else {
				if (amount > account_balance) {
					System.out.println("Insufficient account balance");
					Exception e = new Exception();
					
				} else {
					account_balance -= amount;
					System.out.println("withdraw amount: " + amount);
				}
			}

		} catch (Exception e) {
			System.out.println("Exception error: " + e);
		}finally {
			System.out.println("Withdraw completed");
			System.out.println("Total account_balance: " + account_balance);
		}
		
	}
    

	void printInfo() {

		System.out.println("Account_holder_name:  " + getAccountHolderName());
        	System.out.println("Bank_balance: " + getBalance());
		System.out.println("Account_Number: " + getAccountNumber());

	}

	public static void main(String[] args){

		ExceptionHandlingDemo account = new ExceptionHandlingDemo("Dinesh Raj", -200, 1234567);
		account.printInfo();

		account.deposit(400);
		
		account.withdraw(200);

	}
}


