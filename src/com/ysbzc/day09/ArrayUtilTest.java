package com.ysbzc.day09;

public class ArrayUtilTest {
	public static void main(String[] args) {
		ArraysUtil util = new ArraysUtil();
		int[] arr = new int[] { 21, 31, 33, 21, 323, 43, 12, -12 };
		System.out.println(util.getMax(arr));
		System.out.println("before:");
		util.print(arr);
		// util.sort(arr);
		System.out.println();
		System.out.println("after:");
		util.print(arr);
		System.out.println("查找");
		System.out.println(util.getIndex(arr, 33));
	}

}
