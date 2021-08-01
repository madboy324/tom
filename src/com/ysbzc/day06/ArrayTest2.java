package com.ysbzc.day06;
/**
 * 
 * @Description
 * @author wyl
 * @date 2020-7-26 20:55:18
 */
public class ArrayTest2 {
	/*
	 二维可以看成一维数组元素是一维数组
	 */

	public static void main(String[] args) {
		int[] arr = new int[] {};
		int[][] arr1 =new int[][] {{}};
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][];
		int [] arr4[]= new int[1][2];
		int [] arr5[]= {{}};
		int[][] arr6 = {{1,2,3},{4,5}};
//		获取数组的长度
		System.out.println(arr6.length);
		System.out.println(arr6[0].length);
		System.out.println();
//		如何遍历
		for(int i = 0;i <arr6.length;i++) {
			for(int j = 0; j < arr6[i].length;j++) {
				System.out.println(arr6[i][j]+" ");
			}
		}
	}
}
