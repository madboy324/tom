package com.ysbzc.day08;

/**
 * 
 * @Description 学生对象测试
 * @author wyl
 * @date 2020-7-31 22:46:25
 */
public class StudentTest {
	public static void main(String[] args) {
		// 声明student类型数组

		Student[] stus = new Student[20];
		for (int i = 0; i < stus.length; i++) {
			stus[i] = new Student();
			stus[i].number = (i + 1);
			// 年级[1,6] [0,1)
			stus[i].state = (int) (Math.random() * (6 - 1 + 1) - 1);
			// 成绩[0,100]
			stus[i].score = (int) (Math.random() * (100 + 1));
		}
//		for(int i = 0;i < stus.length;i++) {
////			System.out.print(stus[i].number);
//			System.out.println(stus[i].info());
//			
//		}
//		System.out.println("**********************");
//		for (int i = 0; i < stus.length; i++) {
//			if (stus[i].state == 3) {
//				System.out.println(stus[i].info());
//			}
//		}
//		for (int i = 0; i < stus.length - 1; i++) {
//			for (int j = 0; j < stus.length - 1 - i; j++) {
//				if (stus[j].score > stus[j + 1].score) {
//					// 错误：交换成绩，并不是数组排序
////					int temp = stus[j].score;
////					stus[j].score = stus[j+1].score;
////					stus[j+1].score = temp;
//
//					Student temp = stus[j];
//					stus[j] = stus[j + 1];
//					stus[j + 1] = temp;
//
//				}
//			}
//
//		}
//		System.out.println("排序后如下");
//		for (int i = 0; i < stus.length; i++) {
//			System.out.println(stus[i].info());
//
//		}
		StudentTest test = new StudentTest();
		test.print(stus);
		System.out.println("**********************");
		test.searchState(stus, 3);
		System.out.println("**********************");
		test.sort(stus);
		test.print(stus);
	}

	/**
	 * 
	 * @Description 遍历Student数组中的值
	 * @author wyl
	 * @date 2020-7-31 23:22:48
	 * @param stus 要查找的数组
	 */
	public void print(Student[] stus) {
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].info());
		}
	}

	/**
	 * 
	 * @Description 查找数组中指定年级学生信息
	 * @author wyl
	 * @date 2020-7-31 23:26:18
	 * @param stus  要查找的数组
	 * @param state 要查找的年级
	 */
	public void searchState(Student[] stus, int state) {
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].state == state) {
				System.out.println(stus[i].info());
			}
		}
	}

	/**
	 * 
	 * @Description 给Student数组排序
	 * @author wyl
	 * @date 2020-7-31 23:29:20
	 * @param stus 数组
	 */
	public void sort(Student[] stus) {
		for (int i = 0; i < stus.length - 1; i++) {
			for (int j = 0; j < stus.length - 1 - i; j++) {
				if (stus[j].score > stus[j + 1].score) {
					Student temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;

				}
			}
		}
	}
}
/**
 * 
 * @Description  学生类
 * @author wyl
 * @date 2020-7-31 23:43:26
 */
class Student {
	int number;
	int state;
	int score;

	public String info() {
		return "学号：" + number + "、年级" + state + "、成绩" + score;
	}
}