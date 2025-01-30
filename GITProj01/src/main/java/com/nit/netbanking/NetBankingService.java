package com.nit.netbanking;

import java.util.Random;

public class NetBankingService 
{
	public String openAccount(String aadhar,double initialamount,String type)
	{
		return "account is opened with acc number:: "+new Random().nextLong(28787678787443L);
	}
	
	public String withdraw(long acno,double amount)
	{
		return amount+" withdrawn from the account number::"+acno;
	}
	public String deposit(long acno,double amount)
	{
		return amount+" deposited into the account number::"+acno;
	}
	

	public String closdeAccount()
	{
		return "Account is closed";
	}
	public String transferMoney(long srcAcno,long destAcno,double amount)
	{
		return "transfering"+amount +" from "+srcAcno+ "to "+ destAcno;

	}
	
	public double checkBalance()
	{
		
	}
}
