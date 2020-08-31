package com.bit.day20;

public class Ex01 {

	public static void main(String[] args) {
		//vector
		
		java.util.Vector vec01 = new java.util.Vector();
		vec01.addElement("첫번째");
		vec01.addElement("두번째");
		vec01.addElement("세번째");
		vec01.addElement("네번째");
		
		vec01.insertElementAt("3번째", 2);//인덱스 add와 같은 기능, 끼워 집어 넣는다.
//		vec01.removeElementAt(3);
		
//		vec01.removeElement("두번째");//내용에 해당하는 벡터배열삭제

		java.util.Enumeration em=vec01.elements();//다형성으로 인터페이스 사용, 선언하며 Vector의 elements 메서드
		while(em.hasMoreElements()){
		System.out.println(em.nextElement());
		}
		
		
//		System.out.println(vec01.elementAt(0));
//		System.out.println(vec01.elementAt(1));
//		System.out.println(vec01.elementAt(2));
//		System.out.println(vec01.elementAt(3));
//		System.out.println(vec01.elementAt(4));
		
		
		
		
	}

}
