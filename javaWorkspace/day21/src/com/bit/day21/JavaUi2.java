package com.bit.day21;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Scanner;

public class JavaUi2 extends Frame{
	static CardLayout layout;
	JavaUi2(){
		layout = new CardLayout();
		this.setLayout(layout);
		
		Panel p1 = new Panel();
		Button btn1 = new Button();
		btn1.setLabel("first");
		p1.add(btn1);
		Panel p2 = new Panel();
		Button btn2 = new Button();
		btn2.setLabel("second");
		p2.add(btn2);
		
		Panel p3 = new Panel();
		Button btn3 = new Button();
		btn3.setLabel("third");
		p3.add(btn3);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.setSize(500,300);
		
	}

	public static void main(String[] args) {
		JavaUi2 me = new JavaUi2();
		me.setVisible(true);
		me.setLocation(400, 200);
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1.다음 0.종료>");
			int su=sc.nextInt();
			if(su==0){break;}
			else if(su==1){
				layout.next(me);//어떤창에있는 어떤 레이아웃을 할거냐
			}
		}
	}

}
