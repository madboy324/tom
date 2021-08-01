package com.ysbzc.day08;
/**
 * 
 * @Description
 * @author wyl
 * @date 2020-7-31 15:45:54
 */
/*
 * 属性=成员变量=field=域，字段
 * 方法=成员方法=函数=method
*/
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Tom";
		p1.age = 18;
		p1.sex = 1;
		p1.study();
		
		p1.showAge();
	
		int newAge = p1.addAge(10);
		System.out.println(p1.name+"长大到"+newAge);
		System.out.println(p1.age); 
	}
}
//
//
//	
//
//
