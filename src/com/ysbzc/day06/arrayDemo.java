package com.ysbzc.day06;

import java.util.Scanner;

/**
 * 
 * @Description 测试二
 * @author wyl
 * @date 2020-7-26 20:26:05
 */
public class arrayDemo {
	public static void main(String[] args) {
//		1.Scanner 读取学生个数
		Scanner scnner = new Scanner(System.in);
		System.out.println("请输入学生人数");
		int number = scnner.nextInt();
//		2.创建数组,储存学生成绩;动态化初始
		int[] scores =new int[number];
//		3.给元素赋值
		System.out.println("请输入"+number+"个学生:");
		int maxScore = 0;
		for(int i=0;i < scores.length;i++) {
			scores[i]=scnner.nextInt();
			if(maxScore < scores[i]) {
				maxScore = scores[i];
		}
//		4.取元素最大值

		}
//		5.根据差值,得到学生等级
		char level ;
		for(int i = 0; i <scores.length;i++) {
			if(maxScore - scores[i]<= 10) {
				level ='A';
			}else if(maxScore - scores[i]<= 20) {
				level ='B';
			}else if(maxScore - scores[i]<= 30) {
				level ='C';
			}else {
				level ='D';
			}
		System.out.println("学生:"+i+"成绩"
			+scores[i]+",级别"+level);
		}
		
	}
}
