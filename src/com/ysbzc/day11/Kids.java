package com.ysbzc.day11;

public class Kids extends ManKind {
	private int yearOld;

	
	public Kids() {
		
	}


	public Kids(int yearOld) {
		this.yearOld = yearOld;
	}


	public void  printAge() {
		System.out.println("I am " +yearOld +" years.old.");
	}


	public int getYearOld() {
		return yearOld;
	}


	public void setYearOld(int yearOld) {
		this.yearOld = yearOld;
	}
	
	public void employeed() {
		System.out.println("重写");
	}
}
