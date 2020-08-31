package com.bit.day15;

import java.util.Scanner;

public class KoreanNumber2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String input=null;
		int age = 0;
		char gender='　';
		boolean boo=false;
		boolean boo1 = true;
		while(boo1){
		System.out.print("주민번호입력:");
		String input=sc.nextLine();
//		String input = "010000-3411111";
//		String input = "구오공구공육-일일일일일일일";
		char[] arr1=input.toCharArray();
		char[] number = {'일','이','삼','사','오','육','칠','팔','구','공'};
		if(arr1.length==14){
		for(int i=0;i<input.length();i++){
			for(int j=0;j<number.length;j++){
				if(arr1[i]==number[j]){
					if(number[j]=='일'){
						arr1[i]='1';
					}else if(number[j]=='이'){
						arr1[i]='2';
					}else if(number[j]=='삼'){
						arr1[i]='3';
					}else if(number[j]=='사'){
						arr1[i]='4';
					}else if(number[j]=='오'){
						arr1[i]='5';
					}else if(number[j]=='육'){
						arr1[i]='6';
					}else if(number[j]=='칠'){
						arr1[i]='7';
					}else if(number[j]=='팔'){
						arr1[i]='8';
					}else if(number[j]=='구'){
						arr1[i]='9';
					}else if(number[j]=='공'){
						arr1[i]='0';
					}
					}
			}//	문자 숫자로 변경.
		}//for
		if(arr1[6]=='-'){
			
		
//		System.out.println(java.util.Arrays.toString(arr1));
			char[] calc = new char[2];
			
			for(int i=0;i<calc.length;i++){
				calc[i] = arr1[i];
			}
			
			String arr10 = new String(calc);
			int year = Integer.parseInt(arr10);
			if(arr1[7]=='1'||arr1[7]=='3'){
				gender = '남';
				
			}
			if(arr1[7]=='2'||arr1[7]=='4'){
				gender = '여';	
			}
			
			if(arr1[7]=='1'||arr1[7]=='2'){
				age = 2020-1900-year+1;
			}
			if(arr1[7]=='3'||arr1[7]=='4'){
				age = 2020-2000-year+1;
			}
			
			
			
			System.out.println("당신은 "+gender+"자 이고 "+ "나이는 "+ age+ "입니다.");
			
			}else {
				System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요.");
				continue;
			}
		}else {
			System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요.");
			continue;
		}
		}//while
//		System.out.println(java.util.Arrays.toString(arr1));
	}//main

}//class
