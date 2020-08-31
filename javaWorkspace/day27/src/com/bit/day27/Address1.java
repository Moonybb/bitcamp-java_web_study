package com.bit.day27;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address1 {
	
	public static void main(String[] args) {
		String url="localhost"; // world wide wep 은 다른 나라에서도 접근 가능한 주소이다.
		java.net.InetAddress addr01 =null;
		InetAddress[] all = null;
		try {
			addr01 = InetAddress.getByName(url);
			System.out.println(addr01.getHostName());
			System.out.println(addr01.getCanonicalHostName());
			System.out.println(addr01.getHostAddress());
			System.out.println("-------------------------------");
			////////////////////////////////
			all = addr01.getAllByName(url);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<all.length;i++){
			System.out.println(all[i].getHostAddress());
		}
	}
}


