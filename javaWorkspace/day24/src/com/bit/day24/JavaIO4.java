package com.bit.day24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIO4 {
	
	public static void main(String[] args) {
		String path = "data.bin";
		String path2 = "data2.bin";
		
		File src = new File(path);
		File target = new File(path2);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis =null;
		BufferedOutputStream bos = null;
		byte[] buf = new byte[8];
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(target);
			bis = new BufferedInputStream(fis); // 이미 메서드로 바이트 배열 6만개정도를 가지고 있음. 
			bos = new BufferedOutputStream(fos);
			
			while(true){		//내가 만든 버퍼를 buffer객체에서 활용한다.
				int su=bis.read(buf); // 버퍼인풋스트림에 인자로 fis를 넣고 bis가 참조하게한다. 그 후 bis에서의 read메서드 호출. 리턴 int
				if(su==-1){break;}
				bos.write(su); 
				// 버퍼 아웃풋스트림에 인자로 fos넣고 bos가 참조 하게 한다, 그 후 bos에서의 write 메서드 호출
			}
//			bos.flush();//버퍼의 가득참과 상관없이 작성. 데이터가 가득차면 밀어줘야한다.
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bis!=null){bis.close();} // 객체생성 역순으로 해주는게 좋다.
				if(bos!=null){bos.close();}
				
				if(fis!=null){fis.close();}
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
