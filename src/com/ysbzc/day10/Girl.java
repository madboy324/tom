package com.ysbzc.day10;

public class Girl {
	private String name;
	private int age;
	public Girl() {
	}
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void marry(Boy boy) {
		System.out.println("我想嫁给"+boy.getName());
		boy.marry(this);
	}
	/**
	 * 
	 * @Description 比较两个对象的大小
	 * @author wyl
	 * @date 2020-8-2 18:08:47
	 * @param girl
	 * @return 正数 当前对象大；负数：当前对象小；0：当前对象与形参对象相等
	 */
	public int compare(Girl girl) {
//		if(this.age > girl.age) {
//			
//		}
		return this.age - girl.age;
	}
	
	
}
