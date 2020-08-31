package com.bit.day26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;



public class ScannerClass {
	
	public static void main(String[] args) {
		InputStream is = null;
		
		
		
		
		
		
		try {
			File file = new File("text01.txt");
//			is = new FileInputStream(file);
			
			Scanner sc = new Scanner("출력\n출력2");//인자로 System.in을 주면 입력대기상태,
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			try {
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
