package com.bit.day22;

public class Thread4 extends Thread{
	
	
	public static void main(String[] args) {
		Thread me = Thread.currentThread(); //static 이니까 클래스명.메서드명으로 호출가능. 
		System.out.println(me.getName()+" start.");
		
		Thread thr = new Thread(){ // Thread 클래스가 implements 받은 Runnable에 정의된 run메서드를 오버라이딩 한다. start메서드는 run메서드를 활용한다.
			@Override
			public void run(){
				System.out.println(this.getName()+" start"); //익명클래스, 클래스에서는 바로 메서드 호출가능.(굳이 쓸거면 this)
								for(int i='A'; i<='Z';i++){
					System.out.print((char)i+" ");
				}
				System.out.println();				
				System.out.println(this.getName()+" end");
			}
		};
		//메인도 하나의 쓰레드이다.
		thr.start();
		System.out.println(me.getName()+" end.");
	}
}




