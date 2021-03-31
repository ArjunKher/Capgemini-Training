package com.spring.assignment3;

import org.springframework.stereotype.Component;

 @Component
public class BankAccountRepositoryImpl implements BankAccountRepository {
     double initialBalance=100000;

	public double getBalance(long accountId) {
		System.out.println("The user's account balance is: "+initialBalance);
		return 0;
	}

	public double updateBalance(long accountId, double newBalance) {
		newBalance=initialBalance+newBalance;
		
		System.out.println("The user's account balance is: "+newBalance);
		return 0;
	}

}