package ads;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class UpDownUi extends Frame{
	Dimension dim;
	TextField chatTf = null;
	
	TextField inputTf = null;
	Toolkit tool;
    TextArea ta = null;
   	TextArea ta2 = null;
   
   	String clientName = "";
   	String msg;
   	
   	Button btn_input;
   	Button btn_start;
   	Button btn_end;
   	
   	Label la1;
   	Label la2;
   	Label la3;
   	
   	String la1_msg;
   	
   public UpDownUi(){
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
      
      
      chatTf = new TextField(); // ä�� ���� â
      inputTf = new TextField(); // ���� �Է� â
      ta = new TextArea(); // ä��â
      ta2 = new TextArea(); // Ŭ���̾�Ʈ ��巹��
      
      
//      charTf.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent e) {
//            ta.append(charTf.getText() + "\n");
//            charTf.setText("");
//            charTf.requestFocus();
//        }
//      });
      
      ///////////////////////////////////////////////////
      Panel chat = new Panel();
      chat.setLayout(new BorderLayout());
      chat.add(chatTf, "South");
      chat.add(ta, "Center");
      chat.add(ta2,"North");
      ta.setEditable(false);
      ta2.setEditable(false);
      
      Panel center = new Panel();
      GridLayout grid = new GridLayout(3,0);
      center.setLayout(grid);
      
      

      btn_input = new Button("�Է�");
      btn_input.setSize(50,25);
      btn_input.setLocation(580,607);
      add(btn_input);
      
      btn_end = new Button("����");
      btn_end.setSize(100,60);
      btn_end.setLocation(700,450);
      add(btn_end);
      
      btn_start = new Button("����");
      btn_start.setSize(100,60);
      btn_start.setLocation(700,300);
      add(btn_start);

      Button btn_image = new Button("�̹��� ���\nUp&Down");
      btn_image.setSize(500,350);
      btn_image.setLocation(130,250);
      btn_image.setEnabled(false);
      add(btn_image);
      

      
      
      
      //////////// �������� ���� //////////////////
      la1 = new Label(la1_msg);
      center.add(la1);
      la2 = new Label();
      center.add(la2);
      //////////// �״´� //////////////////////
      
      Panel a = new Panel();
      center.add(a);
      
      Panel b = new Panel();
      b.setLayout(new BorderLayout());
      
      la3 = new Label(clientName+"�� �����Դϴ�. ������ �Է����ּ���.");
      a.add(la3);
      
      inputTf = new TextField(7);
//      inputTf.setBounds(1, 1, 300, 300);
      
      inputTf.setText("");
      a.add(inputTf,"South");
      
      
      add(center,"Center");
      add(chat, "East");
      setSize(1300, 900);
      setLocation(dim.width/2-this.getWidth()/2, dim.height/2- this.getHeight()/2);
      setResizable(false);
      setTitle("UpDown Game");
      setVisible(true);
   }
   
  
   
   public static void main(String[] args) {
      UpDownUi ui = new UpDownUi();
      
   }

}