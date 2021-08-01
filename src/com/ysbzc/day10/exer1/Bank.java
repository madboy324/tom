package com.ysbzc.day10.exer1;

public class Bank {
	private Customer[] customers;// 存放客户的数组
	private int numberOfCustomers; // 记录客户的个数

	public Bank() {
		customers = new Customer[10];
	}
	/**
	 * 
	 * @Description 添加客户
	 * @author wyl
	 * @date 2020-8-2 19:31:44
	 * @param f 名
	 * @param l 姓
	 */
	public void addCustomer(String f,String l) {
		Customer customer = new Customer(f,l);
		customers[numberOfCustomers++] =customer;
		
	}
	/**
	 * 
	 * @Description 获取用户的个数
	 * @author wyl
	 * @date 2020-8-2 23:04:35
	 * @return
	 */
	public int getNumOfCustomers() {
		return numberOfCustomers;
		
	}
	/**
	 * 
	 * @Description 获取指定位置上的客户
	 * @author wyl
	 * @date 2020-8-2 23:05:32
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index) {
		if(index >= 0 && index < numberOfCustomers) {
			return customers[index];
		}
		
		return null;
	}
	
}
