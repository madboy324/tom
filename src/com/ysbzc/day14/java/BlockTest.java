package com.ysbzc.day14.java;
/**
 * 1.代码块作用：初始化类，对象
 * 2、只能用static 修饰
 * 3、静态代码块 vs 非静态代码块
 * 4、静态代码块
 * >输出语句
 * >随着类的加载而执行，只执行一次
 * > 静态优先于非静态
 * >按照上下的顺序执行
 * >静态只能调用静态
 * 
 * 5、非静态代码块
 * >输出语句
 * >随着对象的创建而执行
 * >每创建一个对象，就执行一次非静态代码块
 * >作用：在创建对象时，对对象的属性进行初始化
 * > 
 * 
 */
public class BlockTest {
	public static void main(String[] args) {
		String desc = Person.desc ;
		Person person1 = new Person();
		Person person2 = new Person();
		System.out.println(desc);
		System.out.println(person1);
		System.out.println(person2);
	}

}

class Person{
	//属性
	String name;
	int age;
	
	static String desc = "I am a human" ;
	
	//构造器
	public Person() {
		
	}
	public Person (String name,int age) {
		this.name =name;
		this.age = age; 
	} 
	
	//代码块
	static{
		System.out.println("hello ,static block-3");
		desc = "我是一个爱学习的人";
	}
	static{
		System.out.println("hello ,static block-2");
		desc = "我是一个爱学习的人";
	}
	
	{
		System.out.println("hello block");
	}
	
	
	//方法
	public void eat() {
		System.out.println("吃饭");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static void info() {
		System.out.println("我是一个快乐的人");
	}
	
}