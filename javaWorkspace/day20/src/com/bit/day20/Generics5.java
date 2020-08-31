package com.bit.day20;

class Lec13{
	void func(){
		System.out.println("기능사용");
	}
}

class Template{
	static <T>Box<T> newInstance(T ball){ // 내가 메서드를 호출할때 타입을 결정하겠다.
		Box<T> lec = new Box<T>();
		lec.push(ball);
		return lec;
	}
}

public class Generics5 {

	
	
	public static void main(String[] args) {
		Box<Bowling> lec = Template.<Bowling>newInstance(new Bowling());
		lec.pull().play();
	}

}
