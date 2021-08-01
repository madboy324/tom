package com.ysbzc.day10;

public class Appointment {
	public static void main(String[] args) {
		Boy boy = new Boy("罗密也",21);
		boy.shout();
		Girl girl = new Girl("朱丽叶",18);
		girl.marry(boy);
		Girl girl2 = new Girl("祝英台",19);
		int compare = girl.compare(girl2);
		System.out.println();
		if(compare > 0) {
			System.out.println(girl.getName()+"bigger");
		}else if (compare < 0) {
			System.out.println(girl.getName()+"big");
		}else {
			System.out.println(girl.getName()+"same");
		}
	}
}
