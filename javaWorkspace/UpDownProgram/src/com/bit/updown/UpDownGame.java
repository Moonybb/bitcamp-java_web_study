package com.bit.updown;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class UpDownGame extends Frame implements ActionListener{
   Dimension dim;
   TextField inputTf = null;
   Toolkit tool;
   
   String clientName = "";
   String msg;
      
   Button btn_input;
   Button btn_start;
   Button btn_end;
   JButton btn_image;
   
   Label la_input;
   
   int input = 0;
   int random = 0;
   int start = 0;
   int end = 51;
   int tempUp = 0;
   int tempDown = 0;
   
   String line = "       ";

   
   public UpDownGame(){
      dim = new Dimension();
      tool = Toolkit.getDefaultToolkit();
      dim = tool.getScreenSize();
      
      this.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            dispose();
           }
      });
      //////////////////////////////////////////////////////////
      
      
      Panel p = new Panel(new GridLayout(6,0));
      p.setBackground(Color.pink);
      
      la_input = new Label(line+"정답을 입력해주세요.");
      la_input.setFont(new Font("맑은고딕", Font.BOLD, 30));
      la_input.setBackground(Color.pink);
      p.add(la_input);

      Label la1 = new Label();
      Label la2 = new Label();
      Label la3 = new Label();
      Label la4 = new Label();
      la1.setBackground(Color.pink);
      la2.setBackground(Color.pink);
      la3.setBackground(Color.pink);
      la4.setBackground(Color.pink);
      p.add(la1);
      p.add(la2);
      p.add(la3);
      p.add(la4);
      
      Panel TfPanel = new Panel();
      
      inputTf = new TextField(15); // 정답 입력 
      inputTf.setText("");
      inputTf.setEnabled(false);
      inputTf.addActionListener(this);
      TfPanel.add(inputTf);
      p.add(TfPanel);
      
      btn_start = new Button("시작");
      btn_start.setSize(100,60);
      btn_start.setLocation(550,150);
      btn_start.addActionListener(this);
      add(btn_start);
      
      btn_end = new Button("종료");
      btn_end.setSize(100,60);
      btn_end.setLocation(550,290);
      btn_end.addActionListener(this);
      btn_end.setEnabled(false);
      add(btn_end);
      
      btn_input = new Button("입력");
      btn_input.setSize(70,25);
      btn_input.setLocation(440,460);
      btn_input.addActionListener(this);
      add(btn_input);
      
      btn_image = new JButton();
      Image img_ComeOn = tool.createImage("Start.png");
      Icon icon = new ImageIcon(img_ComeOn);
      btn_image.setIcon(icon);
      btn_image.setSize(490,310);
      btn_image.setLocation(30,130);
      add(btn_image);
      

      add(p);
      setSize(690, 550);
      setLocation(470, dim.height/2-400);
      setResizable(false);
      setTitle("Up Down 게임");
      setVisible(true);
      
   }
   
  
   public static void main(String[] args) {
      
      new UpDownGame();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
         
      if(obj==btn_start){
          input = 0;
          random = 0;
          start = 0;
          end = 51;
          tempUp = 0;
          tempDown = 0;
          tool = Toolkit.getDefaultToolkit();
          Image img_ComeOn = tool.createImage("ComeOn.png");
          Icon icon = new ImageIcon(img_ComeOn);
          btn_image.setIcon(icon);
         
            la_input.setText(line+"게임이 시작되었습니다 1~50중 값 하나를 숫자로만 입력하세요.");
            inputTf.setEnabled(true);
            random = (int)(Math.random()*50+1);
   
            la_input.setText(line+"1~50사이의 숫자를 입력해주세요");
           
     }else if(obj==inputTf||obj==btn_input){
        try{
           
        tool = Toolkit.getDefaultToolkit();
        Image img_Answer = tool.createImage("정답.jpg");
        Image img_Up = tool.createImage("UP.png");
        Image img_Down = tool.createImage("DOWN.png");
        
       
        
        while(true){
          
           input = Integer.parseInt(inputTf.getText());
           inputTf.setText("");
           
              if(input>0&&input<=50){
                 // down
                 if(random<input){
                    tempDown = input;
                    if(tempDown>=end){
                       la_input.setText(line+"다시입력하세요            범위  : "+(start+1)+"~"+(end-1));
                      
                       continue;
                    }else{
                       
                       Icon icon = new ImageIcon(img_Down);
                       btn_image.setIcon(icon);
                       end = tempDown;
                       la_input.setText(line+"입력한 값은 "+input+"입니다.           범위 : "+(start+1)+"~"+(end-1));
                       
                    }
                 }else if(random>input){
                    tempUp = input;
                    if(tempUp<=start){
                       la_input.setText(line+"다시입력하세요            범위  : "+(start+1)+"~"+(end-1));
                       continue;
                    }else{
                       Icon icon = new ImageIcon(img_Up);
                       btn_image.setIcon(icon);
                       
                       start = tempUp;
                       la_input.setText(line+"입력한 값은 "+input+"입니다.           범위 : "+(start+1)+"~"+(end-1));
                   
                    }
                 }else if(random==input){
                    btn_end.setEnabled(true);
                    Icon icon = new ImageIcon(img_Answer);
                    btn_image.setIcon(icon);
                    la_input.setText(line+"축하드립니다. 정답입니다.");
                    input = 0;
                    random = 0;
                    start = 0;
                    end = 51;
                    tempUp = 0;
                    tempDown = 0;
                    break;
                 }
                 
              }else{
                 la_input.setText(line+"다시입력하세요            범위 : "+(start+1)+"~"+(end-1));
                 continue;         
              }   
              
           
           }
        }catch(NumberFormatException e1){}
     
     }else if(obj==btn_end){
        Image img_ComeOn = tool.createImage("Start.png");
        Icon icon = new ImageIcon(img_ComeOn);
        btn_image.setIcon(icon);
        
     }
      
     
   }

}