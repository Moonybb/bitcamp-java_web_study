package com.bit.day23;

import java.awt.*;

public class JavaUi3 extends Frame{
	
	public JavaUi3(){
		
		
		
		setSize(800,600);
		setLocation(200,200);
		setVisible(true);
		
//		Dialog dia = new Dialog(this,"새창");
		FileDialog dia = new FileDialog(this,"새창",FileDialog.SAVE);
		
//		dia.add(new Button("button"));
		dia.setSize(200,100);
		dia.setLocation(200+800/2-200/2,200+600/2-100/2);
		dia.setVisible(true);
		System.out.println(dia.getDirectory());
		System.out.println(dia.getFile());
	}
	
	
	
	public static void main(String[] args) {
		new JavaUi3();
	}
}
