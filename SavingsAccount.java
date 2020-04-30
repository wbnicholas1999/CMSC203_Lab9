/**
 * 
 * @author William Nicholas
 *
 */

public class SavingsAccount extends BankAccount {
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		
		savingsNumber++;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		double balance = getBalance();
		balance += (balance * rate / 12);
		deposit(balance);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
