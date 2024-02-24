package com.tnsif.application;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopAcc;
import com.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {
	 
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		
		PrimeAcc primeacc = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return primeacc;
	}

	 
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		 
		GSNormalAcc normalacc = new GSNormalAcc(accNo, accNm, charges, charges);
		return normalacc;
	}

}
