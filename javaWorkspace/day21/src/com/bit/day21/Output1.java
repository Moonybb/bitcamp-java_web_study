package com.bit.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output1 {
	
	public static void main(String[] args) {
		// ByteStream - output
		
		File file = new File("output1.bin");
		java.io.FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file); // 항상 엑셉션 동반.
			String msg="hello";
			
			byte[] byt=msg.getBytes();
			for(int i=0;i<byt.length;i++){
				fos.write(byt[i]);
			}
			fos.close();// 다 썼으면 항상 종료 필수
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
		
	}
}
