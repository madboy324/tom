package com.ysbzc.day16;

public class StudentTest {
	public static void main(String[] args) {
		Students s = new Students();
		try {
			s.regist(-1001);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(s);
	}
}
class Students{
	private int id;
	public void regist(int id) throws Exception {
		if(id > 0) {
			this.id =id ;
		}else {
//			System.out.println("您输入的数据非法");
			//手动抛出异常
//			throw new RuntimeException("你输入的数据非法");
			throw new Exception("非法");
		}
	}
	@Override
	public String toString() {
		return "Students [id=" + id + "]";
	}
	
	
}
