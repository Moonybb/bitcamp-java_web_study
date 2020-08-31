package com.bit.day22;

public class Thread2 implements Runnable{ // Thread 클래스는 인터페이스 runnable을 상속받고있음.
	
	String name;
	
	Thread2(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		Runnable work = new Runnable(){
			public void run(){
			System.out.println("thread work");
			
			}
		};
		
		Thread2 me = new Thread2("me");
		Thread2 you = new Thread2("you");
		
		Thread thr1 = new Thread(work);
		
		
		Thread thr2 = new Thread(work);
		
		thr1.start();
		
		thr2.start();
		
		
		
	}

	@Override
	public void run() {
		System.out.println(name+"스레드 시작.");
		for(int i=0;i<20;i++){
			System.out.println(name+"work to Thread"+i);
		}
		System.out.println(name+"스레드 끝");
	}
}
