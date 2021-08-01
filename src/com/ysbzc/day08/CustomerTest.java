package com.ysbzc.day08;

/**
 * 
 * @Description 类中方法的声明和使用
 * @author wyl
 * @date 2020-7-31 16:33:18
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.eat();
	}
}
/*
 * 1.举例如下
 * 2.方法的声明 ：权限修饰符 返回值了类型 方法名（形参列表）{
 * 		方法体
 * 		}
 * static final abstract 修饰的方法
 * 3.说明
 * 		3.1 权限修饰符， 四种权限修饰符
 * 		3.2 返回值类型：有 vs 没有
 * 			3.2.1 如果方法有返回值，则必须在方法声明时声明返回值的类型
 * 				   同时return同样类型的值。如果使用return;(no necessary like break;)
 * 			3.2.2 该不该有返回值？
 * 				1.题目要求
 * 				2.凭借经验：具体内容具体分析；
 * 		3.3 方法名，标识符，标识符的规则规范，见名知意
 * 		3.4 形参列表：0个或多个。
 * 			3.4.2形参要不要，	
 * 5.方法的使用，可以调用当前类的属性和方法
 */
class Customer{
	String name;
	int age;
	boolean isMale;
	public void eat(){
		System.out.println("吃东西");
	}
	private void sleep(int hour) {
		System.out.println("睡了"+hour+"小时");
		
	}
	
	public String getName() {
		return name;
	}
	
	private String getNation(String nation) {
		String info = "我是"+nation;
		return info;

	}
}
