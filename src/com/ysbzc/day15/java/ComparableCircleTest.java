package com.ysbzc.day15.java;

public class ComparableCircleTest {
	public static void main(String[] args) {
		ComparebleCircle c1 =new ComparebleCircle(3.4);
		ComparebleCircle c2 =new ComparebleCircle(3.6);
		int compareValue = c1.compareTo(c2);
		if(compareValue >0) {
			System.out.println("c1对象大");
		}else if (compareValue < 0) {
			System.out.println("c2对象大");
		}else {
			System.out.println("一样大");
		}
	}
}	
