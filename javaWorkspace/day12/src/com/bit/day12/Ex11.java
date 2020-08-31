package com.bit.day12;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input=null;
		char gender='여';
		int age=0;
		boolean boo=false;
		do{
		System.out.print("주민번호입력:");
		input=sc.nextLine();
//		input = "010000-1111111";
		char[] arr=input.toCharArray();
		///valid//
		if(arr.length==14&&arr[6]=='-'){
				boolean temp=true;
				for(int i=0;i<arr.length;i++){
					if(i==6){continue;}
					if(arr[i]<'0'||arr[i]>'9'){temp=false;}
				}
				if(true){boo=true;}
			}
		
		if(boo){////
		char[] arr2=new char[2];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr[i];
		}
		String year1=new String(arr2);
		if(arr[7]=='1'||arr[7]=='2'){
			year1=19+year1;
		}
		if(arr[7]=='3'||arr[7]=='4'){
			year1=20+year1;
		}
		age+=2020-Integer.parseInt(year1);
		if(arr[7]=='1'||arr[7]=='3'){
			gender='남';
		}
		System.out.println("당신의 나이는 "+(age+1)+"세의 "+gender+"자입니다.");
		}else{System.out.println("다시 확인 하시고 입력 해주세요");}
		}while(!boo);
	}

}
