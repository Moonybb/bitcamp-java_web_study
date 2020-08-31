package com.bit.updown;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;




public class LottoGame extends Frame implements ActionListener{
	Dimension dim = new Dimension();
	Toolkit tool;
	Random ran = new Random();
	Label la1;
	Label la2;
	Label la3;
	Label la4;
	Label la5;
	
	
	TextField Tf;
	Button btn_Start;
	
	LottoGame(){
		tool = Toolkit.getDefaultToolkit();
		dim = tool.getScreenSize();
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
	        }
		});
		///////////////////////////////////////////////////////////////////
		
		Panel p = new Panel();
		
//		
		Tf = new TextField(10);
		Tf.addActionListener(this);
		p.add(Tf);
		
		btn_Start = new Button("추출 시작");
		btn_Start.setSize(70,40);
		btn_Start.setLocation(450, 170);
		p.add(btn_Start);
		btn_Start.addActionListener(this);
			
		
		la1 = new Label();
		la1.setFont(new Font(null, Font.BOLD, 25));
		la2 = new Label();
		la2.setFont(new Font(null, Font.BOLD, 25));
		la3 = new Label();
		la3.setFont(new Font(null, Font.BOLD, 25));
		la4 = new Label();
		la4.setFont(new Font(null, Font.BOLD, 25));
		la5 = new Label();
		la5.setFont(new Font(null, Font.BOLD, 25));
		
		Panel ppp = new Panel(new GridLayout(5,0));
		ppp.setBackground(Color.ORANGE);
		la1.setText("로또 게임 수를 입력해주세요             범위 : 1~5");
		ppp.add(la1);
		ppp.add(la2);
		ppp.add(la3);
		ppp.add(la4);
		ppp.add(la5);
		
		add(ppp);
		setBackground(Color.white);
		add(p,"North");
		setSize(610, 400);
		
		setLocation(560, dim.height/2-400);
		setTitle("로또번호 추출기");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LottoGame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj =  e.getSource();
		try{
		if(obj==btn_Start||obj==Tf){			
		
			
			la2.setText("");
			la3.setText("");
			
			la4.setText("");
			la5.setText("");
			
			
			List<Lotto> list = new ArrayList<Lotto>();
			
			int a = Integer.parseInt(Tf.getText());
			for(int i =0; i<a;i++){
				list.add(new Lotto());
			}
			try{
			 la1.setText("             Game 1"+list.get(0).toString());
			 la2.setText("             Game 2"+list.get(1).toString());
			 la3.setText("             Game 3"+list.get(2).toString());
			 la4.setText("             Game 4"+list.get(3).toString());
			 la5.setText("             Game 5"+list.get(4).toString());
			}catch(IndexOutOfBoundsException e1){
				
			}
			Tf.getText();
			Tf.setText("");
		}
		}catch(NumberFormatException e2){
			la1.setText("로또 게임 수를 입력해주세요             범위 : 1~5");
		}
	}
}
class Lotto{
	Random ran= new Random();
	Set<Integer> lotto;
	char[] ch;
	Lotto(){
		lotto = new TreeSet<Integer>();
		while(lotto.size() < 6){
			lotto.add(ran.nextInt(45)+1);
		}
	}
	
	public String toString(){
		
		String	a  = lotto.toString();
		return "            "+a;
	} 
}