package com.bit.day16;

import sun.security.util.Length;
//StudentVO를 동적할당하여
//배열의 크기가 상관없이 사용 할 수 있게 해주는 클래스


public class StudentArrayUtil {
	//배열의 크기를 1 늘려주는 메서드
	
	private static StudentVO[] expand(StudentVO[] arr){ // 파라미터 값으로 StudentVO[] 참조변수 arr 로 받고, (arr라는건 이름, 메서드안에서 파라미터를 통해 들어온 값을 이름을 지정한것)
		StudentVO[] temp = new StudentVO[arr.length];//
		for(int i=0;i<arr.length;i++){
			temp[i] = arr[i];
		}//참조변수들의 주소값 복사만 하고 있는것.
		arr = new StudentVO[temp.length +1]; // 같은 데이터 타입만 넣어 줄 수 있기 때문
		for(int i=0;i<temp.length;i++){
			arr[i] = temp[i];
		}
		return arr; //길이가 1이 늘어나는 arr 리턴.
	}
	
	
	public static StudentVO[] add(StudentVO[] arr, StudentVO s){//메서드를 만들어줄건데 add야, 파라미터가 필요해 studentVO[]는 arr라고 부르고, StudentVO는 s라고 불러라.
		arr = expand(arr);
		arr[arr.length -1] = s;
		return arr; //
	
	}
	//배열에서 해당 객체가 몇번째 인덱스 인지 알려 주는 메서드
	//객체를 비교할때는 비교연산자(==)가 아닌 메서드를 통해서 비교해야 한다.
	//왜냐 ! 비교연산자는 필드의 저장된 값이 아닌 주소값 자체를 비교하기 때문!
	//그럼 equals 메서드를 만들어 봅시다.
	
	//몇번째 인덱스인지 확인할때
	//만약에 우리 배열에 없는 애의 인덱스를 요구하게 된다면?
	//배열에서 절대 존재 할 수 없는 음의 정수 인덱스를 주면 된다.
	//음의 정수 중에 가장 간단한 -1을 리턴하게 만들어 주면 됨.
	
	public static int indexOf(StudentVO[] arr, StudentVO s){
		for(int i=0;i<arr.length;i++){
			if(s.equals(arr[i])){
				return i;
			}
		}
		return -1;
	}
	
	//만약 배열에서 특정 객체를 제거하고 크기도 -1할려면
	//어떤 절차를 거쳐야 할까?
	//1. 해당 배열에 그 객체가 존재하는지 체크한다.
	//	존재하지 않을 경우에 그냥 배열을 다시 그대로 보내준다
	//2. 만약 존재 할 시는 2개의 배열을 만들어서 
	//	0~그번호까지 앞부분 복사
	//	그번호+1~끝까지 뒷부분 복사
	// 	그러고 나서 2개의 배열을 하나로 합쳐주면?
	//	그 번호가 없어진(=크기가 하나 줄은) 배열을 만들어 줄 수 있다.
	//
	//2. 만약 존재 할 시에는 기존 배열을 temp에 복사 ->
	// 	 기존 배열을 크기를 하나 작게 새로 만든다
	//	 템프의 내용을 복사하되 indexOf가 같을 시엔 복사하지 않는다.
	
	 public static StudentVO[] remove(StudentVO[] arr, StudentVO s){
		 //먼저 s가 arr에 존재하는지 확인
		 
		 if(indexOf(arr,s) !=-1){
			int index = indexOf(arr,s);
			StudentVO[] temp = new StudentVO[arr.length];
			for(int i=0; i<arr.length;i++){
				temp[i] = arr[i];
			}
			arr = new StudentVO[temp.length-1];
			for(int i=0;i<temp.length;i++){
				if(i<index){
					arr[i] = temp[i];
				}else if(i<index){
					arr[i-1] = temp[i];
				}
			}
		 }
		 
		 return arr;
	 }
	
}
