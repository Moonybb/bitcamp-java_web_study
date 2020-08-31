package com.bit.day26;


class Lec08 extends Thread{
	int tot;
	@Override
	public void run() {
		synchronized (this) {
			
		
			for(int i=0;i<50;i++){
				System.out.println(i+"를 더합니다");
				tot+=i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();//wait 하나 깨워서 Runnable 로 만듬
//			notifyAll();
		}
	}
}



public class Thread3{	
	
	public static void main(String[] args) {
		Lec08 lec = new Lec08();
		lec.start();
		//메인이 진입하냐, 쓰레드가 진입하냐?에 따라 수행이 달라짐, 결과는 똑같음
		synchronized (lec) {
			
			try {
				lec.wait(1000);//말그대로 웨잇이므로 동기화해 써야함.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("tot:"+lec.tot);
		}
		
	}
}
