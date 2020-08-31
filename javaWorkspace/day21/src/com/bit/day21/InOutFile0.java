package com.bit.day21;

import java.io.File;
import java.io.IOException;

public class InOutFile0 {

	public static void main(String[] args) {
		String path=".\\test02.txt";
		File file = new File(path);
		
		if(file.delete()){
			System.out.println("파일을 삭제 했습니다.");
		}else{
			System.out.println("없어");
		}
	}

}
