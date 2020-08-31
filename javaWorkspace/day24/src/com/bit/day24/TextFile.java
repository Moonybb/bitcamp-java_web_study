package com.bit.day24;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

//\\두개 들어가야하는데 한개만나오는데 어떻게됨?
public class TextFile extends Frame implements ActionListener{
	MenuItem mi1_1,mi1_2,mi1_3,mi1_4,mi2_1;
	TextArea ta;
	TextFile(){
		//창의 x버튼의 기능
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = new Dimension();
		
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("File");
		mi1_1=new MenuItem("New File");
		mi1_2=new MenuItem("Open");
		mi1_2.addActionListener(this);
		mi1_3=new MenuItem("Save");
		mi1_3.addActionListener(this);
		mi1_4=new MenuItem("Exit");
		mi1_4.addActionListener(this);
		
		m1.add(mi1_1);
		m1.add(mi1_2);
		m1.add(mi1_3);
		m1.addSeparator();
		m1.add(mi1_4);
		Menu m2 = new Menu("Help");
		mi2_1 = new MenuItem("Information");
		mi2_1.addActionListener(this);
		
		
		m2.add(mi2_1);
		
		mb.add(m1);
		mb.add(m2);
		
		
		
		
		this.setMenuBar(mb);
		ta = new TextArea();
		this.add(ta);
		dim = tool.getScreenSize();
		this.setTitle("untitled");
		this.setSize(500,400);
		this.setLocation(dim.width/2-this.getWidth()/2,dim.height/2-this.getHeight()/2);
		this.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new TextFile();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		//////////////////////////////////////////////
		if(obj == mi1_2){
			FileDialog open = new FileDialog(this,"Open",FileDialog.LOAD);
			open.setSize(400,300);
			open.setLocation(getX()+100,getY()+100);
			open.setVisible(true);
			String path = open.getDirectory();
			path+="\\"+open.getFile();
			File openFile=new File(path);
			FileInputStream fis = null;
			ArrayList<Byte> temp = new ArrayList<Byte>();
			  try {
		            fis = new FileInputStream(openFile);
		            while(true){
		               int su = fis.read();
		               if(su==-1){break;}
		               temp.add((byte)su);
		            }
		         } catch (FileNotFoundException e1) {
		            e1.printStackTrace();
		         } catch (IOException e1){
		            e1.printStackTrace();
		         }finally{
		            try{
		               if(fis!=null){fis.close();}
		            }catch (IOException e1){
		               e1.printStackTrace();
		            }
		         }
		         Object[] objs = temp.toArray();
		         byte[] by = new byte[objs.length];
		         for(int i=0; i<objs.length; i++){
		            by[i] = (byte)objs[i];
		         }
		         ta.setText(new String(by));
		         
		}
		//////////////////////////////////////////////
		if(mi1_3==obj){
			FileDialog dia = new FileDialog(this,"save",FileDialog.SAVE);
			dia.setVisible(true);
			dia.setLocation(getX()+100,getY()+100);
			String path = dia.getDirectory();
			path+="\\"+dia.getFile();
			File saveFile= new File(path);
			if(!saveFile.exists()){
				try {
					saveFile.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
			String msg=ta.getText();
			byte[] by=msg.getBytes();
			FileOutputStream fos=null;
			try {
				fos = new FileOutputStream(saveFile);
				for(int i=0;i<by.length;i++){
					fos.write((int)by[i]);
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}finally{
				if(fos!=null){try {
					fos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}}
			}
			
		}
		
		//////////////////////////////////////////////
		if(mi1_4==obj){
			dispose();
		}
		//////////////////////////////////////////////	
		if(obj == mi2_1){
		Dialog dia = new Dialog(this,"Information");
		Label la1 = new Label("by bit class01");
		dia.setLayout(new FlowLayout());
		dia.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dia.dispose();
			}
		});
		dia.add(la1);
		dia.setSize(200,200);
		dia.setLocation(this.getX()+100, this.getY()+100);
		dia.setVisible(true);
		}
		//////////////////////////////////////////////
		
	}	
}
