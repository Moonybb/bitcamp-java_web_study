package com.bit.day13;

public class Ex07 {
//	static Ex07 ex;
//	
//	public void func01(){
//		
//	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println();
//		System.exit(1);
		Ex07 me = new Ex07();
		
		long begin=System.currentTimeMillis();
//		Ex07.ex.func01(); // Ex07.ex에 객체가 있다면 메서드 호출 가능.
		
		int[] origin={1,3,5,7,9};
		int[] dest=new int[5];
		
//		for(int i=0;i<origin.length;i++){
//			dest[i]=origin[i];
//		}
		System.arraycopy(origin, 2, dest, 0, 3);//origin의 배열1부터 dest는 1부터, origin의 3까지
		for(int i=0;i<dest.length;i++){
			System.out.println(dest[i]);
		}
		long end=System.currentTimeMillis();
		System.out.println("main 수행시간 : " + (end-begin)+"ms");
	}

}
