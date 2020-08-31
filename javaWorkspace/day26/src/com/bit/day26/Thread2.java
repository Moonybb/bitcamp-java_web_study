package com.bit.day26;

public class Thread2 extends Thread{
	
	@Override
	public void run() {
		System.out.println(getName()+" start....");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
//			e.printStackTrace();
		}
		System.out.println(getName()+" end....");
	}
	
	public static void main(String[] args) {
		System.out.println("main start....");
		Thread2 me = new Thread2();
		Thread2 you = new Thread2();
		me.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.interrupt();
		System.out.println("main end...");
	}
}
