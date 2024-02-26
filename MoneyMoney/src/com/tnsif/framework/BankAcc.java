package com.tnsif.framework;

public abstract class BankAcc {
	int accNo;
	String accNm;
	float accBal;
	public BankAcc(int accNo,String accNm,float accBal)
	{
		super();
		this.accNo=accNo;
		this.accNm=accNm;
		this.accBal=accBal;
	}
	public int getAccNo()
	{
		return accNo;
	}
	public void setAccNo(int accNo)
	{
		this.accNo=accNo;
	}
	public String getAccNm()
	{
		return accNm;
	}
	public void setAccNo(String accNm)
	{
		this.accNm=accNm;
	}
	public float getAccBal()
	{
		return accBal;
	}
	public void setAccBal(float accBal)
	{
		this.accBal=accBal;
	}
	public void withdraw(float accBal)
	{
		System.out.println("withdraw limmit "+(accBal-500.0f));
	}
	public void deposite(float Bal)
	{
		System.out.println("your current account balance is "+(accBal));
	}
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + getAccBal() + "]";
	}
}
