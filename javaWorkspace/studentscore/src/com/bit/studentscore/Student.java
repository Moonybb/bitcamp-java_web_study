package com.bit.studentscore;

public class Student {
	String name;
	int kor,math,eng;
	int num;
	
	void setName(String name){
		this.name=name;
	}
	void setKor(int kor){
		this.kor=kor;
	}
	void setMath(int math){
		this.math=math;
	}
	void setEng(int eng){
		this.eng=eng;
	}
	void setNum(int num){
		this.num=num;
	}
	String getName(){
		return name;
	}
	int getKor(){
		return kor;
	}
	int getMath(){
		return math;
	}
	int getEng(){
		return eng;
	}
	int getNum(){
		return num;
	}
	
}

