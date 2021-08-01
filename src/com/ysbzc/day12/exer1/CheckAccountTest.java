package com.ysbzc.day12.exer1;

public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount test =new CheckAccount(1122, 20000, 0.045, 5000);
		
		test.withdraw(1000);
		System.out.println("你的账户余额："+test.getBalance());
		System.out.println("你的可透支额度："+test.getOverdraft());
		test.withdraw(18000);
		System.out.println("你的账户余额："+test.getBalance());
		System.out.println("你的可透支额度："+test.getOverdraft());
		test.withdraw(3000);
		System.out.println("你的账户余额："+test.getBalance());
		System.out.println("你的可透支额度："+test.getOverdraft());
	}
}
