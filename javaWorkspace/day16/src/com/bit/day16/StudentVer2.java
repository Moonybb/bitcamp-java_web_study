package com.bit.day16;

import java.util.Scanner;

//3세대 언어식으로 한번 짜보자.
public class StudentVer2 {

	String name;
	int korean;
	int english;
	int math;
	//메서드를 만들자
	
	public int calculateSum(){
		return korean+english+math;
	}
	public double calculateAverage(){
		return calculateSum() / 3.0;
	}
	public static void main(String[] args){
		StudentVer2 s = new StudentVer2();
		
		
		Scanner sc = new Scanner(System.in);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요.:");
		s.name= scanner.nextLine();
		System.out.print("학생의 국어 점수를 입력하세요:");
		s.korean = scanner.nextInt();
		System.out.print("학생의 영어점수를 입력하세요:");
		s.english = scanner.nextInt();
		System.out.print("학생의 수학점수를 입력하세요:");
		s.math = scanner.nextInt();
		
		
		System.out.printf("학생의 이름: %s\n 국어점수: %d\n 영어점수: %d\n 수학점수: %d\n 총점: %d\n 평균 : %.2f",
							s.name,s.korean,s.english,s.math,s.calculateSum(),s.calculateAverage());
		
		scanner.close();
	}
}
