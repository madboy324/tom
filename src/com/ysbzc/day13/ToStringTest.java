package com.ysbzc.day13;

import java.util.Date;

/**
 * 
 * @Description toString 的使用
 * @author wyl
 * @date 2020-8-9 19:53:35
 */
public class ToStringTest {
	public static void main(String[] args) {
		MyDate myDate = new MyDate(1,2,3);
		System.out.println(myDate.toString());
		System.out.println(myDate);
		String str = new String("MM");
		System.out.println(str);
		Date date = new Date();
		System.out.println(date.toString());
	}
}
