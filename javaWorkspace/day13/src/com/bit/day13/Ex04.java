package com.bit.day13;

public class Ex04 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("abcdefg");
		sb1.reverse();
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		
		
//		char[] dest=new char[sb1.length()];
//		sb1.getChars(0, sb1.length(), dest, 0);
//	
		char[] dest={'#','#','#','#','#','#','#'};//sb1의 length 7개 배열 생성
		
		sb1.getChars(2, 5, dest, 2); //복사할 시작, 끝  
		
		for(int i=0;i<dest.length;i++){
			System.out.println(dest[i]);
		}
	}

}
