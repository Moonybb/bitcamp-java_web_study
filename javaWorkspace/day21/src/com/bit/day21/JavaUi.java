package com.bit.day21;

import java.awt.Frame;
import java.awt.Button;

public class JavaUi {

	public static void main(String[] args) {
		//배치관리자
		//컴포넌트 구성요소들
		java.awt.Frame frame = new java.awt.Frame();
		java.awt.Button btn01 = new java.awt.Button();
		btn01.setLabel("버튼입니다");
		frame.add(btn01);
		
		java.awt.Button btn02 = new java.awt.Button();
		btn02.setLabel("아");
		frame.add(btn02);
		
		frame.setSize(500, 300);
		frame.setLocation(600,300);
		frame.setVisible(true);
		
	}

}