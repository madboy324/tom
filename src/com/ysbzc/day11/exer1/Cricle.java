package com.ysbzc.day11.exer1;

public class Cricle {
	private double radius;//半径
	public Cricle() {
		this.radius = 1.0;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double findArea() {
		return radius*radius*Math.PI;
	}

}
