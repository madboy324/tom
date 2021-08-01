package com.ysbzc.day14.erercise;
/*
 * 单例模式，懒汉式实现:好处：延迟对象的创建
 * 					坏处：目前写的不安全
 * 			饿汉式：好处：对象加载时间过长
 * 					坏处：饿汉式是线程安全的；
 * 
 */
public class SingletonTest2 {
	public static void main(String[] args) {
		Order order1 = Order.getInstamce();
		Order order2 = Order.getInstamce();
		System.out.println(order1 == order2);
	}
}
class Order {
	//1私有化类的构造器
	private Order() {
		
	}
	//2.声明当前类对象，没有初始化
	private static Order instance = null;
	
	//3、 声明普public static 的返回当前类对象的方法
	public static Order getInstamce() {
		if (instance == null) {
			instance = new Order();
		}
		return instance;
	}
	
}