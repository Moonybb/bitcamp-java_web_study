package com.bit.day14;

abstract class Lec03 extends Object{
	
	Lec03(){
		super();//생성자의 슈퍼, 조상클래스인 object 생성자를 가르키고 있는것.
		System.out.println("부모객체 생성");
	}
	
	void func01(){
		
		System.out.println("구현된 정상적인 메서드 입니다.");
	}
	abstract void func02();
}

class Lec33 extends Lec03{
	
	Lec33(){
		super();//생성자의 수퍼, Lec33의 생성자는 Lec03의 생성자를 가르키고 있는것임.
		System.out.println("자식객체 생성");
		
	}
	@Override
	void func02(){
		System.out.println("자식에서 func02 구현..,.");
	}
}

public class Ex03 {
	

	public static void main(String[] args) {
		Lec03 you = new Lec33();
		you.func01();
		you.func02();
	}

}
