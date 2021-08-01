package com.ysbzc.day07;
/**
 * 
 * @Description 杨辉三角
 * @author wyl
 * @date 2020-7-27 14:40:08
 */

public class YangHuiTest {
	public static void main(String[] args) {
		//1.声明初始化二维数组
		int[][] yangHui = new int[10][];
		
		//2. 赋值
		for(int i= 0;i< yangHui.length;i++) {
			yangHui[i] =new int [i + 1];
			yangHui[i][0]=1;//首航末行赋值
			yangHui[i][i]=1;
//			2.2给其他赋值

			for(int j =1;j<yangHui[i].length-1;j++) {
				yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
			}
//			//3.遍历
			for(int j=0 ;j <yangHui[i].length;j++) {
				System.out.print(yangHui[i][j]+" ");
			}
			System.out.println();
			
		}

	}
}
