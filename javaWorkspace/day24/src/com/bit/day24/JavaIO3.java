package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIO3 {
	
	
	public static void main(String[] args) {
		String path="data.bin";
		File file = new File(path);
		String path2 = "data2.bin";
		File file2 = new File(path2);
		if(!file2.exists()){//존재하지 않으니까 만들것.
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		String msg="abcdefg\n1234567890\n!@#$%^&*\nABCDEFG";
		byte[] buf =new byte[34]; // 모자라서 한번 더 초기화,
		FileInputStream fis = null;
		
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos=new FileOutputStream(file2);
//			for(int i=0;i<arr.length;i++){
			while(true){
				int su = fis.read(buf,0,buf.length);//인자로 byte[]을 받을수잇음 . byte[]을 su에 넣어주면 갯수가 됨(su가 읽어드린 데이터가 아닌 읽어들인 갯수가됨). 2바이트 체계이므로 인자를 안주면 2바이트씩 읽음. 
//				System.out.println("읽어들인 갯수:"+su);
				if(su==-1){break;}//su가 -1이면 읽어들일게 없단 뜻이므로 반복문 나감 .
				fos.write(buf,0,su); // 인자로 byte[]   , 데이터의 시작지점 , 쓸 바이트 갯수(buf 바이트 인덱스 중에서 내가 쓸만큼)
			}
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){fis.close();}
				if(fos!=null){fos.close();}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
