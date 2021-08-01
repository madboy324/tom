package com.ysbzc.day14.erercise;

public class AccountTest {
	public static void mian(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account("wyl_123",9999);
		Account.setInterestReat(0.012);
		Account .setMinMoney(100);
		System.out.println(Account.getInterestReat());
		
	}
}
