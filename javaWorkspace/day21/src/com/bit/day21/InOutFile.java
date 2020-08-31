package com.bit.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutFile {

	public static void main(String[] args) {
		String path=".\\test02.txt";
		File file = new File(path);
		
		FileOutputStream fis =null;
		try {
			if(file.createNewFile()){
				System.out.println("파일생성완료");
			}else{
				System.out.println("기존 파일이 존재 합니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String msg ="saodigjewaoigj aew";
		byte[] a = msg.getBytes();
		try {
			fis = new FileOutputStream(file);
			fis.write(a);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null){fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
