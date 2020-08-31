package com.bit.day21;

import java.io.File;
import java.io.IOException;

public class InOutFile2 {

	public static void main(String[] args) {
		String prefix="AABBCCDDEEFFGG";
		String suffix=".java";
		try {
			File file= File.createTempFile(prefix, suffix);
			System.out.println(file.getParent());
			file.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}//임시파일 파일명,확장자 필요
	}

}

