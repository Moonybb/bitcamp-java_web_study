package com.bit.day22;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

public class JavaUi4 extends Frame{

	
	public JavaUi4(){
		Panel p = new Panel();
		Font font = new Font("궁서체",0,22);
		
		CheckboxGroup cbg = new CheckboxGroup();
		
		java.awt.Checkbox chk01 = new Checkbox("item1",false,cbg);
		Checkbox chk02 = new Checkbox("item2",true,cbg);//check됨
		Checkbox chk03 = new Checkbox("item3",false,cbg);  // 체크박스 그룹에서 지혼자 타핑했죠? 좋은패턴은아님;개발자
		chk03.setLabel("item33");
		
		chk01.setFont(font);
		chk02.setFont(font);
		chk03.setFont(font);
		
		
		p.add(chk01);
		p.add(chk02);
		p.add(chk03);
		
		
		add(p);
		setLocation(200,200);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaUi4();
	}
}
