package com.bit.day08;


class Ex02{

	static int su1;
	int su2;
	public void func02(){
		System.out.println(su1);
	}	

	public static void func01(){
	System.out.println(su1);
	}	

	public static void main(String[] args){
		Ex02 me= new Ex02();
		System.out.println(me.su2);

	}


}