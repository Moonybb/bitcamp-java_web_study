package com.bit.day20;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		Map map1 = new HashMap(); // collection 타입을 인자로 받아 낼 수 없음.
		// key의 중복은 불가능
		// 동일한 key 호출하면 벨류값이 바뀔 수 있기 때문. 
		// value의 중복은 가능
		// why? key로 호출 하기 때문.
		map1.put("key1","val1");
		map1.put("key2","val2");
		map1.put("key3","val3");
		map1.put("key4","val4");
		
		map1.put("key1", "abcd");
		map1.put(1234 , "ABCD");
		map1.put(true, "abcdABCD");
		map1.put(null, "1234");
		
		
		System.out.println(map1.get(null)); // key를 호출하면 원하는 벨류값 얻을 수 있음. 
											  
		
	}

}
