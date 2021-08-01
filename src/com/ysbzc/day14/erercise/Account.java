package com.ysbzc.day14.erercise;

public class Account {
	private int id;
	private String pwd = "123456";
	private double balance;

	private static double interestReat;
	private static double minMoney = 100;
	private static int init = 40117101; // 自动生成ID

	public Account() {
		id = init++;
	}

	public Account(String pwd, double balance) {
		this();
		this.pwd = pwd;
		this.balance = balance;

	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static double getInterestReat() {
		return interestReat;
	}

	public static void setInterestReat(double interestReat) {
		Account.interestReat = interestReat;
	}

	public static double getMinMoney() {
		return minMoney;
	}

	public static void setMinMoney(double minMoney) {
		Account.minMoney = minMoney;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

}
