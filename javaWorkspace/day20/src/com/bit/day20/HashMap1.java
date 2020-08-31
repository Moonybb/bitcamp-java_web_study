package com.bit.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 * - 둘의 가장 큰 차이점은 동기화 보장 유무, 키와 값에 null 가능 여부 

- 동기화가 필요없다면 해시맵을, 동기화 보장이 필요하다면 해시테이블 사용  

- 동기화 보장 유무의 차이 외에는 차이가 거의 없으며 자바 기준으로 사용법도 똑같음 

 

* 멀티쓰레드 프로그래밍에서는 하나의 객체를 여러 쓰레드가 동시에 접근할 수 있기 때문에 데이터의 일관성(Consistency)을 유지하기 위해 동기화가 필요.

 

* 해쉬테이블의 동기화는 속도를 굉장히 느리게 해주기 때문에, 동기화가 보장되는 HashMap이 등장 -> ConcurrentHashMap

* 동기화 보장 OK, 키와 값의 NULL 불가 
* */


public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("2key1","val1");
		map.put("4key2","val2");
		map.put("5key3","val3");
		map.put("1key4","val4");
		//key는 중복이 불가,
		
//		Set<String> keys = map.keySet();
//		Iterator<String> ite = keys.iterator();
//		while(ite.hasNext()){
//			String key = ite.next();
//			System.out.println(key+":"+map.get(key));
//		}
		Set<Entry<String,String>> entrys = map.entrySet();
		Iterator<Entry<String,String>> ite = entrys.iterator();
		while(ite.hasNext()){
			Entry<String,String> entry = ite.next();
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
	}

}
