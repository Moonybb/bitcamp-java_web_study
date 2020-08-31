package com.bit.day10;

public class Ex09 {
    
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2};
        int[] arr2=new int[]{3,4,5};
        int[] arr3=new int[]{5,6,6,7};
        int[][] arr4= new int[][]{arr1,arr2,arr3};  //int[3] 같은 종류 배열의 3ea, 길이 2인 배열 arr4 참조변수 정의
        System.out.println(arr4.length+"\n");

        //int[][] arr4=new int[][]{null,null,null};
        //int[][] arr4=new int[][]{arr1,arr2,arr3};        
        // arr4[0][0]=1;
        // arr4[0][1]=2;
        // arr4[1][0]=3;
        // arr4[1][1]=4;
        // arr4[2][0]=5;
        // arr4[2][1]=6;
        // System.out.println(arr4[0][0]);
        // System.out.println(arr4[1]);
        // System.out.println(arr4[2]);
        for(int i=0;i<arr4.length;i++){
            for(int j=0; j<arr4[i].length;j++){
                System.out.print(arr4[i][j]+" ");

            }
            System.out.println();
        }
        

    }
}