package com.bit.updown;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


import javax.swing.JButton;


public class ChatUi extends Frame implements ActionListener{
   static String nickName;
   private Client client = new Client();
   Dimension dim;
   Toolkit tool;
   TextField chatTf = null;
   TextArea chatTa = null;
   TextArea UserTa = null;

   static String name = null;
   JButton btn_Updown;
   JButton btn_Lotto;
   JButton btn_Rock;
   
   String clientName = "";
   String msg;
      
   
   public ChatUi(String nickName){
      this.nickName = nickName;
      
      
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
      
      chatTf = new TextField(); // 채팅 쓰기 창
      chatTa = new TextArea(); // 채팅창
      chatTa.setBackground(Color.white);
      chatTa.setEditable(false);

      UserTa = new TextArea(); // 클라이언트 어드레스
      UserTa.setBackground(Color.lightGray);
      UserTa.setEditable(false);
      
      chatTf.addActionListener(this);
      
      Panel p = new Panel(new GridLayout(0,3)); // 
      
      btn_Updown = new JButton("Up Down 게임");
      btn_Updown.addActionListener(this);
      p.add(btn_Updown);
   
      btn_Rock = new JButton("가위바위보 게임");
      btn_Rock.addActionListener(this);
      p.add(btn_Rock);
      
      btn_Lotto = new JButton("로또번호 추출기");
      btn_Lotto.addActionListener(this);
      p.add(btn_Lotto);
      
      
      Panel chat = new Panel();
      chat.setLayout(new BorderLayout());
      chat.add(chatTf, "South");
      chat.add(chatTa, "Center");
      chat.add(p,"North");
      
      Panel center = new Panel();
      GridLayout grid = new GridLayout(3,0);
      center.setLayout(grid);

      
      
      add(chat, "East");
      setSize(445, 800);
      setLocation(dim.width/2+200, dim.height/2-400);
      setResizable(false);
      setTitle("미니게임&채팅");
      setVisible(true);
      
      client.setUi(this);
      client.setNickname(nickName);
      client.connet();
   }
   
  
   public static void main(String[] args) {
      Frame frame = new Frame();
       Label lbl,la1,la2,la3;
        TextField id;
         
         Panel idPanel,paPanel,loginPanel;
         Button b1,b2;


             
             frame.setLayout(new FlowLayout());
             lbl = new Label( "닉네임을 입력해 주세요" );
          
             frame.add( lbl );
             ////////////////////////////////////////////////////
             idPanel = new Panel();

             la2 = new Label("닉네임");

             ////////////////////////////////////////////////////
             id = new TextField(10);
             idPanel.add(la2);
             idPanel.add(id);
             // 로그인을 위한 패널 생성
             loginPanel = new Panel();
             b1 = new Button("입장");
             loginPanel.add(b1);
             /////////////////////////////////////////////////////
             
             
             frame.add(idPanel);
             frame.add(loginPanel);
             frame.setSize(250, 13
            		 
            		 
            		 
            		 
            		 );
             frame.setLocation(800,400);
             frame.setVisible(true);

      id.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            name = id.getText();
            
         }
      });
      while(true){
         if(name==null){
            id.setText("");
         }
         if(name!=null){
            frame.setVisible(false);
            break;
         }
      }
      
      new ChatUi(name);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      if(obj==chatTf){
         String msg = nickName+" > "+ chatTf.getText()+"\n";
         client.sendMessage(msg);
         chatTf.setText("");
         
         
         
         chatTf.setText("");
      }else if(obj==btn_Updown){
         new UpDownGame();
      }else if(obj==btn_Lotto){
         new LottoGame();
      }else if(obj==btn_Rock){
         new RockGame();
      }
   }
   
   public void appendMsg(String msg){
	  chatTa.setFont(new Font(null, Font.BOLD, 15));
      chatTa.append(msg);
   }
   
   
}



    