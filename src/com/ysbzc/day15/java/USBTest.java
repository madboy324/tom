package com.ysbzc.day15.java;
/*
 * 1.接口实现多态性（实现类从写抽象方法）
 * 
 */
public class USBTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		Flash flash = new Flash();
		computer.transferDate(flash);
	}
}
class Computer{
	public void transferDate(USB usb) {
		usb.start();
		System.out.println("_______");
		usb.stop();
	}
}
interface USB{
	void start();
	void stop();
}
class Flash implements USB{

	@Override
	public void start() {
		System.out.println("Flash start");
	}

	@Override
	public void stop() {
		System.out.println("Flash stop");
	}
	
}
class Printer implements USB{

	@Override
	public void start() {
		System.out.println("Printer start");
	}

	@Override
	public void stop() {
		System.out.println("Printer stop");
	}
	
}