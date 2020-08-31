package com.bit.day26;

public class Thread1 extends Thread{
	static int sum;
	int begin;
	int end;
	static Object key=new Object();//key 역할은 모든 클래스든지 가능. 
	//동기화 부분이 다수일땐 각각 다른 객체를 넣어주면 된다.
	
	public Thread1(int begin,int end){
		this.begin = begin;
		this.end = end;
//		this.key = key;
	}
	
	public void sum(int i){
		sum+=i+1;
		System.out.print(' '); //수행시간이 io가 더 길기 때문에 여기서 발생할 확룔이 높음.
	}
	
	
//	public void sum(int i){ //스레드는 할일을 다 못 하고 런에이블 상태에 있는 다른 것을 뽑아 올 수도 있기 때문에,
//							// 다시 돌아 왔을 시의 작업 수행만 진행 하므로, 기본자료형 변수는 로스가 발생하게 된다.
//		int hap = i+1;
//		synchronized (key) {//동기화가 일어나야할 메서드에서의 동기화 (이 코드가 끝나기 전까지 이 인자를 가지고 들어간 상태기 때문에 대기상태.)
////			sum+=i+1;			
//			sum=sum+hap;//보장받아야 함. 여기서에서 런에이블 상태에 있는 다른 스레드를 꺼내오면, 로스가 발생할 확률이 크기 때문에.
//			//연산결과를 대입해주는 순간에 발생.
//			//대입연산자가 있을때 확인해볼것!
//		}
//	}
	
//	public static synchronized void sum(int i){ 메서드 동기화는 static이어야함.
//		int hap = i+1;
//		sum=sum+hap;
//	}
	@Override
	public void run() {
		for(int i =begin;i<end;i++) sum(i);
	}
	
	public static void main(String[] args) {
		// 1~10000 까지의 합계를 구하시오
		// 1~5000  까지의 합계를 구하시오
		// 5001~100000  까지의 합계를 구하시오
		int sum=0;
		for(int i =0;i<500;i++) sum+=i+1;
		for(int i =500;i<1000;i++) sum+=i+1;
		Object key = new Object();
		
		System.out.println("1~10000 까지의 합계 : "+sum);
		Thread1 you = new Thread1(0,500);
		Thread1 me = new Thread1(500,1000);
		you.start();
		me.start();
		
		try {
			you.join();
			me.join();//메인을 대기시킴.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("me+you:"+Thread1.sum);
		
	}
}
