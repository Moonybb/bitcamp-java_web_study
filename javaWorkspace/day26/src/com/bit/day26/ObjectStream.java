package com.bit.day26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;




public class ObjectStream {

	public static void main(String[] args) {
		//ObjectStream -needs 객체 직렬화(?) Serializable
		// 객체 직렬화의 대상의 멤버필드
		String path = "data1.bin";
		File file = new File(path);
		
		try {
			if(!file.exists())file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			Student stu = new Student(1,"홍길동",90,90,70);
			oos.writeObject(stu);//인풋으로 불러오면 맴버필드의 변수들을 가져올수있음?
			stu.show();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null)fos.close();
				if(oos!=null)oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
