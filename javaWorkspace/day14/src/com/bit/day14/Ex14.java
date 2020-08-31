package com.bit.day14;

import java.io.InputStream;

public class Ex14 {

	public static void main(String[] args) {
		java.io.InputStream inn=System.in;
		
		String msg="java web frame work";
		
		java.util.Scanner sc = null;
		sc = new java.util.Scanner(msg); 
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.nextInt());
	}

}
