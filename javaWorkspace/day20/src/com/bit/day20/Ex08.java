package com.bit.day20;

class Com{
	void play(){
		System.out.print("열심히 총을 쏜다");
	}
}

class Ball{
	String color="검정색";
	void play(){
		System.out.print(color+" 공이 굴러갑니다");
	}
}

class BaseBall extends Ball{
	String color="흰색";
	void play(){
		System.out.print(" 던지고 놀 수도 있습니다.");
	}
}

class Bowling extends Ball{
	String color="주황색";
	void play(){
		System.out.print("핀을 향해 ");
		super.play();
	}
	
}

class Box<T>{
	private T myBall;
	
	void push(T myBall){
		this.myBall=myBall;
	}
	
	T pull(){
		return myBall;
	}
	
}

public class Ex08 {
	public static void main(String[] args) {
		BaseBall base=new BaseBall();
		Bowling bow=new Bowling();
		Com com=new Com();
		
		Box<BaseBall> box = new Box<BaseBall>();
		box.push(base);
		
		BaseBall ball2=box.pull();
		ball2.play();
	}
}
