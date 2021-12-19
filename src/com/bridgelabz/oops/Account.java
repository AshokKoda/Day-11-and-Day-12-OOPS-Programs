package com.bridgelabz.oops;

import java.util.Scanner;

public class Account {

	double accountBalance;
	
	public Account(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	/*
	 * check account balance and debit some amount
	 */
	public void debitAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount:");
		int debitAmt = sc.nextInt();
		
		if (debitAmt < accountBalance) {
			accountBalance = accountBalance + debitAmt;
			System.out.println("Debit amount is : " + debitAmt);
			System.out.println("Account balance after update : " + accountBalance);
		} else {
			System.out.println("Debit amount exceeded Account balance");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account balance : ");
		Account account = new Account(sc.nextDouble());
		account.debitAmount();

	}

}
