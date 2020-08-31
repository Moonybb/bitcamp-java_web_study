package com.bit.day25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex11 {	
	
	public static void main(String[] args) {
		File file = new File("data1.bin");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
//			int su=-1;
//			while((su=fis.read())!=-1){
//				System.out.print(Integer.toHexString(su)+" ");
//			}
			com.bit.day26.Student obj = (com.bit.day26.Student)ois.readObject(); // 리드할때 같은 타입의 참조변수로 참조를 해야 하므로, 캐스팅을 해줘야하는데 
																				//패키지 경로가 다를 경우 해당 타입의 클래스파일을 가지고 있어야 캐스팅 가능.
			System.out.println(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null)fis.close();
				if(ois!=null)ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
	}

}
