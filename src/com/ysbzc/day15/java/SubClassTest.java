package com.ysbzc.day15.java;



public class SubClassTest {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.method2(); 
		sub.method3();
		CompareA.method1();
	}
}
class SubClass implements CompareA{
	
}