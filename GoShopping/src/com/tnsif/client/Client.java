package com.tnsif.client;

import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;
import com.tnsif.application.GSShopFactory;
import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class Client{
	public static void main(String[] args) {
		 
		GSShopFactory sf = new GSShopFactory();
		
		PrimeAcc pa = new GSPrimeAcc(101, "Mrudula", 395.0f, false);
		
		pa.bookProduct(pa.getCharges());
		pa.toString();
		
		NormalAcc na = new GSNormalAcc(201, "Shinde", 250.0f, 59.0f);
		na.bookProduct(na.getDeliveryCharges());
		na.toString();
	}

}
