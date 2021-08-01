package com.ysbzc.day08;

public class TestExer3 {
	public static void main(String[] args) {
		TestExer3 test  = new TestExer3();
		test.method();
//		int area = test.method2();
		System.out.println(test.method2());
		System.out.println(test.method3(3,4));
	}
	
	public void method() {
		for(int i = 0;i < 10;i++) {
			for(int j = 0;j <8;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public int method2() {
		for(int i = 0;i < 10;i++) {
			for(int j = 0;j <8;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return 10*8;
	}
	public int method3(int m,int n) {
		for(int i = 0;i < m;i++) {
			for(int j = 0;j <n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m*n;
	}
}
