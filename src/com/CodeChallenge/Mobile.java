package com.CodeChallenge;

public class Mobile implements UPI{

	@Override
	public void addPayee(Account[] accounts, String accountNumber, String[] payees) {
		for (Account account : accounts) {
			if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
				account.setPayee(payees);
			}
		}
	}

	@Override
	public void moneyTransfer(Account[] accounts, String accountNumber, Double amount, String payeeAccountNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
				for (String payee : account.getPayee()) {
					if (payee.equalsIgnoreCase(payeeAccountNumber)) {
						account.setBalance(account.getBalance() - amount);
						break;
					}
				}
			}
		}
	}

	@Override
	public Boolean authentication(Account[] accounts, String accountNumber, String pin) {
		for (Account account : accounts) {
			if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
				{
					if (account.getPin()==Integer.parseInt(pin)) {
						return true;
					}
					break;
				}
			}
		}
		return false;
	}

}
