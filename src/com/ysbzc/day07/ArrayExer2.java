package com.ysbzc.day07;
 
public class ArrayExer2 {
	public static void main(String[] args) {
		int[] arrey1,array2;
		arrey1 = new int[] {2,3,5,7,11,13,17,19};
		for(int i = 0; i < arrey1.length;i++) {
			System.out.print(arrey1[i]+" ");
		}
		//不能算复制。地址值相同，都指向了对空间的唯一一个数组实体
		
		array2=new int [arrey1.length];
		for(int i = 0; i < array2.length;i++) {
			if(i % 2 == 0) {
				array2[i]=i;
			}
			
		}
		System.out.println();
		for(int i = 0; i < arrey1.length;i++) {
			System.out.print(arrey1[i]+" ");
		}
	}
}
