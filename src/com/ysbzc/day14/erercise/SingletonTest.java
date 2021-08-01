package com.ysbzc.day14.erercise;
/**
 * 
 * @Description 单例设计模式。保证对某个对象只有一个对象只存在一个实例对象
 * @author wyl
 * @date 2020-8-10 17:32:55
 */
public class SingletonTest {
	public static void main(String ...args) {
		Bank bank = Bank.getInstance();
		Bank bank1 = Bank.getInstance();
		System.out.println(bank == bank1);
		
	}
}
//饿汉式
class Bank{
	
	//1.私有化类的构造器
	private Bank() {
		
	}
	//2. 内部创建类的对象
	private static Bank instance = new Bank();
	
	//3.提供公共方法，返回类的对象
	public static Bank getInstance() {
		return instance;
	}
}