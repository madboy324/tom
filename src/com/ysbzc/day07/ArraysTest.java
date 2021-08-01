package com.ysbzc.day07;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * @Description 数组工具类的使用
 * @author wyl
 * @date 2020-7-30 21:45:17
 */
public class ArraysTest {
	public static void main(String[] args) {
		int[] arr1 =new int[] {1,4,3,2,7,0,5,-1};
		int[] arr2 =new int[] {1,4,3,2,7,0,5,-1};
		int[] arr3 =new int[] {1,4,3,2,7,0,5,-1};
		//判断是否相等 is equal
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		//遍历 traverse
		System.out.println(Arrays.toString(arr1));

		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		//sort 排序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		//binarySearch 二分查找(未找到的话，返回值为0)
		int i = Arrays.binarySearch(arr3, 2);
		System.out.println(i);
		
		
	}
	
}
