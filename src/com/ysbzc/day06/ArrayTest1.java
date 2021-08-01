package com.ysbzc.day06;

/**
 * 
 * @Description 数组元素的默认初始化值
 * @author wyl
 * @date 2020-7-26 12:49:29
 */
public class ArrayTest1 {
	/**
	 * 
	 * @Description
	 * @author wyl
	 * @date 2020-7-26 17:57:39
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * int[] arr = new int[4]; String[] arr1 = new String[4]; for (int i = 0; i <
		 * arr.length; i++) { System.out.println(arr1[i]); }
		 */
		int[] arr = new int [] { 7, 2, 1, 0, 3,9,6};
		int[] index =new int[] { 2, 0, 4, 4, 5, 6, 0, 2, 2, 0, 3};
		String tel = "";
		for (int i = 0; i<index.length;i++) {
			tel += arr[index[i]];
		}
		System.out.println("王亚玲的 "+tel);
	}

}
