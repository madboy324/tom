package com.ysbzc.day13.java2;

import org.junit.Test;

/**
 * 
 * @Description JUnit
 * @author wyl
 * @date 2020-8-9 23:43:46
 */
/* 此类是public ，有空无参构造，
 * 
 */
public class JUnitTest {
	private Boolean i ;
	@Test
	public void testEquals() {
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
	}
}
