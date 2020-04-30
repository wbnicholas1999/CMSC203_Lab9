/**
 * 
 * @author William Nicholas
 *
 */

public class CheckingAccount extends BankAccount {
	private double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		
		setAccountNumber(getAccountNumber()+"-10");
	}
	
	public boolean withdraw(double amount) {
		return super.withdraw(amount+FEE);
	}
}
