package com.ysbzc.day07;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[] {"JJ","DD","EE","cc"};
		// 数组的赋值，区别于数组的复制
		String[] arr1 = new String[arr.length];
		for(int i =0;arr1.length > i;i++) {
			arr1[i]=arr[i];
		}
		//数组的反转
		//方法一
		for(int i = 0;i < arr.length /2;i++) {
			String temp =arr[i];
			arr[i]=arr[arr.length - i - 1];
			arr[arr.length - i - 1]=temp;
		}
		
		//方法二
		for(int i = 0,j = arr.length -1;i <j;i++,j--) {
			String temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		//遍历
//		for(int i = 0; i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		//查找或者搜索
		//线性查找
		String desc = "Dd";
		boolean isFlag = true;
		for(int i = 0;i <arr.length;i++) {
			if(desc.equals(arr[i])) {
				System.out.println("位置为："+i);
				isFlag =false;
				break;
			}
			
		}
		
		if(isFlag=false) {
			System.out.println("没找到");
		}
		//二分法泽半查找,前提：有序
		int[] arr2 = new int[] {-12,-11,-8,-5,1,3,5,6,9,10,21};
		
		int dest1= -11;
		int head = 0; //首索引
		int end = arr2.length - 1;
		boolean isFlag1 = true;
		while(head <= end) {
			int middle = (head+end)/2;
			if(dest1 == arr2[middle] ) {
				System.out.println("找到指定元素："+middle);
				isFlag1 = false;
				break;
			}else if (arr2[middle] > dest1) {
				end = middle - 1;
			}else {
				head = middle + 1;
				
			}
			if(isFlag1 == false) {
				System.out.println("没找到");
			}
		
			
		}
		
		
		
	}
}
