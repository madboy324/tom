package com.ysbzc.day11.exer1;
//父类的返回为A类
public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cy = new Cylinder();
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volume = cy.findVolume();
		System.out.println("圆柱的体积为"+volume);
		System.out.println(cy.findArea());
		//重写以后
	}
}
