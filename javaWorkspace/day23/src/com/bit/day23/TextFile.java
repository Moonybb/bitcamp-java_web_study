package com.bit.day23;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class TextFile extends Frame implements WindowListener,ActionListener{
	FileDialog fd;
	public TextFile(){
		Panel p = new Panel(); //패널 생성
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu(); // 메뉴생성
		m1.setLabel("File"); 
		TextField tf = new TextField();
		
		
		MenuItem m1_1 = new MenuItem("New File");
		m1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fd = new FileDialog(,"새창",FileDialog.SAVE);
			}
		});
		
		m1.add(m1_1);
		MenuItem m1_2 = new MenuItem("Open");
		m1.add(m1_2);
		MenuItem m1_3 = new MenuItem("Save");
		m1.add(m1_3);
		MenuItem m1_4 = new MenuItem("Exit");
		m1.add(m1_4);
		Menu m2 = new Menu();
		m2.setLabel("Help");
		MenuItem m2_1 = new MenuItem("Information");
		m2.add(m2_1);
		
		
		
		m2_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				Label la = new Label("Makes \n : Lee Seung Woo");
				Font fo = new Font("궁서",1,25);
				la.setFont(fo);
				f.add(la);
				f.setSize(400,300);
				f.setVisible(true);
				f.setLocation(1920/2-getWidth()/2+400/2,1080/2-getHeight()/2+300/2);
				f.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						f.dispose();
					}
				});
			}
		});
		
		this.addWindowListener(this);
		p.add(tf);
		mb.add(m1);
		mb.add(m2);
		setMenuBar(mb);//Frame에 메뉴바 불러옴.
		add(p);
		setTitle("제목없음");
		setSize(800,600);
		setLocation(1920/2-getWidth()/2,1080/2-getHeight()/2);
		setVisible(true);
	}
	

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	
	/////////////////////////////////////////
	public static void main(String[] args) {
		new TextFile();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	
}
