package com.bit.day08;

public class Ex05{

	static int a;



	public static void main(String[] args){
		Ex05 me1 = new Ex05();
		Ex05 me2 = new Ex05();
		System.out.println("me1 =a" +me1.a);
		
		System.out.println("me2 = a"+me2.a);
		me1.a++;
		System.out.println("me1의 a++");
		System.out.println("me1 =a" +me1.a);
		me1.a++;
		System.out.println("me1의 a++");
		System.out.println("me1 =a" +me1.a);
		System.out.println("me2 = a"+me2.a);
		

	}

}