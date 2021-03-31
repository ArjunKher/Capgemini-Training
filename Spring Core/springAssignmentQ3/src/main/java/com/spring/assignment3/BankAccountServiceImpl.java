package com.spring.assignment3;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

	@Component
	@Repository
	@Configuration
	public class BankAccountServiceImpl implements BankAccountService {

		double withdrawAmount;
		double depositAmount;
		int initialBalance= 100000;
		public double withdraw(long accountId, double withdrawAmount)
		{
			this.withdrawAmount=withdrawAmount;
			System.out.println("The amount withdrawn is: "+withdrawAmount);
			return 0;
			}
		public double deposit(long accountId, double depositAmount) 
		{
			this.depositAmount= depositAmount;
			System.out.println("The amount deposited is: "+depositAmount);
					return 0;
					}
		public double getBalance(long accountId) 
		{
			System.out.println("Enter the respective number please: 1.Deposit \n 2.Withdrawl");
			Scanner sc= new Scanner(System.in);
			int Deposit = sc.nextInt();
			if(Deposit==1) 
			{
				System.out.println(initialBalance+depositAmount );
				}
			else
				System.out.println(initialBalance-withdrawAmount  );	
			return 0;
			}
		public boolean fundTransfer(long fromAccount, long toAccount, double amount) 
		{
			
			
			return false;
			}
}
