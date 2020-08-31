package com.bit.day22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread7 {
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			String msg = sdf.format(date);
			System.out.println(msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}	
