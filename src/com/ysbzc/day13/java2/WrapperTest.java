package com.ysbzc.day13.java2;

import org.junit.Test;

/**
 * 
 * @Description 包装类
 * @author wyl
 * @date 2020-8-10 0:02:55
 */
/* 
 */
public class WrapperTest {
	// 基本数据类型---->包装类：调用包装类的结构
	@Test
	public void test1() {
		int num1 = 10;
		Integer in1= new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2= new Integer("3232");
		System.out.println(in2.toString());
		
		Float f1 = new Float(12.3);
		Float f2 = new Float("12.23");
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b3 = new Boolean(true);
		Boolean b4 = new Boolean("TrUeq");
		System.out.println(b3);
		System.out.println(b4);
		Boolean b1 = true  ;
		System.out.println(b1);
		
		
	}
	// 包装类---基本数据类型：调用xxxValue()
	@Test
	public void test2(){
		Integer in1 =new Integer(12);
		int i1 = in1.intValue();
		Float f1 =new Float(112.3);
		float f2 = f1.floatValue();
		
	}
	
	@Test
	public void test3(){
//		int num1 = 10 ;
//		method(num1);
		int num2 = 12;
		Integer in1 =num2;//自动装箱
		int num3 =in1; //自动拆箱
		
	}
	public void method(Object obj) {
		System.out.println(obj);
	}
	//String 转基本数据类型
	@Test
	public void test4() {
		int num1 =10;
		String str1 = num1 + "";
		float f1 =12.3f;
		String str2 = String.valueOf(f1);
		Double d1 = new Double(12.3);
		String str3 = String.valueOf(d1);
	}
//	String ---基本 parsexxx
	@Test
	public void test5() {
		String str1 = "123";
		int i1=Integer.parseInt(str1);
		String str2 = "true";
		boolean b1 = Boolean.parseBoolean(str2);
		
	}
	
}
