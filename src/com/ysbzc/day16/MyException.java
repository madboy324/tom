package com.ysbzc.day16;
/*
 * 自定义异常
 * 1. 继承异常 RuntimeException Exception
 * 2. 提供全局常量：serviaVersionUID
 * 3. 重载的构造器 
 *  
 */
public class MyException extends RuntimeException{
	  static final long serialVersionUID = -7034897190745766939L;
	  
	public MyException() {
		
	}
	
	public MyException(String msg) {
		super(msg);
	}
}

