package Client;

import java.util.Scanner;

import com.tnsif.application.*;
import com.tnsif.framework.*;

public class Client {
	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(12452, "Rahul Agrawal", 4586521, true);
		CurrentAcc ca = new MMCurrentAcc(25754, "Mohit Patel", 45865, 500000);
		
		
		float accBal = sa.getAccBal();
		String accNm = sa.getAccNm();
		int accNo = sa.getAccNo();
		System.out.println("Your saving account no. is :"+accNo);
		System.out.println("account name is :"+accNm);
		System.out.println("your account Balance is :"+accBal);
		System.out.println("Enter your amount to withdraw from your account...");
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		sa.withdraw(amt);
		
	}

}
