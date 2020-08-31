package com.bit.day13;

public class Ex09 {
   public static void main(String[] args) {
      java.util.Scanner sc = null;
      sc = new java.util.Scanner(System.in);
      String title = "학생성적관리프로그램(ver 0.0.1)";
      String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료";
      int input = 0;
      String data = "학번\t|국어\t|영어\t|수학\t|합계\t|평균\n";
      data+="===================================================\n";
      
      System.out.println(title);
      System.out.println("------------------------------------");
   
      int cnt = 0;
      int kor = 0;
      int eng = 0;
      int math = 0;
      int sum = 0;
      double avg = 0;
      while(true){
         System.out.println(menu);
         input=sc.nextInt();
         if(input==0){break;}
         if(input==1){
            System.out.println(data);
         }
         if(input==2){
            cnt++;
            System.out.print("국어 >>");
            kor = sc.nextInt();
            System.out.print("영어 >>");
            eng = sc.nextInt();
            System.out.print("수학 >>");
            math = sc.nextInt();
            sum = kor+eng+math;
            avg = sum*100/3/100.0;
         
            data+=cnt+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg+"\n";
         }
         if(input==3){
            System.out.print("학번 >> ");
            int number = sc.nextInt();
            System.out.print("국어 >>");
            kor = sc.nextInt();
            System.out.print("영어 >>");
            eng = sc.nextInt();
            System.out.print("수학 >>");
            math = sc.nextInt();
            sum = kor+eng+math;
            avg = sum*100/3/100.0;
            
            String msg = number+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg+"\n";
            
            int idx = data.indexOf("\n"+number);
            String data1=data.substring(0,idx+2);
            String data2=data.substring(data.indexOf("\n",idx+1));
            data=data1+msg+data2;
            
            
         }if(input==4){
             System.out.print("학번 >> ");
             int number = sc.nextInt();
            
             
             int idx = data.indexOf("\n"+number);
             
             String data1=data.substring(0,idx+1);
             String data2=data.substring(data.indexOf("\n",idx+1));
             data=data1+data2;
         }
      }
      
      System.out.println("이용해주셔서 감사합니다.");
   }
}