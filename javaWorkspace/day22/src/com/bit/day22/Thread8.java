package com.bit.day22;

public class Thread8 extends Thread{

	public static void main(String[] args) {
		System.out.println("main start");
		Thread8 me = new Thread8();
		Thread8 you = new Thread8();
		me.start();
		you.start();
		
		try {
			me.join();
			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");
		
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			
			System.out.println(getName()+" work "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
