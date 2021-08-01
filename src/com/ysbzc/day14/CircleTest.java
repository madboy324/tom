package com.ysbzc.day14;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle1= new Circle();
		Circle circle2= new Circle();
		Circle circle3= new Circle(3.4);
		System.out.println(circle1.getId());
		System.out.println(circle2.getId());
		System.out.println(Circle.getTotal());
		System.out.println(circle3.findArea());
		
	}

}
class Circle{
	private double radius;
	private int id;
	public Circle() {
		id = init++;
		total++;
	}
	public Circle(double radius) {
		this();
		this.radius = radius ;
	}
	
	private static int total; //记录圆的个数
	private static int init =1001; //自增的id
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static int getTotal() {
		return total;
	}


	public static void setTotal(int total) {
		Circle.total = total;
	}


	public static int getInit() {
		return init;
	}


	public static void setInit(int init) {
		Circle.init = init;
	}


	public double findArea() {
		return 3.14*radius*radius;
	}
}