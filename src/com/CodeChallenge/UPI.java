package com.CodeChallenge;

public interface UPI {

	public void addPayee(Account[] accounts, String accountNumber, String[] payees);

	public void moneyTransfer(Account[] accounts, String accountNumber, Double amount, String payeeAccountNumber);

	public Boolean authentication(Account[] accounts, String accountNumber, String password);
}
	