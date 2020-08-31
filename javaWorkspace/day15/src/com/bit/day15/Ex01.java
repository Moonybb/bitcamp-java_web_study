package com.bit.day15;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//주민번호 확인(한글 지원)
		//몇살이고, 남자입니다.
		
		
		Scanner sc= new Scanner(System.in);
		
		
		
		while(true){
		System.out.println("주민번호 입력기");
		System.out.println("--------------------------");
		
		
		System.out.print("주민번호를 입력해주세요>>");
		String input = sc.nextLine();
//		String input = "959999-1111111";
		
		
		if(input.length()<15){
			if(input.charAt(6)=='-'){
				if(input.charAt(7)=='1'){
					
					System.out.println(1900+age2-2020);
					
				}else if(input.charAt(7)=='3'){
					
				}
			}
			}else{
				System.out.println("잘못 입력하셨습니다.");
			}
		
		
		}
		
		
		
	}

}
