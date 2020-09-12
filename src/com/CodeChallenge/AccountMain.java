package com.CodeChallenge;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of accounts :");
		int n = sc.nextInt();
		System.out.println("Enter the account details :");
		Account acc[] = new Account[n];
		String[] details = new String[n];
		for (int i = 0; i < n; i++) {
			details[i] = sc.next();
		}
		int k = 0;
		for (String string : details) {
			String[] s = string.split(",");
			acc[k] = new Account(s[0], null, Double.parseDouble(s[1]), s[2], Integer.parseInt(s[3]),
					Integer.parseInt(s[4]));
			k++;
		}
		boolean flag = true;
		while (flag) {
			System.out.println("1. Browser\n2. Mobile\n3. Wallet\n4. Exit");
			System.out.println("Enter the choice :");
			int choice = sc.nextInt();
			Boolean auth;
			switch (choice) {
			case 1:
				System.out.println("Enter the account number :");
				String accNum = sc.next();
				System.out.println("Enter the password :");
				String pass = sc.next();
				Browser b = new Browser();
				auth = b.authentication(acc, accNum, pass);
				while (auth) {
					System.out.println("1. Money Transfer\n2. Add Payee\n3. Logout");
					int select = sc.nextInt();
					switch (select) {
					case 1:
						System.out.println("Available Payees :");
						for (Account account : acc) {
							if (account.getAccountNumber().equalsIgnoreCase(accNum)) {
								for (String string : account.getPayee()) {
									System.out.println(string);
								}
								System.out.println("Enter the payee's account number :");
								String pAcc = sc.next();
								System.out.println("Enter the amount to be tranferred :");
								double amount = sc.nextDouble();
								b.moneyTransfer(acc, accNum, amount, pAcc);
								System.out.println("Available Balance is " + account.getBalance());
								break;
							}
						}

						break;
					case 2:
						System.out.println("Enter the number of payees :");
						int nPayees = sc.nextInt();
						String[] payee = new String[nPayees];
						System.out.println("Enter the payee's account numbers :");
						for (int i = 0; i < nPayees; i++) {
							payee[i] = sc.next();
						}
						b.addPayee(acc, accNum, payee);
						break;
					case 3:
						auth = false;
						break;
					default:
						break;
					}
				}
				break;
			case 2:
				System.out.println("Enter the account number :");
				accNum = sc.next();
				System.out.println("Enter the PIN Number :");
				String pin = sc.next();
				Mobile m = new Mobile();
				auth = m.authentication(acc, accNum, pin);
				while (auth) {
					System.out.println("1. Money Transfer\n2. Add Payee\n3. Logout");
					int select = sc.nextInt();
					switch (select) {
					case 1:
						System.out.println("Available Payees :");
						for (Account account : acc) {
							if (account.getAccountNumber().equalsIgnoreCase(accNum)) {
								for (String string : account.getPayee()) {
									System.out.println(string);
								}
								System.out.println("Enter the payee's account number :");
								String pAcc = sc.next();
								System.out.println("Enter the amount to be tranferred :");
								double amount = sc.nextDouble();
								m.moneyTransfer(acc, accNum, amount, pAcc);
								System.out.println("Available Balance is " + account.getBalance());
								break;
							}
						}

						break;
					case 2:
						System.out.println("Enter the number of payees :");
						int nPayees = sc.nextInt();
						String[] payee = new String[nPayees];
						System.out.println("Enter the payee's account numbers :");
						for (int i = 0; i < nPayees; i++) {
							payee[i] = sc.next();
						}
						m.addPayee(acc, accNum, payee);
						break;
					case 3:
						auth = false;
						break;
					default:
						break;
					}
				}
				break;
			case 3:
				System.out.println("Enter the account number :");
				accNum = sc.next();
				System.out.println("Enter the CVV Number :");
				pass = sc.next();
				Wallet w = new Wallet();
				auth = w.authentication(acc, accNum, pass);
				while (auth) {
					System.out.println("1. Money Transfer\n2. Add Payee\n3. Logout");
					int select = sc.nextInt();
					switch (select) {
					case 1:
						System.out.println("Available Payees :");
						for (Account account : acc) {
							if (account.getAccountNumber().equalsIgnoreCase(accNum)) {
								for (String string : account.getPayee()) {
									System.out.println(string);
								}
								System.out.println("Enter the payee's account number :");
								String pAcc = sc.next();
								System.out.println("Enter the amount to be tranferred :");
								double amount = sc.nextDouble();
								w.moneyTransfer(acc, accNum, amount, pAcc);
								System.out.println("Available Balance is " + account.getBalance());
								break;
							}
						}

						break;
					case 2:
						System.out.println("Enter the number of payees :");
						int nPayees = sc.nextInt();
						String[] payee = new String[nPayees];
						System.out.println("Enter the payee's account numbers :");
						for (int i = 0; i < nPayees; i++) {
							payee[i] = sc.next();
						}
						w.addPayee(acc, accNum, payee);
						break;
					case 3:
						auth = false;
						break;
					default:
						break;
					}
				}
				break;
			case 4:
				flag = false;
				break;
			default:
				break;
			}
		}
	}

}
