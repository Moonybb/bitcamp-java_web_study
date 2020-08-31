package com.bit.day20;

import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		HashSet set01 = new HashSet();
		
		set01.add("첫번째");
		set01.add("두번째");
		set01.add("세번째");
		set01.add("네번째");
		set01.add("두번째");//같은 값이면 중복X이므로 사이즈 늘어나지않음.
		
		System.out.println(set01.size());
		
		Iterator ite = set01.iterator();
		while(ite.hasNext()){ 
			System.out.println(ite.next()); //할때마다 가리키는것임. 다시 하려면 객체 생성후 사용. 
		}
		
//		for(int i=0;i<set01.size();i++){
//			System.out.println(ite.next()); 
//		}
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
		
	}
}
