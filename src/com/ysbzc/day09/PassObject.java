package com.ysbzc.day09;

public class PassObject {
	public static void main(String[] args) {
		PassObject test = new PassObject();
		Circle c = new Circle();
		test.printAreas(c, 5);
		System.out.println("now radius is " + c.radius);
	}

	public void printAreas(Circle c, int time) {
		System.out.println("Radius\t\tArea");
		// 设置圆的半径
		int i = 1;
		for (; i <= time; i++) {
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		c.radius = time + 1;
		c.radius = i;
	}
}
