package com.ysbzc.day15.java;
/*
 */
public interface CompareA {
	//静态方法
	public static void method1() {
		System.out.println("1");
	}
	//默认方法
	public default void method2() {
	
		System.out.println("2");
	}
	//默认方法
	 default void method3() {
		System.out.println("3");
	}
}
