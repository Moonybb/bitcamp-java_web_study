package com.bit.day10;

public class Ex06 {
    
    
    
    public static void main(String[] args) {
        int su=1234;
        int[] arr1={1,3,5,7,9};//객체이기 때문에 참조변수 arr1 
        int[] arr2={1,3,5,7,9};
        int[] arr3=new int[]{1,3,5,7,9};
        int[] arr4=arr3;//배열의 옅은 복사
        arr4[2]=10; // arr3 참조변수 배열의 값들이 arr4에 저장되어 복사됨. arr4의 인자를 바꾸면 같이 바뀜
        System.out.println(arr1.toString());//arr1 참조변수 주소값 출력가능
        System.out.println(arr1==arr2);
        System.out.println(arr3==arr4);
        System.out.println(arr4.toString()+" "+arr3.toString());
        func01(arr3);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);

        }
 
 
    }



    public static void func01(int[] su){
        //int[] su==arr3; func01()의 인자 int[] su에다가 arr3을 받아버려서 옅은 복사가 일어나게됨
        su[3]=1234;// arr3의 [3]에 1234가 넣어지게됨.
    }
}