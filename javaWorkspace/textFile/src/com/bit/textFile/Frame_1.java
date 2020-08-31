package com.bit.textFile;


import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class Frame_1 extends Frame implements ActionListener{
	MenuItem m1_3;
	MenuItem m1_1;
	MenuItem m1_2;
	
	Frame_1(){
		
		MenuBar mb1 = new MenuBar();
		Menu m1 = new Menu();
		m1.setLabel("File");
		m1_1 = new MenuItem("New File");
		m1_2 = new MenuItem("Save");
		m1_3 = new MenuItem("Exit");
		
		m1_1.addActionListener(this);
		
		Menu m2 = new Menu();
		m2.setLabel("Help");
		MenuItem m2_1 = new MenuItem("Information");
		m1.add(m1_1);
		m1.add(m1_2);
		m1.add(m1_3);
		m2.add(m2_1);
		
		Toolkit tool = Toolkit.getDefaultToolkit();
//		f= new Frame();
		Dimension dim = new Dimension();
		
		
		mb1.add(m1);
		mb1.add(m2);
		
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		this.setMenuBar(mb1);
		dim = tool.getScreenSize();
		this.setSize(600,800);
		this.setLocation(dim.width/2-this.getWidth()/2,dim.height/2-this.getHeight()/2);
		this.setVisible(true);
		m2_1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Toolkit tool = Toolkit.getDefaultToolkit();
						Dimension dim = new Dimension();
						dim = tool.getScreenSize();
						Panel p = new Panel();
						Frame f1 = new Frame();
						Label la = new Label("MAKES: Lee Seung Woo");
						p.add(la);
						f1.add(p);
						f1.setSize(300,300);
						f1.setLocation(dim.width/2-f1.getWidth()/2,dim.height/2-f1.getHeight()/2);
						f1.setVisible(true);
						f1.addWindowListener(new WindowAdapter() {
							@Override
							public void windowClosing(WindowEvent e) {
								f1.dispose();
								
							}
						});
					}
				});
	}
	public static void main(String[] args) {
			Frame_1 frame = new Frame_1();
			frame.m1_3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == m1_1){
		
		FileDialog fd = new FileDialog(this,"새창",FileDialog.LOAD);
		fd.setVisible(true);
		String gf = fd.getFile();
		String gd = fd.getDirectory();
		String result = gd+gf;
		
		File file = new File(result);
		
		
		System.out.println(file);
		}
	}
}
