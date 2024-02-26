package com.tnsif.framework;

public abstract class BankFactory {
	public abstract savingacc getSavingAccount(int AccNo, String accNm, float accBal,boolean isSalaried);
	public abstract currentgacc getCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit);
			
}
