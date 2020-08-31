package com.bit.day07;

class Ex03{

	public static void main(String[] args){
		Ex02.func01();
		System.out.println("------------------");
		Ex02 a=new Ex02();
		a.func02();
		xx();
	}
	public static void xx(){
		System.out.println("non - static");
		Ex02 a=new Ex02();
		System.out.println("------------------");
		Ex02.func01();
	}


}