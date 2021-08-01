package com.ysbzc.day13;



public class Test {
	  public static void main(String[] args) {
			Circle c1 = new Circle(2.3);
			Circle c2 = new Circle(3.3,new String("white"),2.0);
			System.out.println("color is equal ?"+c1.getColor().equals(c2.getColor()));
			System.out.println("半径是否相等："+c1.equals(c2));
			System.out.println(c1.toString());
			System.out.println(c1);
		}

}

class GeometricObject {
	protected String color;
	protected double weight;

	protected GeometricObject() {
		super();
		this.color = "white";
		this.weight = 1.0;
	}

	protected GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	

}
class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		super();
		radius = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius,String color,double weight) {
		super(color,weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return 3.14*radius*radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			return this.radius == c.radius;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}