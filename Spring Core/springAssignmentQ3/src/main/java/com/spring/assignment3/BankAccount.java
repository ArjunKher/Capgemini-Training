package com.spring.assignment3;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class BankAccount {
	 private long accountId;
	 private String accountHolderName;
	 private String accountType;
	 private double accountBalance;
	public long getAccountId() {
		return accountId;
	}
	
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double  accountBalance) {
		this.accountBalance = accountBalance;
	}
}
