package com.ysbzc.day10.exer1;

public class Account {
	private double balance;
	public Account(double init_balance) {
		this.balance =init_balance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amt) {
		if(amt > 0) {
			balance += amt;
			System.out.println("您已经成功存入 "+amt+" 元"+"，当前余额："+balance);
		}
	}
	public void withdraw(double amt) {
		if(balance >= amt) {
			balance -= amt;
			System.out.println("您已经成功取走 "+amt+" 元"+",当前余额："+balance);
		}else {
			System.out.println("取钱失败");
		}
	}
}

