package com.ysbzc.day09;

/**
 * 
 * @Description 自定义工具类
 * @author wyl
 * @date 2020-8-1 3:45:37
 */

public class ArraysUtil {
	public static void main(String[] args) {
		ArraysUtil utils = new ArraysUtil();
		
	}

	/**
	 * 
	 * @Description 求最大值
	 * @author wyl
	 * @date 2020-8-1 11:06:16
	 * @param arr
	 * @return 最大值
	 */
	public int getMax(int[] arr) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	/**
	 * 
	 * @Description 求最小值
	 * @author wyl
	 * @date 2020-8-1 11:07:42
	 * @param arr 数组
	 * @return 最小值
	 */
	public int getMin(int[] arr) {
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	/**
	 * 
	 * @Description 数组求和
	 * @author wyl
	 * @date 2020-8-1 11:08:33
	 * @param arr
	 * @return sum
	 */

	public int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	/**
	 * 
	 * @Description 求平均值
	 * @author wyl
	 * @date 2020-8-1 11:10:18
	 * @param arr
	 * @return 总和除以数组长度
	 */
	public int getAvg(int[] arr) {
		return getSum(arr) / arr.length;
	}

	/**
	 * 
	 * @Description 反转数组
	 * @author wyl
	 * @date 2020-8-1 11:11:16
	 * @param arr
	 */
	public void reverse(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public void swap(int[] arr,int i,int j) {
		int temp =arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * 
	 * @Description 复制一个数组
	 * @author wyl
	 * @date 2020-8-1 11:13:54
	 * @param arr
	 * @return 复制的数组
	 */
	public int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}

	/**
	 * 
	 * @Description 冒泡排序
	 * @author wyl
	 * @date 2020-8-1 11:16:03
	 * @param arr
	 */
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 
	 * @Description 遍历
	 * @author wyl
	 * @date 2020-8-1 11:21:22
	 * @param arr
	 */
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "]" + " ");
		}
	}

	/**
	 * 
	 * @Description 根据内容查找某一个数的下标
	 * @author wyl
	 * @date 2020-8-1 11:23:06
	 * @param arr  数组
	 * @param dest 查找内容
	 * @return 下标,-代表没有找到
	 */
	public int getIndex(int[] arr, int dest) {
		for (int i = 0; i < arr.length; i++) {
			if (dest == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
