package com.bit.day14;

import java.util.Calendar;

public class Ex08 {

	public static void main(String[] args) {
		java.util.GregorianCalendar cal=null;
		cal= new java.util.GregorianCalendar(2002,5-1,25);
		
		
		System.out.println(cal.toString());
		System.out.print(cal.get(Calendar.YEAR)+"년 ");//상수형 변수의 활용 방법
		System.out.print(1+cal.get(Calendar.MONTH)+"월 ");//0~11
		System.out.print(cal.get(Calendar.DATE)+"일 ");
		System.out.print(cal.get(Calendar.HOUR)+"시");//0~11
		
		System.out.print(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
	}

}
