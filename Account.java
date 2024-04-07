package assignment;

public class Account {
	protected long accountNO;
	protected String accountHolderName;
	protected double balance;

	private double amount;

	public void openAccount(long accountNO, String accountHolderName, double balance) {

		this.accountNO = accountNO;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount < 0)
			System.out.println("transation failed");
		else {
			balance = balance + amount;
			System.out.println("transation successfull");
			System.out.println("updatead balance   :" + balance);
		}

	}

	public void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("transation failed");
		} else {
			balance = balance - amount;
			System.out.println("transation successfull");
			System.out.println("updatead balance   :" + balance);
		}
	}

	public void display() {
		System.out.println("Account information \naccountNO    =" + accountNO);
		System.out.println("accountHolderName=" + accountHolderName);
		System.out.println(" \nbalance=" + balance);
	}

}

class HousingLoan extends Account {
	private double HousingloanAmount;

	public void housingloan(int amount) {
		if (amount == 0)
			System.out.println("application failed for housing loan");
		else
			System.out.println("loan   application  is successfull");
	}

}

class LoanAccount extends Account {
	private double loanAmount;

	void loan(int amount) {
		if (amount == 0)
			System.out.println("application failed");
		else
			System.out.println("loan  applay is successfull");
	}

}

class SavingAccount extends Account {

	private double interst;

	public void openAccount(long accountNO, String accountHolderName, double balance) {

		this.accountNO = accountNO;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void calInterst(int month) {
		interst = balance * 7 * month;
	}
}
