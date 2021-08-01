package com.ysbzc.day13;

public class equalTest {
	public static void main(String[] args) {
		Order order1 = new Order(1000,"AA");
		Order order2 = new Order(1002,"cc");
		System.out.println(order1.equals(order2));
		Order order3 = new Order(1002,"cc");
		System.out.println(order2.equals(order3));
		
	}

}
class MyDate{
	private int day;
	private int month;
	private int year;
	public MyDate() {
		super();
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MyDate other = (MyDate) obj;
//		if (day != other.day)
//			return false;
//		if (month != other.month)
//			return false;
//		if (year != other.year)
//			return false;
//		return true;
//	}
	@Override
	public boolean equals(Object obj) {
		 if(this == obj) {
			 return true;
		 }
		 if(obj instanceof MyDate) {
			 MyDate myDate = new MyDate();
			 return this.day ==myDate.day &&
					 this.month==myDate.month
					 &&  this.year==myDate.year;
		 }
		return super.equals(obj);
	}
@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + ", getDay()=" + getDay() + ", getMonth()="
				+ getMonth() + ", getYear()=" + getYear() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}

class Order{
	private int OrderId;
	private String orderName;
	public Order(int orderId, String orderName) {
		super();
		OrderId = orderId;
		this.orderName = orderName;
	}
	public Order() {
		super();
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Order) {
			Order order =(Order)obj;
			return this.OrderId ==order.OrderId && this.orderName.equals(order.orderName);
		}else {
			return false;
		}
		
	}
	
}

