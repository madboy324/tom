package com.ysbzc.day07;

public class ArrayExer1 {
public static void main(String[] args) {
	int[][] arr = {{3,5,8},{12,9},{7,0,6,4}};
	
	int sum = 0;
	for (int i=0;i<arr.length;i++) {
		for(int j= 0 ;j< arr[i].length;j++) {
			sum +=arr[i][j];
		}
	}
	System.out.println("总和为:"+sum);
	
}
}  
