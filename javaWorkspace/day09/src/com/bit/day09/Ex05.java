package com.bit.day09;

public class Ex05 {
    
    public static void main(String[] args){
        int a1=1;
        int a2=3;
        int a3=5;
        int a4=7;
        int a5=9;
        
        //int[] b= new int[5]{1,3,5,7,9};
        int[] b= new int[]{1,3,5,7,9};//추천
        
        int[] c={10,11,12,14,16};

        //정적할당(한번 지정된 개수는 변경 불가)
        //자료형[] 배열명=new 자료형[갯수];
        //배열명[인덱스번호]
        //동일자료형이어야함,.
        //인덱스번호
        //0부터
        //연속됨.

        int[] a=new int[5];//추천
        a[0]=2;
        a[1]=4;
        a[2]=6;
        a[3]=8;
        a[4]=10;

        for(int i=0;i<5;i++){
            System.out.println(c[i]);
        }
    }

    
}