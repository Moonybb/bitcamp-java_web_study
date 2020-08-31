package com.bit.day20;

import java.util.*;


public class Ex05 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		
			
		
		list.add(1111);
		list.add(5555);
		list.add(7777);
		list.add(3333);
		list.add(2222);
		
		list.sort(new Comparator(){//익명함수.
				
				@Override
				public int compare(Object o1, Object o2) {
//			return (int)o1-(int)o2;
//			return (int)o2-(int)o1;
					return -1;
				}	
		});//Comparator 타입을 필요로함.
		
		List list2=list.subList(1, 3);//새로운 List타입의 객체 생성, 다형성을 이용해서 list의 메서드를 이용해 잘라낸 것을 list2가 가리키게함.
		
		for(int i = 0; i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		
	}

}
