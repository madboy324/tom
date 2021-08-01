package com.ysbzc.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 
 * @Description 
 * @author wyl
 * @date 2020-8-19 17:02:26
 */
/*异常处理2 throws + 异常类型 
 * throws 只是向上抛出异常，甩锅行为
 * 1、throws + 异常类型 写在方法的声明处，证明此方法执行时
 * 可能会抛出的异常类型，一旦当方法体执行时，出现异常， 仍会在异常
 * 代码处生成一个异常类的对象，此对象满足throws后异常类型时
 * 就会被抛出。异常代码后续的代码就不再执行了
 * 2、体会，try - catch - finally ：真正的将异常给处理掉了。
 * throws 的方式只是把异常抛给了执行者，并没有真正的处理。
 * 关于异常对象的产生：1系统自动生成的异常对象
 * 					2. 手动生成一个异常对象，并抛出（throw）
 *    
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			method2();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void method3() {
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void method2() throws  IOException {
		method1();
	}
	
	public static void method1() throws FileNotFoundException ,IOException{
		File file = new File("eewr");
		FileInputStream fis = new FileInputStream(file);
		int data = fis.read();
		while (data != -1) {
			data = fis.read();
		}
		fis.close();
	}

}
