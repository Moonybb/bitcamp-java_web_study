package com.bit.day16;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("이름: ");
		
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("이름: " +name + ", 나이: "+age);
		sc.close();
		
	}
}
