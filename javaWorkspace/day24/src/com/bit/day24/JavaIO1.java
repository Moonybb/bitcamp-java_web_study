package com.bit.day24;

import java.io.IOException;
import java.io.OutputStream;

public class JavaIO1 {
	
	public static void main(String[] args) {
		OutputStream oout = System.out;
		
		try {
			oout.write(176);
			oout.write(161);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(oout!=null){oout.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
