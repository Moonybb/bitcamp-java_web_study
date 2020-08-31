package com.bit.day25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student11{
	int kor,eng,math,num;
	String name;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


public class StudentSc {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적 관리 프로그램 ver0.1.0");
		String msg = "학번\t이름\t국어\t영어\t수학\t합계\t평균";
		ArrayList<Student11> list = new ArrayList<Student11>();
		String path = "data3.txt";
		File file = new File(path);
		FileOutputStream fos= null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		if(file.exists()){
			try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String tap = null;
			while(true){
			int num=0;
			String name = null;
			int kor=0;
			int eng=0;
			int math=0;
			
				
//				int su =fis.read();
//				if(su==-1){break;}
				num = dis.readInt();
				name = dis.readUTF();
				kor = dis.readInt();
				eng = dis.readInt();
				math = dis.readInt();
//				tap = dis.readUTF();
				
				
				Student11 stu = new Student11();
				
				stu.setNum(num);
				stu.setName(name);
				stu.setKor(kor);
				stu.setEng(eng);
				stu.setMath(math);
				list.add(stu);
				
//				if(tap.equals("\t")){
//					continue;
//				}
			}
//			}//while
			
			
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (EOFException e){
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis!=null)dis.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}
		while(true){
			
			
			System.out.print("1.보기 2.입력 0.종료>>");
			
			int input = sc.nextInt();
			sc.nextLine();
			
			if(input==1){
				System.out.println(msg);
				for(Student11 s : list){
					System.out.print(s.getNum()+"\t");
					
					System.out.print(s.getName()+"\t");
					System.out.print(s.getKor()+"\t");
					System.out.print(s.getEng()+"\t");
					System.out.print(s.getMath()+"\t");
					int sum = s.getKor()+s.getMath()+s.getEng();
					double average = sum/3*100/100.0;
					System.out.print(sum+"\t"+average);
					System.out.println();
				}
				
				
				
			}else if(input==2){
				Student11 stu = new Student11();
				System.out.print("학번>>");
				stu.setNum(sc.nextInt());
				sc.nextLine();
				System.out.print("이름>>");
				stu.setName(sc.nextLine());
				System.out.print("국어>>");
				stu.setKor(sc.nextInt());
				System.out.print("영어>>");
				stu.setEng(sc.nextInt());
				System.out.print("수학>>");
				stu.setMath(sc.nextInt());
				list.add(stu);
				
			}else if(input==0){
				try {
					fos = new FileOutputStream(file);
					dos = new DataOutputStream(fos);
					for(Student11 s : list){
						dos.writeInt(s.getNum());
						dos.writeUTF(s.getName());
						dos.writeInt(s.getKor());
						dos.writeInt(s.getEng());
						dos.writeInt(s.getMath());
						
					}
					
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(dos!=null)dos.close();
						if(fos!=null)fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				
				
				break;
			}
			
			
		}
	}
}
