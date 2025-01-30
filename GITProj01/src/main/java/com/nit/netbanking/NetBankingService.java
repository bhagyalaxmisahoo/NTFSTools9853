package com.nit.netbanking;

import java.util.Random;

public class NetBankingService 
{
	public String openAccount(String aadhar,double initialamount,String type)
	{
		return "account is opened with acc number:: "+new Random().nextLong(28787678787443L);
	}
}
