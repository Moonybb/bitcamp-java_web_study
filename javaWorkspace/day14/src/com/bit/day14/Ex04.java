package com.bit.day14;

interface Inter01{
	//오직 추상 메서드만을 갖는다.
	//객체 생성이 불가능(?)하고 생성자와 필드도 없다.
	//예외)public static final 변수만 가능
	//예외)메서드 앞에 public abstract 생략가능
	
	public static final int su1=1111;
	int su2=1111;
	int sn3=3333;
	int su4=2214;
	
	
	public abstract void func01();
	public void func02();//abstract 생략가능 ( 컴파일러가 자동생성해줌. )
	void func03(); // private 불가능 , default(x) public(o)
	
}

interface Inter02{}
interface Inter03{}
// 클래스의 정보
// 분류 , 제약



public class Ex04 /*extends Object(생략되어있는것)*/ implements Inter01,Inter02,Inter03,Inter04{
	
	
	
	public static void main(String[] args) {
		Inter01 me = new Ex04();
		me.func01();
		
		me.func02();
		me.func03();
		System.out.println(Inter01.su1);
		System.out.println(Inter01.su2);
		System.out.println(Inter01.sn3);
		System.out.println(Inter01.su4);
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}

}
