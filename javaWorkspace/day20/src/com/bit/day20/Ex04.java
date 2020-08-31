package com.bit.day20;

import java.util.Iterator;
import java.util.TreeSet;

class MyCar implements Comparable{
	int su;
	MyCar(int a){
		su=a;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return su-((MyCar)(o)).su;
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		java.util.Set set1 = new TreeSet();//중복값 검사 해야함. hash는 해쉬값(주소값)을 가리키는것이고, Tree는 이진(유니코드값비교)
		
		set1.add(new MyCar(1));
		set1.add(new MyCar(2));
		set1.add(new MyCar(3));
		set1.add(new MyCar(4));
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()){ //
			MyCar car=(MyCar)ite.next();
			System.out.println(car.su);
		}
	}

}
