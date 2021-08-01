package com.ysbzc.day09;
/**
 * 
 * @Description 重载方法练习
 * @author wyl
 * @date 2020-8-1 12:09:28
 */
public class OverloadExer {
	
	public void mOL(int m) {
		System.out.println(m*m);
	}
	public void mOL(int m,int n) {
		System.out.println(m*n);
	}
	public void mOL(String s) {
		System.out.println(s);
	}
	
	
	public int max(int i ,int j) {
		return (i>j)? i:j;
	}
	public double max(double d1 ,double d2) {
		return (d1>d2)? d1:d2;
	}
	public double max(double d1 ,double d2,double d3) {
		double max = (d1>d2)? d1:d2;
		return (max>d3)? max:d3;
	}
	
}
