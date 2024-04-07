package assignment;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("===========================================");
		account.openAccount(1001, "jack", 50000.45);
		account.display();
		account.deposit(12750);
		account.withdraw(5000);
		System.out.println("===========================================");
		LoanAccount loanAccount = new LoanAccount();
		loanAccount.openAccount(1002, "maya", 45000.23);
		loanAccount.deposit(12750);
		loanAccount.withdraw(2000);
		loanAccount.loan(4500);
		System.out.println("===========================================");
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.openAccount(1003, "siya", 75000.23);
		savingAccount.deposit(1275);
		savingAccount.withdraw(6000);
		savingAccount.calInterst(9);
		System.out.println("===========================================");
		HousingLoan housingLoan = new HousingLoan();
		housingLoan.openAccount(1002, "maya", 45000.23);
		housingLoan.deposit(1250);
		housingLoan.withdraw(8000);
		housingLoan.housingloan(4500);
		System.out.println("===========================================");
	}
}
