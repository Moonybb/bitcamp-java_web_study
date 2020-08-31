package com.bit.day12;

public class Ex02 {
	
	public static void main(String[] args){
		//예외처리
		String msg="1234원";
//		for(int i=0;i<msg.length();i++){
//			if(Character.isDigit(msg.charAt(i))){}else{
//				System.out.println("숫자가 아닌 문자가 들어갔습니다");
//				return;
//			}
//		}
		try{
			System.out.println("다음줄에서 에러가 발생 할 수도 있습니다.");	
			Integer su=new Integer(msg);
			System.out.println("다행히 에러가 없었네요");
			System.out.println("su="+su);
		}catch(NumberFormatException e){
			System.out.println("오류를 잡아 냈습니다.");
		}
		System.out.println("프로그램은 실행 했었습니다.");
	}
}
