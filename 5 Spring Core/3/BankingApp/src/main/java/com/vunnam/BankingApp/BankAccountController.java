package com.vunnam.BankingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAccountController {
	
	private BankAccount account;
	public BankAccountController() {
		
	}
	
	
	public BankAccountController(BankAccount account) {
		super();
		this.account = account;
	}


	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public double withdraw(long accountId, double balance) {
		//we use account id if it was in database; no need of id here
		double amountLeft = account.getAccountBalance()-balance;
		account.setAccountBalance(amountLeft);
		return amountLeft;
	}
	public double deposit(long accountId, double balance) {
		//we use account id if it was in database; no need of id here
		double totalAmount = account.getAccountBalance()+balance;
		account.setAccountBalance(totalAmount);
		return totalAmount;
	}
	public double getBalance(long accountId) {
		//we use account id if it was in database; no need of id here
		return account.getAccountBalance();
	}
	/*public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		
	}*/
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		BankAccountController controller = (BankAccountController)context.getBean("bankAccountController");
		double amountLeft = controller.withdraw(controller.getAccount().getAccountId(), 10000);
	    System.out.println(amountLeft);
		System.out.println(controller);
	}

	@Override
	public String toString() {
		return "BankAccountController [account=" + account + "]";
	}

}
