package com.bit.day12;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("main Start..");
		try{
		func01();
		}catch(Exception e){
			System.out.println("회피");
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace(); // 에러 메시지 출력할때 이 메서드 사용.
			//출력하라가 아니라 호출만 하고있음.
		}
		System.out.println("main end..");
		
	}
	
	public static void func01() throws NumberFormatException{
//		NumberFormatException err= new NumberFormatException();
//		throw err; // 에러가 나면 JVM 내부에서 일어나는 일.
		int a = Integer.parseInt("a");
	}

}
