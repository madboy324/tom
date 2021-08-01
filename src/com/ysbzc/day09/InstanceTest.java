package com.ysbzc.day09;
/*
 * 万事万物皆对象
 * 1.在java语言范畴中，将功能结构，封装到类中，
 * 通过类的实例化，来调用具体的功能结构。
 * 2.java语言与前后端的交互时，都体现为类的对象
 * 3.匿名对象
 * 没有变量名
 * 只能调用一次
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.sendEmail();
		p.playGame();
		//匿名对象
		new Phone().sendEmail();
		new Phone().playGame();
	}
}
class Phone{
	double price;
	public void sendEmail() {
		System.out.println("发送邮件");
	}
	public void playGame() {
		System.out.println("王者荣耀");
	}
}