package com.bit.day22;

public class Thread1 extends Thread{

	public void run(){
		System.out.println("Thread start");
		for(int i=0;i<10;i++){
			System.out.println("thread work");
		}
		System.out.println("thread end");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		Thread1 me = new Thread1();
		me.start();//메소드 호출 후 바로 리턴되지 않고, 일을 진행하면서 뒷단으로 넘어감
		//새로운 thread 객체를 만들어서 그 객체에서 런을 호출함.
		for(int i=0;i<5;i++){
			String temp=new String("test"+i); // 
			System.out.println("main work.");
		}
		System.out.println("main end");
		
	}

}
