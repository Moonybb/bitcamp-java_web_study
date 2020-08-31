package com.bit.day12;

public class Ex15 {

	public static void main(String[] args) {
		String msg = "JavaWebFramework";
		
		int su=msg.indexOf("web");//web이 있는지 검색후 없으면 -1 반환
		String st1=msg.replace('z', 'Z'); // 없으므로 msg 전체 반환하여 저장
//		char ch=msg.charAt(-1);//IndexOutOfBounds Exception
		boolean boo1=msg.contains("web");//있는지 없는지 검사
		boolean boo2=msg.startsWith("ja");
		boolean boo3=msg.endsWith("a");
		
		String st2=msg.toLowerCase();
		String st3=msg.toUpperCase();
		System.out.println(st3);
		
		String msg2="";
		
		int lang = msg2.length();
		boolean boo4=msg2.isEmpty();
		String st4=msg2.trim();
		System.out.println(boo4                                                                                   );
	}

}
