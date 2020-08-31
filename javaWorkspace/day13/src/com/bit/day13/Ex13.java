package com.bit.day13;

public class Ex13 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("abc"); //default 생성자는 length 16, 문자열 입력하면 16+문자열의 length
		
		System.out.println(sb2.capacity());
	
	}

}
