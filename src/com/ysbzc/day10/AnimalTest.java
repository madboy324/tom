package com.ysbzc.day10;
/**
 * 
 * @Description 面向对象封装与隐藏
 * @author wyl
 * @date 2020-8-2 14:00:50
 */
/*
 * 一、问题的引入：
 * 对象。属性调用时对对象的属性进行以及赋值
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "大黄";
		a.age = 1;
		a.setLegs(55) ;//The field Animal.legs is not visible
		a.show();
		System.out.println(a.getLegs());
	}
}
class Animal{
	String name;
	protected int age ;
	private int legs;
	
	public void eat() {
		System.out.println("动物进食");

	}
	public void show() {
		System.out.println("name = "+name+
				",age = "+age);
	}
//	public void setLegs(int legs) {
//		if(legs >= 0 && legs % 2 == 0) {
//			
//		}
//	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLegs() {
		return legs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
