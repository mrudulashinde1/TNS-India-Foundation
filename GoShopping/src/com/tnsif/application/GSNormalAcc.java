package com.tnsif.application;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		 
	}
	public void bookProduct(float deliveryCharges) {
		System.out.println(" Your Normal account charges is : " + getDeliveryCharges());
		System.out.println(" Delivery Charges  : " + deliveryCharges);
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNm() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getDeliveryCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	 

}
