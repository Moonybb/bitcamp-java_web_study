package com.bit.day21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class InOut {

	public static void main(String[] args) {
		//io
		//File
//		String path ="C:\\Study\\day21\\src";
//		String path ="C:\\Study\\day21\\text.txt";
//		String path ="C:\\Study\\day21\\text";
//		String path ="src";
//		String path ="text.txt";
		
		
		String path =".";
//		String path ="..\\day21\\text.txt";
		File file = new File(path);//default 생성자가 아님. String을 받아 파일의 경로 명세
		
		String[] dirs=file.list();
		int a=0,b=0;
		int sum=0;
		for(int i=0;i<dirs.length;i++){
			File temp = new File(dirs[i]);
			if(temp.isDirectory()){
				
				System.out.println(new java.util.Date(temp.lastModified())+" <DIR> "+"    "+dirs[i]);
				a++;
			}else if(temp.isFile()){
				
				System.out.println(new java.util.Date(temp.lastModified())+"\t   "+temp.length()+" "+dirs[i]);
				b++;
				sum+=temp.length();
			}
			
			
		}
		System.out.println();
		System.out.println("\t\t\t"+b+"개 파일   "+sum+" Byte");
		System.out.println("\t\t\t"+a+"개 디렉토리");
		
		
		
//		System.out.println("파일이 존재 하는가?"+file.exists());
//		System.out.println("파일인가?"+file.isFile());
//		System.out.println("디렉토리인가?"+file.isDirectory());
//		System.out.println("이름은?"+file.getName());
//		System.out.println("경로는?"+file.getPath());
//		System.out.println("단순 절대경로는?"+file.getAbsolutePath());
//		try {
//			System.out.println("일반 절대경로는?"+file.getCanonicalPath());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Path는?"+file.getParent());
//		System.out.println("rwx r읽기권한?"+file.canRead());
//		System.out.println("rwx w쓰기권한?"+file.canWrite());
//		System.out.println("rwx x실행권한?"+file.canExecute());
//		System.out.println("size?"+file.length()+"byte");
//		System.out.println("최종수정시간?"+new java.util.Date(file.lastModified()));//천분의 일초
		
		new java.util.Date(file.lastModified());
		
//		System.out.println(java.util.Arrays.toString(dirs));
		
	}

}
