package com.bit.day26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class CastingStream {
	
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		char[] cbuf = new char[5];
		try {
//			is = new FileInputStream("test01.txt"); //문자열을 인자로 받는 파일 인풋스트림 객체생성, is가 참조함.
//			isr = new InputStreamReader(is); // 파일인풋스트림 참조변수 is 를 인자로 받는 인풋 스트림리더 생성 ,isr 참조.
			isr= new InputStreamReader(System.in);
			br = new BufferedReader(isr); 
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			pw = new PrintWriter(bw);
			String msg = null;
			while((msg=br.readLine())!=""){ // 라인단위로 읽음. null일때 들어와서 !=일때까지 반복.
				pw.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(br!=null)br.close();
				if(is!=null)is.close();
				if(isr!=null)isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
