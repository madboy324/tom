package com.ysbzc.day10.exer;

public class Account {
	private int id;
	private double balance;
	private double annualInerestRate;
	public Account(int id, double balance, double annualInerestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInerestRate = annualInerestRate;
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
	
	public double getAnnualInerestRate() {
		return annualInerestRate;
	}
	
	public void setAnnualInerestRate(double annualInerestRate) {
		this.annualInerestRate = annualInerestRate;
	}
	
	public void withdraw(double amount) {
		if(balance < amount) {
			System.out.println("余额不足，取款失败");
			return ;
		}
		balance -= amount;
		System.out.println("成功取出："+amount);
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("成功存入"+amount);
		}
	}
	
}
