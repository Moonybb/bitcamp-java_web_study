package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaIO2 {
	
	public static void main(String[] args) {
		String path="data.bin";
		File file = new File(path);
		FileInputStream fis = null;
		List<Byte> list = new ArrayList<Byte>();
//		byte[] by = new byte[(int)file.length()];
		if(file.exists()){
			try {
				fis = new FileInputStream(file);
				int cnt=0;
				while(true){
					byte[] buf= new byte[34];
//				for(int i=0;i<file.length();i++){
					
					int su = fis.read(buf);
					if(su==-1){break;}
//					list.add((byte)su);
//					by[i]=(byte)su;//su는 1바이트로 불러왔기때문에 나머지는 다 0임
					System.out.println("cnt:"+(++cnt));
					System.out.println(new String(buf));
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					if(fis!=null){fis.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
//			Byte[] bys = (Byte[]) list.toArray(new Byte[list.size()]);
			byte[] by = new byte[list.size()];
			for(int i=0;i<by.length;i++){
				by[i]=list.get(i);
				
			}
			
			System.out.println(new String(by));
			
		}
		
	}
}
