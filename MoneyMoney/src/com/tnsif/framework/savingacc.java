package com.tnsif.framework;

public abstract class savingacc extends BankAcc {
	private boolean isSalary;
	private static final float minBal=500.0f;
	
	public savingacc(int accNo, String accNm, float accBal,boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary=isSalary;
	}
	public boolean isSalary()
	{
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public static float getMinbal() {
		return minBal;
	}

	public void withdraw(float accBal) { 
		System.out.println("withdraw limit: " + (accBal - 500.0f));
	}
	 
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}

}
