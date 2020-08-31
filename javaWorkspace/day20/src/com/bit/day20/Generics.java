package com.bit.day20;

import java.util.ArrayList;

public class Generics {
	
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("item");
		list.add("item");
		list.add("item");
//		list.add(d);
		
		String item1 = list.get(0);
		String item2 = list.get(1);
		String item3 = list.get(2);
	}
}
