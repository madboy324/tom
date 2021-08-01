package com.ysbzc.day06;

/**
 * 
 * @Description 数组的练习
 * @author wyl
 * @date 2020-7-26 11:52:55
 */

/*
  数组名，元素，下标，长度（元素的个数）
  引用数据类型，数组的元素既可以是基本数据类型，也可以是引用数据类型
 长度不能修改，一维，二维  基本数据类型元素的数组，引用数据类型元素的数组
 1声明和初始化发的
 2.如何调用数组的制定位置元素
 3.如何获取数组制定位置的元素
  数组元素的默认值以及初始值
  数据的内纯解析
 
 */
public class ArrayTest {
	public static void main(String[] args) {
		//静态初始化
		int[] ids ;
		ids = new int[3];
		//动态初始化 
		String[] names =new String[5];
		names[0] = "王亚玲1";
		names[1] = "王亚玲2";
		names[2] = "王亚玲3";
		names[3] = "王亚玲4";
		names[4] = "王亚玲5";
		System.out.println(names.length);
		System.out.println(ids.length);
		
		for(int i = 0;i <names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
