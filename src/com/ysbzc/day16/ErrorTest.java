package com.ysbzc.day16;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.util.Scanner;

import org.junit.Test;

public class ErrorTest {
	public static void main(String[] args) {
//		java.lang.StackOverflowError栈溢出
		main(args);
		
//		Integer[] air = new Integer();
		String str = "abc";
		str = null ;
		System.out.println(str.charAt(1));
		
	}
//	public void test2() {
//		int[] arr = new int[10];
//	
//	}
	@Test
	public void test3() {
		Object object = new Date(0);
		String string = (String)object;
	}
	public void test4() {
		String string = "123";
		
	}
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
	}
	@Test
	private void test6() {
		int a = 1;
		int b = 0;
		System.out.println(a / b);
	}
//	private  void  test61() {
//		File file = new File("eewr");
//		FileInputStream fileInputStream = new FileInputStream(file);
//		int data = fileInputStream.	read();
//		while (data =fileInputStream) {
//			type type = (type) en.nextElement();
//			
//		}
//	}
}
