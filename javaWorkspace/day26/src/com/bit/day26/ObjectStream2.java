package com.bit.day26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectStream2 {
	
	public static void main(String[] args) {
		String msg = "문자열 메시지를 작성합니다.\n12345\nABCDEFG";
		
		// jdk 1.8~
		
		try(java.io.OutputStream os = new FileOutputStream("test01.txt")){//자동으로 클로즈 해주는 대상은 트라이 괄호 안에있는. 
																			//반드시 클로즈 메소드가 존재 하는 클래스여야함. (Interface Closeable 을 상속받은 것들만 들어올 수 있음)
			os.write(msg.getBytes());
//			os.flush();
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
