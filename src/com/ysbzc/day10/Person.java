package com.ysbzc.day10;

public class Person {
	private int age;

	public void setAge(int a) {
		if (a < 0 || a > 130) {
//			throw new RuntimeErrorException("非法");
			System.out.println("传入非法");
			return;
		} else {
			age = a;
		}
	}

	public int getAge() {
		return age;
	}
}
