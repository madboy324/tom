package com.ysbzc.day15.java;

public interface CompareObject {
	public int compareTo(Object o);
}

class Circle{
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Double radius) {
		super();
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	
}
class ComparebleCircle extends Circle implements CompareObject{
	 public ComparebleCircle(double radius) {
		super(radius);
	} 
	@Override
	public int compareTo(Object o) {
		if(this == o) {
			return 0;
		}
		if(o instanceof ComparebleCircle) {
			ComparebleCircle circle = (ComparebleCircle)o;
//			if(this.getRadius() > circle.getRadius()) {
//				return 1;
//			}else if(this.getRadius() < circle.getRadius()) 
//				return -1;
//			}else {
//				return 0;
//			}
		return this.getRadius().compareTo(circle.getRadius());
			
		}else {
			throw new RuntimeException("传入的数据类型不匹配");
		}
	} 
	
}