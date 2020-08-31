package com.bit.day18;

import java.util.Arrays;
import java.util.Scanner;

class Student{
   int num,kor,eng,math;
}

public class Ex03 {
   public static void main(String[] args) {
      // 학생 성적관리 프로그램 (ver 0.2.0)
      // 학번 국어 영어 수학
      Scanner sc = new Scanner(System.in);
      
      System.out.println("학생 성적관리 프로그램 (ver 0.2.0)");
      System.out.println("----------------------------------");
      Student[] data = new Student[0];
      String input = null;
      while(true){
         System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >> ");
         input = sc.nextLine();

         if(input.equals("0")){
            break; // input 이 0이면 반복문 탈출
         }else if(input.equals("1")){
            System.out.println("----------------------------------");
            System.out.println("학번\t|국어\t|영어\t|수학");
            System.out.println("----------------------------------");
            for(int i=0; i<data.length; i++){
               Student stu = data[i];
               System.out.print(stu.num);
               System.out.print("\t|");
               System.out.print(stu.kor);
               System.out.print("\t|");
               System.out.print(stu.eng);
               System.out.print("\t|");
               System.out.println(stu.math);
               System.out.println("----------------------------------");
            }
         }else if(input.equals("2")){
            Student stu = new Student();
            System.out.print("학번 >>");
            stu.num = Integer.parseInt(sc.nextLine());
            System.out.print("국어 >>");
            stu.kor = Integer.parseInt(sc.nextLine());
            System.out.print("영어 >>");
            stu.eng = Integer.parseInt(sc.nextLine());
            System.out.print("수학 >>");
            stu.math = Integer.parseInt(sc.nextLine());
            Student[] temp = new Student[data.length+1]; // temp 배열의 길이를 data배열이 길이+1 만큼 할당해준다
            // 기존
            // 배열의 깊은복사 방법 1
//            for(int i=0; i<data.length; i++){
//               temp[i] = data[i]; // data의 기존값을 temp에 깊은복사
//            }
            
            // 배열의 깊은복사 방법2
            System.arraycopy(data, 0, temp, 0, data.length);
            
            // 배열의 깊은복사 방법3
            temp = Arrays.copyOf(data, data.length+1);
            
            
            data=temp; // 기존 배열보다 사이즈가 하나 더 큰 새로운 객체를 기존의 객체가 참조하도록 한다.
            // 신규
            data[data.length-1]=stu;
         }else if(input.equals("3")){
        	 Student stu = new Student();
        	 System.out.print("학번>>");
        	 stu.num=Integer.parseInt(sc.nextLine());
        	 System.out.print("국어>>");
        	 stu.kor=Integer.parseInt(sc.nextLine());
        	 System.out.print("영어>>");
        	 stu.eng = Integer.parseInt(sc.nextLine());
        	 System.out.print("수학>>");
        	 stu.math=Integer.parseInt(sc.nextLine());
        	 int i=-1;
        	 for(i=0;i<data.length;i++){
        		 Student target=data[i];
        		 if(target.num==stu.num){break;}
        	 }
        	 if(i<data.length){
        		 data[i]=stu;
        	 }else{
        		 System.out.println("수정할 학번이 없습니다.");
        	 }
        	 
         }else if(input.equals("4")){
        	 System.out.print("학번>>");
        	 int num=Integer.parseInt(sc.nextLine());
        	 int idx=-1;
        	 for(int i=0;i<data.length;i++){
        		 if(data[i].num==num){
        			 idx=i;
        		 }
        	 }
        	 if(idx>-1){
        		 Student[] temp = new Student[data.length-1];
        		 //before
//        		 for(int i=0;i<idx;i++){
//        			 temp[i]=data[i];
//        		 }
        		 System.arraycopy(data, 0, temp, 0, idx);
//        		 for(int i=idx;i<temp.length;i++){
//        			 temp[i]=data[i+1];
//        		 }
        		 System.arraycopy(data, idx+1, temp, idx, temp.length-idx);
        		 data=temp;
        	 }
         }
         
      }
      System.out.println("이용해주셔서 감사합니다.");
   }

}