package com.ysbzc.day08;
/**
 * 
 * @Description 计算圆的面积
 * @author wyl
 * @date 2020-7-31 18:56:44
 */
public class CricleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 100;
		double area = c1.findArea();
		System.out.println("S:"+area);
		c1.finsArea1();
		
	}
}
class Circle{
	double radius;
	//求面积
	public double findArea() {
		double area = Math.PI*radius*radius;
		return area;
	}
	public void finsArea1() {
		double area = Math.PI*radius*radius;
		System.out.println("S:"+area);
	}
}
