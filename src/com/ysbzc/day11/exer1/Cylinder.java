package com.ysbzc.day11.exer1;

/**
 * 
 * @Description圆柱
 * @author wyl
 * @date 2020-8-4 17:32:23
 */
public class Cylinder extends Cricle {
	private double length;

	public Cylinder() {
		this.length = 1;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double findVolume() {

		return super.findArea() * length;

	}

	public double findArea() {
			return  Math.PI*getRadius() *getRadius() *2* Math.PI*getRadius()*getLength();
		}

}
