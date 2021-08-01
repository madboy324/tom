package com.ysbzc.day06;
/**
 * 
 * @Description 数组测试3
 * @author wyl
 * @date 2020-7-26 21:33:36
 */
public class arrayTest3 {
public static void main(String[] args) {
//	数组元素的默认初始化值
	int[][] arr = new int[4][3];
	System.out.println(arr[0]);
	System.out.println(arr[0][0]);
	
	float[][] arr1 = new float[4][3];
	System.out.println(arr1[0]);
	System.out.println(arr1[0][0]);
	
	String[][] arr2 = new String[4][];
	System.out.println(arr2[0]);
//	System.out.println(arr2[0][0]);//空指针异常
	
	boolean[][] arr3 = new boolean[4][];
	System.out.println(arr3[0]);
//	System.out.println(arr3[0][0]);
	
	int[] arr11 = new int [5];
	String[] arr111 =new String[]{"",""};
//	数组一旦初始化,长度是确定的,并且不可修改
	int[][] arr22= new int[3][];
	
}
}
