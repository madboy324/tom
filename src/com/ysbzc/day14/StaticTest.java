package com.ysbzc.day14;
/**
 * 
 * @Description staic 动态的
 * @author wyl
 * @date 2020-8-10 11:01:22
 */
/*
  *  可以修饰，属性，方法、代码块、内部类
 * 
 */
public class StaticTest {
	public static void main(String[] args) {
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		 
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
		c2.nation = "CHINA";
		System.out.println(c1.nation);
		
	}
}
class Chinese{
	String name;
	int age;
	static String nation;
	
	
}