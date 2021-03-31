package com.spring.assignment3;

import java.util.Scanner;
import org.springframework.stereotype.Component;



@Component
public class BankAccountController {
	double withdrawAmount;
	double depositAmount;
	int initialBalance= 100000;
	
	public double withdraw(long accountId, double withdrawAmount) 
	{
		this.withdrawAmount=withdrawAmount;
		System.out.println("The amount that is withdrawn is: "+withdrawAmount);
		return 0;
		}
	public double deposit(long accountId, double depositAmount)
	{
		this.depositAmount= depositAmount;
		System.out.println("The amount that is deposited is: "+depositAmount);
				return 0;
				}
	public double getBalance(long accountId) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter deposit/withdraw/checking balance in 1/2/3");
		int deposit = sc.nextInt();
		if(deposit==1) {
			System.out.println("The amount in "+accountId+" after depositing "+depositAmount+" is: "+(initialBalance+depositAmount ) );}
		if(deposit==2) {
			System.out.println("The amount in "+accountId+" after with drwaing "+withdrawAmount+" is: "
		                    +(initialBalance-withdrawAmount ) );}
		if(deposit==3) System.out.println("The account balance is: "+initialBalance);
		return 0;}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		
		return false;}
}