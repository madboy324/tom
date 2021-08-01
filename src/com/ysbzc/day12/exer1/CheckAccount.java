package com.ysbzc.day12.exer1;

public class CheckAccount extends Account{
	
	private double overdraft; //可透支的限额

	public CheckAccount(int id, double balance, double annuallnerestRate,double overdraft) {
		super(id, balance, annuallnerestRate);
		this.overdraft = overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		//余额足够时
		if(getBalance() >= amount) {
//			setBalance(getBalance() -amount);
			super.withdraw(amount);
		} else if(overdraft >= amount - getBalance()) { //透支额度+足够消费
			overdraft -= amount -getBalance();
//			setBalance(0);
			super.withdraw(getBalance());
			
		} else {
			System.out.println("超过可透支余额");
		}
	}
}
