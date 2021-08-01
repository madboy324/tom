package com.ysbzc.day10.exer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer cust = new Customer("Jane", "Smith");
		
		Account account = new Account(1000,2000,0.0123);
		
		cust.setAccount(account);
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		System.out.println("Customer [" + cust.getLastName()+","
				+cust.getFirstName()+"] has a account id is"+
				cust.getAccount().getId()+",利率"+cust.getAccount().getAnnualInerestRate()
				*100 +"%,balance is" +cust.getAccount().getBalance());
	
	}
}
