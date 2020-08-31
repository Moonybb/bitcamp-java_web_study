package com.bit.day14;
import java.util.*;

public class Ex15 {

	public static void main(String[] args) {
		int[] arr1={1,3,5,7};
		
		System.out.println(arr1);
		System.out.println(java.util.Arrays.toString(arr1));
		
//		int[] arr2=new int[arr1.length];
//		for(int i=0;i<arr1.length;i++){
//			arr2[i]=arr1[i];
//		}
		int[] arr2=new int[2];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr1[i+1];
		}
		
		
		
//		int[] arr3=new int[arr1.length];
//		System.arraycopy(arr1, 0, arr3, 0, arr1.length); // arr1의 0번 배열부터 arr3 0번부터 arr1.length 까지 깊은복사.
		int[] arr3=new int[2];
		System.arraycopy(arr1, 1, arr3, 0, 2); // arr1의 0번 배열부터 arr3 0번부터 arr1.length 까지 깊은복사.
		System.out.println(java.util.Arrays.toString(arr3));			
		
		
		int[] arr4=java.util.Arrays.copyOfRange(arr1, 1, 3);// arr1의 1~3까지
		
		System.out.println(java.util.Arrays.toString(arr4));
		
		int[] rans={41,2,23,10,11,28};
		java.util.Arrays.sort(rans);//정렬
		System.out.println(java.util.Arrays.toString(rans)); // 배열 간단하게 출력해보는것.
		
		System.out.println(java.util.Arrays.binarySearch(rans, 10)); //sort 이후 사용가능.
		
	}

}
