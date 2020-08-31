package com.bit.day24;

import java.io.IOException;
import java.io.InputStream;

public class JavaIO {
	StudentScore score;
	
	
	public static void main(String[] args) {
		//-128~127
		byte[] by = {(byte)176, (byte)161};
		System.out.println(new String(by));
		
//			InputStream inn = System.in;
//			try {
//				System.out.println(inn.read()); // 자바는 2byte체계이므로 
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
	}

}
