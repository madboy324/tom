package com.ysbzc.day07;

import java.util.Arrays;

/**
 * 
 * @Description 数组中常见异常
 * @author wyl
 * @date 2020-7-30 22:01:46
 */
/*
 1,数组角标越界异常：ArrayIndexOutOfBoundsExcetiom
 2.空指针异常：NullPorinterException;
 */
public class ArrayExceptionTest {
	public static void main(String[] args) {
//		int[] arr1 = new int[] {1,3,4};
//		arr1=null;
		//nullPorinter
		int[] arr = new int[] {-12,-10,-9,-8,21,2,32,12,44,99};
		for(int i = 0;i <arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1 - i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;				
				}
			}
		}
		for(int i = 0; i <arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		int[] arr2 =new int[] {9,8,7,6,5,4,-1,-21,-9};
		for(int i = 0;i <arr2.length - 1;i++) {
			for(int j = 0; j< arr2.length -1-i;j++) {
				if(arr2[j] > arr2[j+1]) {
					int temp = arr2[j];
					arr2[j]= arr2[j+1];
					arr2[j+1]=temp;
				}
				
			}
			
			
		}
		for(int i = 0;i < arr2.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
	}

}
