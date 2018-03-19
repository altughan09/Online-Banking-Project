package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="primary_account")
public class PrimaryAccount {
   
	@Id
	@Column(name="ACCOUNT_ID")
    private String accountID;
	
	@Column(name="ACCOUNT_NUMBER")
    private int accountNumber;
    
	@Column(name="ACCOUNT_BALANCE")
    private int accountBalance;
	
	public PrimaryAccount() {
		
	}

	public PrimaryAccount(int accountNumber, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "PrimaryAccount [accountID=" + accountID + ", accountNumber=" + accountNumber + ", accountBalance="
				+ accountBalance + "]";
	}


	
	
}
