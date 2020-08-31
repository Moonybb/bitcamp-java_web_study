package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaStringIO1 {
	
	public static void main(String[] args) {
		String path="data.bin";
		File file = new File(path);
		String msg = "���ڿ� ��Ʈ���� ����\n���Ͽ� �ۼ��մϴ�";
		char[] arr = msg.toCharArray();
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write(msg);
			fw.flush();//���ο��� ���۸� ����ϱ⶧����
			fr = new FileReader(file);
			while(true){
				int su = fr.read();
				if(su==-1){break;}
				System.out.print((char)su);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null){fr.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
