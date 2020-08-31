package com.bit.day15;

import java.util.*;

public class KoreanNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = null;
		String input = null;
		
		System.out.println("주민번호 입력기");
		System.out.println("----------------------------");
		
		while(true){
		System.out.print("주민번호를 입력해주세요>>");
		input = sc.nextLine();
//		input = "999999-9999999";
		char[] arr1 = new char[2];
		arr1[0] = input.charAt(0);
		arr1[1] = input.charAt(1);
		String age ="";
		String gender = "";
		for(int i=0;i<arr1.length;i++){
			age += arr1[i];
		}
		int age2 = Integer.parseInt(age);
		if(input.length()!=14){
			System.out.println("잘못 입력하셨습니다.");
			continue;
		}else if(input.charAt(6)!='-'){
				System.out.println("잘못 입력하셨습니다.");
				continue;
		}else if(input.length()==14&&input.charAt(6)=='-'){
			System.out.println("환영합니다");
			if(input.charAt(7)==1){
				gender = "남자";
				System.out.println("당신의 나이는 " +(2020-1900-age2+1)+"이며 "+gender+"입니다.");
			}else if(input.charAt(7)==2){
				gender="여자";
				System.out.println("당신의 나이는 " +(2020-1900-age2+1)+"이며 "+gender+"입니다.");
			}else if(input.charAt(7)==3){
				System.out.println("당신의 나이는 " +(2020-1900-age2+1)+"이며 "+gender+"입니다.");
			}else if(input.charAt(7)==4){
				System.out.println("당신의 나이는 " +(2020-1900-age2+1)+"이며 "+gender+"입니다.");
			}
			
		}
		
		
		}//while
		
		
	}//main
		
		
}// class


