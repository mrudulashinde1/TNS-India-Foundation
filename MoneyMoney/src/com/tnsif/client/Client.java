package com.tnsif.client;

import com.tnsif.application.MMCurrentAcc;
import com.tnsif.application.MMSavingAcc;
import com.tnsif.application.MMBankFactory;
import com.tnsif.framework.BankFactory;
import com.tnsif.framework.currentgacc;
import com.tnsif.framework.savingacc;

public class Client {
	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();

		savingacc sa = new MMSavingAcc(345432344, "mrudula", 4000, false);
		sa.withdraw(sa.getAccBal());
		sa.toString();

		currentgacc ca = new MMCurrentAcc(543452344, "Priti", 50000, 10000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();

	}
}
