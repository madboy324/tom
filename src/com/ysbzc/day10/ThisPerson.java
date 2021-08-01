package com.ysbzc.day10;
/**
 * 
 * @Description this关键字的使用
 * @author wyl
 * @date 2020-8-2 17:29:20
 */
/*
 * 修饰调用构造器 
 * 修饰属性：表示当前(动态)对象this.age
 * 在类的方法method中，可以通过this.属性或this.method 来调用对象属性
 * 特殊情况如果方法的形参和类的属性重名时，使用this.变量、
 * 放在首航
 */

public class ThisPerson {
	public static void main(String[] args) {
		ThisPerson person = new ThisPerson();
		
	}
}
class Person2{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void eat() {
		System.out.println("eat");
		this.study();
	}
	public void study() {
		System.out.println("study");
	}
	
}
