package com.bit.day23;

import javax.swing.JFrame;



public class JavaJUi extends JFrame{

	public JavaJUi(){
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaJUi();
	}
}
