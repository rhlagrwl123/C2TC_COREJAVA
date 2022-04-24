package com.tnsif.framework;

import com.tnsif.application.MMCurrentAcc;
import com.tnsif.application.MMSavingAcc;

public interface BankFactory {
	 MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);
	 MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
	

}
