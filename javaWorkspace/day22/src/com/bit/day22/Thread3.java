package com.bit.day22;

public class Thread3 {
	
	
	

	public static void main(String[] args) {
		
		
		
		Thread thr1=new Thread(){
			public void run(){
			System.out.println("thread work");
			
			}
		};
		Thread thr2=new Thread(){//객체 생성시에만 메서드 정의, 쓰레드가 상속받은 런을 구현함.
			public void run(){
			System.out.println("thread work");
			
			}
		};//anonyments class 익명클래스
		
		thr1.start();//Thread의 start 메서드는 
		thr2.start();
	}
}
