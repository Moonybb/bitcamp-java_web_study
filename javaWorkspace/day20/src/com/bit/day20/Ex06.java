package com.bit.day20;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		// 로또 번호 생성기(ver 0.1.0)
		// 보너스번호까지 출력하시오
		Set lotto = new HashSet();
		Random num = new Random();
		
		while(lotto.size()<=7){//6개 될때까지 반복하는데, 중복허용이 안되므로
			lotto.add(num.nextInt(45)+1);
		}
		
		Iterator note = lotto.iterator();
		while(note.hasNext()){ // 같은 값이면 불러 오지 않음.
			System.out.print(note.next()+" ");
			
		}
		System.out.println();
		List list = new ArrayList(lotto);// 7개 뽑은거 집어넣고
		
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		
		List list2 = list.subList(0, 6); // 잘라서 list2에 넣고
		list2.sort(new Comparator() { // list2 정렬 후 리턴 메서드.

			@Override
			public int compare(Object o1, Object o2) {
				
				return (int)o1-(int)o2;
			}
		});
		list2.add(list.get(6)); //  list2에 list의 인덱스 6번의 값을 추가해줌.
		
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+ " ");
		} //출력
		
//		//bonus 붙여 출력
//		
//		System.out.print(num.nextInt(45)+1);
	}

}
