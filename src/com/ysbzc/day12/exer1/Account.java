package com.ysbzc.day12.exer1;

public class Account {
	private int id;
	private double balance ;
	private double annuallnerestRate;
	
	public Account(int id, double balance, double annuallnerestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annuallnerestRate = annuallnerestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnuallnerestRate() {
		return annuallnerestRate;
	}

	public void setAnnuallnerestRate(double annuallnerestRate) {
		this.annuallnerestRate = annuallnerestRate;
	}
	/**
	 * 
	 * @Description 返回月利率
	 * @author wyl
	 * @date 2020-8-6 19:08:50
	 * @return月利率
	 */
	public double getMonthlyInterest() {
		return annuallnerestRate /12 ;
	}
	
	/**
	 * 
	 * @Description 取钱
	 * @author wyl
	 * @date 2020-8-6 19:10:34
	 * @param amount
	 */
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return;
		}
		System.out.println("余额不足");
	}
	/**
	 * 
	 * @Description 存钱
	 * @author wyl
	 * @date 2020-8-6 19:10:40
	 * @param amount
	 */
	public void deposit (double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
}
