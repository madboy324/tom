package com.ysbzc.day07;
/**
 * 
 * @Description 冒泡排序
 * @author wyl
 * @date 2020-7-30 12:35:36
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] {-12,-11,-8,-5,1,3,5,6,9,10,21};
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1 - i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
				
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
	
}
