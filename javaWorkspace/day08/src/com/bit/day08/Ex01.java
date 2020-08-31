package com.bit.day08;

public class Ex01{

	public static int a; //클래스변수,전역변수
	int b; 		//맴버 필드, 인스턴스변수...

	//클래스의 구성요소
	//1.메서드
	//2.변수
	public void func(){
	
		a++;
		System.out.println("a = "+a);
	}

	
	public static void main(String[] args){
		Ex01 me=new Ex01();
		me.func();
		
	}

}