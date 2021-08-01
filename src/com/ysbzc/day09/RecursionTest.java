package com.ysbzc.day09;

/**
 * 
 * @Description 递归
 * @author wyl
 * @date 2020-8-2 1:17:04
 */
public class RecursionTest {

	public static void main(String[] args) {
//		例子1 计算1-100之间的和
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		RecursionTest test = new RecursionTest();
		System.out.println(sum);
		System.out.println(test.getSum(100));
		System.out.println(test.getSum1(100));
		System.out.println("---------------------");
		System.out.println(test.f(10));
	}

	public int getSum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + getSum(n - 1);
		}
	}

//	例子2 计算1-n自然数的之间的乘积
	public int getSum1(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * getSum(n - 1);
		}
	}
//	例子3 
	public int f(int n) {
		if(n == 0) {
			return 1;
		}else if(n == 1) {
			return 4;
		}else {
			return 2*f(n-1)+f(n-2);
		}
	}
//	列4：斐波那契数列
	
}
