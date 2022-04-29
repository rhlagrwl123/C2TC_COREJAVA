package com.tnsif.framework;

public abstract class BankAcc {
	private int accNo;
	protected String accNm;
	protected float accBal;
	
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}


	public void withdraw(float accBal) {}
	
	public void deposit(float accBal)
	{
		
	}


	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
