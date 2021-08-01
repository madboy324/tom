package com.ysbzc.day13.java2;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Vector v = new Vector();
		int maxScore = 0;
		for(;;) {
			System.out.println("请输入学生成绩。（-1）结束");
			int score = scan.nextInt();
			if(score < 0) {
				break;
			}
			if (score >100) {
				System.out.println("非法，请重新输入：");
				continue;
			}
//			Integer inScore = new Integer(score);
//			Integer inScore = score;
		
			v.addElement(score);//自动装箱
			
			if(maxScore <score ) {
				maxScore =score;
			}
		}
		char level;
		for(int i = 0;i < v.size();i++) {
			Object obj = v.elementAt(i);
//			jdk 5.0
//			Integer inScore = (Integer)obj;
//			int score = inScore.intValue();
			int score =(Integer) obj;
			if(maxScore -score <= 10) {
				level = 'A';
			}else if(maxScore -score <= 20) {
				level = 'B';
			}else if(maxScore -score <= 30) {
				level = 'C';
			}else {
				level ='D';
			}
			System.out.println("Student: "+i+"Score: "+score
					+",Level: "+level);
		}
		
	}
}
