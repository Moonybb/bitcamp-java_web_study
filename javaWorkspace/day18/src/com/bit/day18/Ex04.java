package com.bit.day18;

public class Ex04 {

	public static void main(String[] args) {

		//자료구조 객체 생성
		BitArray list = new BitArray();
		list.add(1);
		list.add("영문이바보");
		list.add("영문's score");
		list.add("1");
		list.add("2");
		
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
		
	}

}
