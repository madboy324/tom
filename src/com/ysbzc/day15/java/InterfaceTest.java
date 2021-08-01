package com.ysbzc.day15.java;

import javax.sound.midi.Soundbank;

/**
 * 
 * @Description interface 定义
 * @author wyl
 * @date 2020-8-11 23:25:41
 */
/*
 * 1、接口interface 用来定义 
 * 2、java 中，接口和类是连个并列的结构 
 * 3、如何定义接口，定义接口中的成员 
 * 	3.1 JDK7
 * 之前只能定义全局常量和抽象方法 自动省略 static final public static final public abstract 3.2
 * JDK8除了以上方法，还可以定义静态方法，默认方法 
 * 4、接口中不能定义构造器，不能实例化 
 * 5、Java、接口都通过让类去实现接口，如果实现类覆盖了接口中
 * 所以的抽象方法，则此实现类可以实例化，如果没有实现，则要变成抽象类
 * 6.java 类可以实现多个接口-->弥补了Java单继承的局限性
 * 
 * 格式 class[name] extends [name2] implements [imp1.imp2]
 * 7.接口和接口之间可以多基础，
 * 8.接口的使用体现多态性
 * 9.接口，实际上看成一种规范
 * 
 * 
 */
public class InterfaceTest {
	public static void main(String[] args) {
//		Flayable.MAX_SPEED = 0;
		Plane plane = new Plane();
		plane.fly();
		
	}
}
interface Attackable{
	void attack();
}
interface Flayable {
	// 全局常量
	public static final int MAX_SPEED = 7999; // 第一宇宙速度
	int MIN_SPEED = 1;// 自动省略了：public static final

	public abstract void fly();

	void stop(); // 自动省略了：public abstract

}

class Plane  implements Flayable {

	@Override
	public void fly() {
		System.out.println("起飞");
	}

	@Override
	public void stop() {
		System.out.println("停止");
	}

}
abstract class Kite implements Flayable{

	@Override
	public void fly() {
		System.out.println("风筝起飞");
	}


}
class Bullet extends Object implements Flayable,Attackable{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}

//**********************
interface AA {
	void method1();
}
interface BB {
	void method2();
}
interface CC extends AA,BB{
	
}
