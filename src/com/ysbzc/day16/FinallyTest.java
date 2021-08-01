package com.ysbzc.day16;
/*
 * try-catch-finally
 * 1.finally 是可选择写与不写
 * 2、finally 中声明的是一定会被执行的代码，即使catch有异常
 * 3.什么时候用，数据库连接，输入输出流，网络编程中的Socket资源等，JVM
 * 无法自己回收 的，此时进行手动的资源释放
 */

import org.junit.Test;

public class FinallyTest {
	
	
	@Test
	public void testMethod(){
		int num = method();
		System.out.println(num);
	}
	
	
	
	
	public int  method() {
		try {
			int [] arr = new int[10];
			System.out.println(arr[10]);
			return 1;
			} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("李壮壮是个傻逼");
			return 3;
		}
		
	}

	@Test 
	public void test1() {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			int [] arr = new int[10];
			System.out.println(arr[10]);
			
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
//		finally {
//			System.out.println("我好帅呀	~~");
//		}
		
		System.out.println("我好帅呀	~~");
	}
}
