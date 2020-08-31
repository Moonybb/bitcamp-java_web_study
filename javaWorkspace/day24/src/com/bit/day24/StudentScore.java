package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StudentScore {

   public static void main(String[] args) {
	   // Map 활용 성적관리 프로그램
	   // data loading
	   ArrayList<HashMap<String,String>> data = null;
	   data = new ArrayList<>();
	   String path = "data.bin";
	   File loadFile = new File(path);
	   FileInputStream fis = null;
	   ArrayList<Byte> buf = new ArrayList<>();
	   if(loadFile.exists()){
		   try {
			   fis = new FileInputStream(loadFile);
				while(true){
					int su=fis.read();
					if(su==-1){break;}
					buf.add((byte)su);
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null){fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Object[] obj = buf.toArray(); 
		byte[] by = new byte[obj.length];
		for(int i=0;i<by.length;i++){
			by[i]=(byte)obj[i];
		}
		
		String msg = new String(by);
//		System.out.println(msg);
		String[] msgs = msg.split("\n");//msg를 \n기준으로 잘라 String[] 참조변수 msgs가 가르치게한다.
		
		for(int i=0;i<msgs.length;i++){
			String temp=msgs[i];
			String[] ele= temp.split(",");
//			System.out.println(Arrays.toString(ele));
			try{
			HashMap<String, String> map = new HashMap<>();
			map.put("num", ele[0]);
			map.put("name", ele[1]);
			map.put("kor", ele[2]);
			map.put("eng", ele[3]);
			map.put("math", ele[4]);
			data.add(map);
			}catch(ArrayIndexOutOfBoundsException e){
				
			}
		}
		
		
	  }
	   
      String title = "성적관리프로그램(ver 0.2.2)";
      String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>>";
      System.out.println(title);
      System.out.println("-----------------------------------------\n\n");
      Scanner sc = new Scanner(System.in);

      String input = null;
      while(true){
    	  System.out.print(menu);
    	  input = sc.nextLine();
    	  if("0".equals(input)){
    		  // 프로그램이 종료하기 이전에 save
    		  //프로그램이 종료 되고 나서도 기존 값이 보존되게 한다.
    		 
    		  
    		  File file = new File(path);
    		  if(!file.exists()){
    			  try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
    		  }
    		  String tempDate="";
    		  //파일에 데이터를 작성하기 위해 먼저 파일이 존재하지 않으면 파일을 생성
    		  FileOutputStream fos = null;
    		  
    		  //파일에 데이터를 쉽게 작성하기 위해 데이터를 문자열로 가공
    		  //추후 문자열을 읽어들일때 얼마만큼 나눠서 읽어들일지 구분단위를 위해서
    		  //한 학생은 \n을 기준으로 한 학생의 각 데이터(학번,이름,국어,영어,수학)는,를 기준으로
    		  
    		  for(int i=0;i<data.size();i++){
    			  HashMap<String, String> stu= data.get(i);
    			  String num=stu.get("num");
    			  String name=stu.get("name");
    			  String kor=stu.get("kor");
    			  String eng=stu.get("eng");
    			  String math=stu.get("math");
    			  tempDate+=num+","+name+","+kor+","+eng+","+math+"\n";
    			  
    		  }
    		  try {
				fos = new FileOutputStream(file);
				byte[] su=tempDate.getBytes();
				for(int i=0;i<su.length;i++){
						fos.write((int)su[i]);
				}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					}catch (IOException e) {
						e.printStackTrace();
					}finally {
					try {
						if(fos!=null){fos.close();}
					} catch (IOException e) {
						e.printStackTrace();
					}
					}
				
    		  
    		  
    		  System.out.println("이용해주셔서 감사합니다.");
    		  break;
    	  }else if("1".equals(input)){
    		  //보기
    		  System.out.println("--------------------------------------");
    		  System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
    		  System.out.println("--------------------------------------");
    		  
    		  for(int i=0;i<data.size();i++){
    			  HashMap<String, String> stu = data.get(i);
    			  int num = Integer.parseInt(stu.get("num"));
    			  String name=stu.get("name");
    			  int kor=Integer.parseInt(stu.get("kor"));
    			  int eng = Integer.parseInt(stu.get("eng"));
    			  int math = Integer.parseInt(stu.get("math"));
    			  int total = kor+eng+math;
    			  double avg = total*100/3/100.0;
    			  System.out.print(num+"\t");
    			  System.out.print(name+"\t");
    			  System.out.print(kor+"\t");
    			  System.out.print(eng+"\t");
    			  System.out.print(math+"\t");
    			  System.out.print(total+"\t");
    			  System.out.println(avg);
    			  
    			  
    		  }
    		  System.out.println("--------------------------------------");
    		  
    	  }else if("2".equals(input)){
    		  //입력
    		  HashMap<String, String> stu= null;
    		  stu = new HashMap<>();
    		  System.out.print("학번>>");
    		  stu.put("num",sc.nextLine());
    		  System.out.print("이름>>");
    		  stu.put("name",sc.nextLine());
    		  System.out.print("국어>>");
    		  stu.put("kor",sc.nextLine());
    		  System.out.print("영어>>");
    		  stu.put("eng",sc.nextLine());
    		  System.out.print("수학>>");
    		  stu.put("math",sc.nextLine());
    		  data.add(stu);
    		  
    		  
    		  
    	  }else if("3".equals(input)){
    		  //수정
    		  System.out.print("수정할 학번>>");
    		  input = sc.nextLine();
    		  for(int i=0;i<data.size();i++){
    			  HashMap<String,String> stu = data.get(i);
    			  if(input.equals(stu.get("num"))){
    				  stu.put("num", input);
    				  System.out.print("이름>>");
    	    		  stu.put("name",sc.nextLine());
    	    		  System.out.print("국어>>");
    	    		  stu.put("kor",sc.nextLine());
    	    		  System.out.print("영어>>");
    	    		  stu.put("eng",sc.nextLine());
    	    		  System.out.print("수학>>");
    	    		  stu.put("math",sc.nextLine());
    	    		  
    	    		  break;
    			  }
    		  }
    	  }else if("4".equals(input)){
    		  //삭제
    		  System.out.print("삭제할 학번>>");
    		  input = sc.nextLine();
    		  for(int i=0;i<data.size();i++){
    			  HashMap<String,String> stu = data.get(i);
    			  if(input.equals(stu.get("num"))){
    				  data.remove(i);
    				  break;
    			  }
    		  }
    		  
    		  
    	  }else{
    		  System.out.println("입력 오류");
    	  }
      }
      
   }
}