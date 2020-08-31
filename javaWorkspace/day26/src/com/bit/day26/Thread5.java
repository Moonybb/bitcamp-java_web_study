package com.bit.day26;


public class Thread5 extends Thread{
	boolean end = true;
	boolean running;
	int cnt;
	@Override
	public void run() {
		while(end){
			cnt++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(running){
				if("Thread-0".equals(getName())){
					if(cnt<20){
						Thread.yield();
						//양보
					}
				}
				System.out.println(getName()+"출력"+cnt);
			}
			
		}
	}
	public static void main(String[] args) {
		Thread5 me = new Thread5();
		Thread5 you = new Thread5();
		me.start();
		you.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running=true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running=false;//쓰레드가 일을 하지 않을때, 하는척 하게 하면 안되고 yield로 양보해줌.
		you.running=true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.end=false;
		you.end=false;
	}
}
