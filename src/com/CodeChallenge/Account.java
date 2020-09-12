package com.CodeChallenge;

public class Account {

	private String accountNumber;
	private String[] payee;
	private Double balance;
	private String password;
	private Integer cvv;
	private Integer pin;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String[] getPayee() {
		return payee;
	}

	public void setPayee(String[] payee) {
		this.payee = payee;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}
		
	public Account(String accountNumber, String[] payee, Double balance, String password, Integer cvv, Integer pin) {
		super();
		this.accountNumber = accountNumber;
		this.payee = payee;
		this.balance = balance;
		this.password = password;
		this.cvv = cvv;
		this.pin = pin;
	}

}
