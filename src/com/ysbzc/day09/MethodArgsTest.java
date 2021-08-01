package com.ysbzc.day09;
/**
 * 
 * @Description 可变个数形参的方法
 * @author wyl
 * @date 2020-8-1 12:19:15
 */
/*
 * 当调用可变实参无论传多少同类型值，都能进行调用
 * 可变个数形参的方法与本类中方法名相同，形参不同的进行
 * 写在后面，最多只能声明一个参数
 */
public class MethodArgsTest {
	public static void main(String ...args) {
		MethodArgsTest test = new MethodArgsTest();
		
		test.show("hello","Word",1);
	}
//	public void show(int ...strs) {
//		
//	}
//	public void show(String s) {
//		
//	}
//	public void show(String ...strs){
//		
//	}
	public void show(Object ...objects) {
		System.out.println(objects);
	}
}
