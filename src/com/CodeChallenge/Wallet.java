package com.CodeChallenge;

public class Wallet implements UPI{

	@Override
	public void addPayee(Account[] accounts, String accountNumber, String[] payees) {
		// TODO Auto-generated method stub
		for (Account account : accounts) {
			if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
				account.setPayee(payees);
			}
		}
	}

	@Override
	public void moneyTransfer(Account[] accounts, String accountNumber, Double amount, String payeeAccountNumber) {
		// TODO Auto-generated method stub
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
	public Boolean authentication(Account[] accounts, String accountNumber, String cvv) {
			for (Account account : accounts) {
				if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
					{
						if (account.getCvv()==Integer.parseInt(cvv)) {
							return true;
						}
						break;
					}
				}
			}
			return false;
	}

}
