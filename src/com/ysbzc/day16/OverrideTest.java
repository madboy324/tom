package com.ysbzc.day16;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 
 * 子类重写的规则之一；
 * 子类重写的方法抛出的异常类型不大于父类被重新的方法抛出的异常类型
 * 开发中如何选择try catch finally 
 * 如果父类中被重写的方法中没有throws 方式，则子类重写的方法也不能
 * 使用throws,意味着如果子类重写的方法中有异常，必须使用try - catch-finally
 * 
 * 执行的方法A中，先后又调用了另外的几个方法，这几个方法是递进的关系
 * 建议这几个方法使用throws的方式进行处理，而执行的方法A可以考虑使用try catch finally
 * 方式进行处理。
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class OverrideTest {
	public static void main(String[] args) {
		OverrideTest test = new OverrideTest();
		test.display(new SuperClass());
	}
	public void display(SuperClass s) {
		try {
			s.method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class SuperClass {
	public void method() throws IOException {

	}
}

class SubClass extends SuperClass {
	public void method() throws FileNotFoundException {

	}
}
