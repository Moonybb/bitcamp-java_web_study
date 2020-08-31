package com.bit.day16;

import java.util.ArrayList;
import java.util.Scanner;

//UI
//우리가 웹을 배웠으면 우리의 출력을 담당하는건 웹페이지가 되고
//뷰어는 거기에 html코드를 보내주거나 아니면 아예 뷰어라는 클래스가 없을 때도 있다!
//하지만 우리는 웹을 안배웠으니까 여기서 main 메서드를 넣어놓자
public class StudentViewer {
	public StudentVO setInformation(Scanner sc){
		StudentVO s = new StudentVO();
		System.out.print("학생의 이름: ");
		s.setName(sc.nextLine());
		System.out.print("학생의 국어점수: ");
		s.setKorean(sc.nextInt());
		System.out.print("학생의 영어점수: ");
		s.setEnglish(sc.nextInt());
		System.out.print("학생의 수학점수: ");
		s.setMath(sc.nextInt());
		return s;
	}
	
}
//이렇게 데이터를 담는 틀(모델), UI(뷰), 모델을 컨트롤 하는 컨트롤러로 분리해서
//프로그램을 만드는 패턴을 MVC 패턴이라고 한다.
