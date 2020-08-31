package com.bit.day14;

interface Inter05 extends Inter04{
	// 클래스의 네이밍 규칙과 동일
	void func02();
	void func01();
	
}


	



public class Ex05 implements Inter05{

	public static void main(String[] args) {
		Inter05 ac = new Ex05();
		ac.func01();
		ac.func02();
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}


}
