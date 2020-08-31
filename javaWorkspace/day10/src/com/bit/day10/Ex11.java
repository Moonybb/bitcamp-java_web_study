package com.bit.day10;

public class Ex11 {
    public static void main(String[] args) {
        
        int[] arr1=new int[45];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = i+1;
        }
        int temp=0;
        for(int i=0;i<10000;i++){
            temp=arr1[0];
            int ran=(int)(Math.random()*44)+1;
            arr1[0]=arr1[ran];
            arr1[ran]=temp;

        }
        temp=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<6;j++){
                if(arr1[i]>arr1[j]){
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }   


        for(int i=0;i<6;i++){
            System.out.println(arr1[i]);

        }
        System.out.println("보너스번호 :"+arr1[6]);

    }
    
}