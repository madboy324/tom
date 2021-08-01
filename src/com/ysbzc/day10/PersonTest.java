package com.ysbzc.day10;
/*
 * 类的结构五种，属性，方法method，构造器 constructor
 * construct 构造 。construction constructor;
 * 作用，用来创建对象
 * 1.默认构造器空参
 *2. 权限修饰符 类名 （形参列表）{	}
 * 3.可以对构造器进行重载
 * 4.一旦定义了构造器，系统不再提供默认的空构造器
 * 5.一个类中一定会用一个或多个构造器
 * 
 * 
 * 
 */

/**
 * 
 * @Description constructor
 * @author wyl
 * @date 2020-8-2 15:15:19
 */
public class PersonTest {
	public static void main(String[] args) {
//		Person p=new Person(); 
//		p.setAge(12);
//		System.out.println(p.getAge());

		// 创建类对象 Person1 后的()
		Person1 p = new Person1();// = new Person1 + (空参构造器)
		System.out.println(p.age);
		
	}
}

class Person1 {
	// 属性
	String name;
	int age;

//	构造器
	public Person1() {
		this.age = 18;
	}
	public  Person1(String name,int age) {
		this.name =name;
		this.age = age;
  
	}

	// 方法
	public void eat() {
		System.out.println("吃饭");
	}

	public void study() {
		System.out.println("人可以学习 ");
	}
}
