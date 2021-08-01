package com.ysbzc.day16;

import org.junit.Test;

/**
 * 
 * @Description 异常处理，抓抛沫型
 * @author wyl
 * @date 2020-8-19 10:07:54
 */
/**把异常跑出去，
 * 抓是异常的处理方式，try catch finally 
 * throws 
 * try{
 * 	//可能出现异常的代码
 * 	
 * }catch（异常类型1 变量名1）{
 * 		//异常处理的方式1
 * }catch{
 * 		异常处理2
 * }finally{
 * 	//一定会执行的代码
 * }
 * try 包异常包装起来，一旦出错就会生成一个对应的异常对象，通过catch 
 * 中对象的比对，进行选择，进入catch 进行异常的处理，一旦处理完成跳出try catch
 * 结构，在没有finally的情况下。catch 中的异常类型，如果满足父类关系，如果父类放在、
 * 上面
 * catch常用的异常处理的方式， String getMessage() printStactTract
 * 6、早try结构中声明的变量，在try外无法进行调用，解决方案，在外部声明变量，显示赋值
 * ps: 用于try catch finally 处理编译时异常，即使把编译时的异常，延迟到运行时进行处理
 * 7.try-catch-finally 可以嵌套使用
 * 开发中，由于运行异常比较常见，对于运行时异常不进行处理，
 * 编译时异常一定要进行处理
 */
public class ExceptionTest1 {
	@Test
	public void test1() {
		String string = "123";
		string ="abc";
		try {
			int num = Integer.parseInt(string);
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("空指针异常");
		}catch (Exception e) {
			System.out.println("Exception 是上面的父类，");
		}
		System.out.println("111");
	}
}
