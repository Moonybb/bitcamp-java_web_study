package com.bit.studentscore;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Integer, Student> stu = new HashMap<Integer, Student>();
		int num=0;
		int number=0;
		System.out.println("학생 성적 입력기");
		while(true){
		System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>>");
		int input = sc.nextInt();
		sc.nextLine();
		if(input==1){
			Set<Integer> set = stu.keySet();
			Iterator<Integer> iterator = set.iterator();
			System.out.println("학번|\t 이름|\t 국어|\t 영어|\t 수학|");
			while(iterator.hasNext()){
				int key = iterator.next();
				
				System.out.print("    "+stu.get(key).getNum()+"\t");
				System.out.print(stu.get(key).getName()+"\t");
			    System.out.print("    "+stu.get(key).getKor()+"\t");
		       	System.out.print("    "+stu.get(key).getEng()+"\t");
			    System.out.print("    "+stu.get(key).getMath()+"\t");
			    System.out.println(" ");
			}
			
		}else if(input==2){
			number++;
			Student student = new Student();
			student.setNum(number);
			System.out.print("이름>>");
			student.setName(sc.nextLine());
			System.out.print("국어>>");
			student.setKor(sc.nextInt());
			System.out.print("영어>>");
			student.setEng(sc.nextInt());
			System.out.print("수학>>");
			student.setMath(sc.nextInt());
			stu.put(num,student);
			num++;
			
			
		}else if(input==3){
			System.out.print("수정할 학번>>");
			Integer number1=sc.nextInt();
			sc.nextLine();
			
			Set<Integer> set = stu.keySet();
			Iterator<Integer> iterator = set.iterator();
			
			while(iterator.hasNext()){
				int key = iterator.next();
				
				if(number1.equals(stu.get(key).getNum())){
					System.out.print("이름>>");
					stu.get(key).setName(sc.nextLine());
					System.out.print("국어>>");
					stu.get(key).setKor(sc.nextInt());
					System.out.print("영어>>");
					stu.get(key).setEng(sc.nextInt());
					System.out.print("수학>>");
					stu.get(key).setMath(sc.nextInt());
					
				}
			}
			
		}else if(input==4){
			System.out.print("삭제할 학번>>");
			Integer number1=sc.nextInt();
			
			if(stu.get(number1-1).getNum()==number1){
				stu.remove(stu.get(number1-1));
				System.out.println("test");
			}
			
			
			
			
		}else if(input==0){break;}
		
		}//while

	}
}
