package com.ysbzc.day15;

import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入当月月份：");
//		int month = scanner.nextInt();
		
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH)+1;
		Employee[] emps = new Employee[2];
		emps[0] = new SalariedEmployee("wyl", 1001, new MyDate(1992, 2, 28), 10000);
		emps[1] = new HourlyEmployee("lkh", 2001, new MyDate(1999, 8, 6), 60, 240);

		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i]);
			double salary = emps[i].earnings();
			System.out.println("月工作：" + salary);
			if(month ==emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐！奖励一百元");
			}
		}
	}
}
