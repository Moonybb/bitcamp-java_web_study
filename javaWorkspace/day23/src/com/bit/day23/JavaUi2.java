package com.bit.day23;

import java.awt.*;

public class JavaUi2 extends Frame{
	
	public JavaUi2(){
		Menu mn1 = new Menu();
		mn1.setLabel("File");
		MenuItem mn1_1 = new MenuItem();
		mn1_1.setLabel("New");
		mn1.add(mn1_1);
		MenuItem mn1_2=new MenuItem("Save");
		mn1.add(mn1_2);
		mn1.addSeparator();
		MenuItem mn1_3 = new MenuItem("Exit");
		mn1.add(mn1_3);
		MenuBar mb = new MenuBar();
		mb.add(mn1); 
		Menu mn2 = new Menu("Help");
		mb.add(mn2);
		MenuItem mn2_1=new CheckboxMenuItem("item1");
		MenuItem mn2_2=new CheckboxMenuItem("item2",true); // 인자 String label을 받고, states 상태를 Boolean으로 받음.
		MenuItem mn2_3=new CheckboxMenuItem("item3");
		Menu mn2_4=new Menu("Top");
		MenuItem mn2_4_1=new MenuItem("sub1");
		MenuItem mn2_4_2=new MenuItem("sub2");
		mn2_4.add(mn2_4_1);
		mn2_4.add(mn2_4_2);
		
		mn2.add(mn2_1);
		mn2.add(mn2_2);
		mn2.add(mn2_3);
		mn2.add(mn2_4);
		
		
		setMenuBar(mb); 
		Button btn = new Button("test");
		add(btn);
		setSize(500,300);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new JavaUi2();
			
		
	}
}
