package com.ysbzc.day07;

/**
 * 
 * @Description 测试
 * @author wyl
 * @date 2020-7-27 18:17:48
 */
public class ArrayTest1 {
public static void main(String[] args) {
//	生成一个随机数的公式
//	int a = 0,b = 0;//[a,b]之间的随机数
//	int c= (int)(Math.random()*(b-a+1)+a);
	int[] arr = new int[10];
	
	for(int i = 0; i< arr.length;i++) {
		arr[i]=(int)(Math.random()*(99-10+1)+10);
	}
	//遍历
	for(int i = 0;i < arr.length;i++) {
		System.out.print(arr[i]+"\t");
	}
	System.out.println();
	
//	最大值
	
	
	int maxValue=arr[0];
	for(int i = 1 ;i < arr.length;i++) {
		if(maxValue < arr[i]) {
			maxValue =arr [i];
		}
	}
	System.out.println("最大值"+maxValue);
	//最小值
	int minValue=arr[0];
	for(int i = 1 ;i < arr.length;i++) {
		if(minValue > arr[i]) {
			minValue =arr [i];
		}
	}
	System.out.println("最小值"+minValue);
	int sum = 0;
	for(int i = 0;i < arr.length;i++) {
		sum +=arr[i];

	}
	System.out.println("和"+sum);
}
}
