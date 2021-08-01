package com.ysbzc.day14.erercise;
/*
 * main()的使用
 * 1.main 是程序的入口
 * 2.main 方法是一个普通的静态方法
 * 3.main 方法可以作为与控制台的交互
 * 	
 */
public class MianTest {
	public static void main(String[] args) {
//		Main.main(new String[100]);
		for (int i = 0; i < args.length; i++) {
			System.out.println("******"+args[i]);
			
			int num = Integer.parseInt(args[i]);
			System.out.println("####"+num);
			}
	}
}
class Main{
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			args[i] = "args_" + i;
			System.out.println(args[i]);
		}
	}
}
