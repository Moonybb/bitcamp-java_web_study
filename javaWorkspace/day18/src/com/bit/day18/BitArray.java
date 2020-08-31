package com.bit.day18;

public class BitArray implements BitStack, Queue{
	Object[] arr;
	
	BitArray(){
		arr=new Object[0];
	}
	public void add(Object a){
		Object[] temp = new Object[arr.length+1];//필드 배열보다 1개 긴 새로운 인트배열 참조변수 선언 및 초기화
		//기존값
		for(int i=0;i<arr.length;i++){ // arr[i]를 temp[i]에 넣음.
			temp[i]=arr[i];
		}
		//신규값
		temp[temp.length-1]=a;// 파라미터 인트 a를 템프 배열의 마지막에 넣어줌.
		arr=temp; //템프를 필드에 넣음. 그러면 인자로 받아 어레이가 하나가 늘어남. add메서드를 통해서
	}
	
	public int size(){
		return arr.length;
	}
	public Object get(int idx){
		return arr[idx];
	}
	public void push(Object obj){
		add(obj);
	}
	public Object pull(){
		Object obj = arr[0];
		remove(0);
		return obj;
	}
	public Object pop(){
		Object obj=arr[arr.length-1];
		remove(arr.length-1);
		return obj;
	}
	
	public void remove(int idx){
		if(arr.length>0){
			Object[] temp = new Object[arr.length-1];//파라미터로 int를 받아와서, 
			//before
			for(int i=0;i<idx;i++){
				temp[i] = arr[i];
			}
			//after
			for(int i=idx;i<temp.length;i++){
				temp[i]=arr[i+1];
			}
			arr=temp;
		}
		
	}
}


