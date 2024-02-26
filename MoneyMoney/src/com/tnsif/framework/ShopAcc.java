package com.tnsif.framework;

public abstract class ShopAcc {
	int accNo;
	String accNm;
	float charges;
	
	public ShopAcc(int accNo,String accNm,float charges)
	{
		super();
		this.accNo=accNo;
		this.accNm=accNm;
		this.charges=charges;
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
	public float getCharges()
	{
		return charges;
	}
	public void setAccBal(float charges)
	{
		this.charges=charges;
	}
	public void bookProduct(float charges)
	{
		System.out.println(" the price of book is : " + charges);
	}
	public void items(float charges)
	{
		System.out.println("price with delivery charges is : " + (charges + 100.0f));
	}
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + getCharges() + "]";
	}
}
