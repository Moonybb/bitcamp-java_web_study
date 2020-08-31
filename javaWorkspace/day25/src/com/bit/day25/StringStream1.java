package com.bit.day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringStream1 {
	
	public static void main(String[] args) {
		String path="data.txt";
		String path2 = "copy.txt";
		File source = new File(path);
		File target = new File(path2);
		
			try {
				if(!target.exists())
				target.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			char[] cbuf = new char[5];
			FileReader fr = null;
			FileWriter fw = null;
			
			BufferedReader br = null;
			BufferedWriter bw = null;
			try {
				fr=new FileReader(source);
				fw=new FileWriter(target);
				
				br = new BufferedReader(fr);
				bw = new BufferedWriter(fw);
				while(true){
					int su = br.read();
//					int su = br.read(cbuf,0,cbuf.length);
					
					if(su==-1)break;
//					System.out.println(su); // 버퍼를 사용하지 않을때의 값은 character 값이 되는것이다.
//					bw.write(cbuf,0,su);
					bw.write(su);
					
//					bw.newLine(); // nextLine 에서 쓸때 운영체제에서 엔터를치면 
//					String msg = new String(cbuf,0,su);
//					System.out.print(msg);
				}
				System.out.println("복사완료");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(br!=null)br.close();
					if(bw!=null)bw.close();
					if(fr!=null)fr.close();
					if(fw!=null)fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
	}
}
