package com.tnsif.application;

import com.tnsif.framework.BankFactory;
import com.tnsif.framework.currentgacc;
import com.tnsif.framework.savingacc;

public class MMBankFactory extends BankFactory { 

	@Override
	public savingacc getSavingAccount(int accno, String accNm, float accBal, boolean isSalaried) {
		boolean isSalary = false;
		savingacc SavingAcc=new MMSavingAcc(accno,accNm,accBal,isSalary);
		return SavingAcc;
	}

	@Override
	public currentgacc getCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc CurrentAcc=new MMCurrentAcc(accNo,accNm,creditLimit, creditLimit); 
		return CurrentAcc;
	}
	
}
