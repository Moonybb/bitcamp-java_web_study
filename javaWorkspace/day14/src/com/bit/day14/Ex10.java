package com.bit.day14;

public class Ex10 {

	public static void main(String[] args) {
		java.util.Date now=new java.util.Date();
		System.out.println(now);
		
		java.text.DateFormat df= java.text.DateFormat.getDateInstance();
		String msg=df.format(now);	
		
		System.out.println(msg);
		System.out.println("--------------------------------");
		
		java.text.SimpleDateFormat sdf=null;
//		sdf=new java.text.SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		sdf=new java.text.SimpleDateFormat("yyyy.MM.dd HH:mm");
		
		msg = sdf.format(now);
		System.out.println(msg);
		
	}

}
