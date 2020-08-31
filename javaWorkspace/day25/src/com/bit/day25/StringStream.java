package com.bit.day25;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringStream {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String path = "data.txt";
		File file = new File(path);
		
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			while(true){
				String msg = sc.nextLine();
				if(msg.equals("/exit"))break;
				bw.write(msg);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
