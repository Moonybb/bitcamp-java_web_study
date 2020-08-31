package com.bit.day09;

public class Ex06 {
    public static void main(String[] args) {
        //다음의 배열 값을 +2씩하고 출력하라
        int[] su1={1,4,6,7,9};

        for(int i=0;i<su1.length;i++){
            System.out.println((su1[i]+2));

        }
        System.out.println("----------------------");
       // 0~10중 홀수를 담는 배열을 생성하고 출력하시오.
        
        int cnt=0;
        for(int i=0;i<11;i++){
            if(i%2==1){cnt++;

        }
    }// 0~10까지의 홀수갯수 뽑기
        int[] su3=new int[cnt]; // cnt 값 배열저장
        System.out.println("cnt="+cnt);
        int idx=0;
        for(int i=0;i<11;i++){
            if(i%2!=0){
                su3[idx++]=i; //idx 값을 1씩 증가시킴, 배열 0~ i%2!=0의 값이 아닐때까지
                
            }
        }
        for(int i=0;i<su3.length;i++){
            System.out.println(su3[i]);
        }
        System.out.println("----------------------");
        //알파벳 대문자를 담는 배열을 만들고 출력하시오.
        char[] ch=new char['Z'-'A'+1];
        for(int i=0;i<ch.length;i++){
            ch[i]=(char)('A'+i);

        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
            System.out.print(' ');
        }
        
        System.out.println();
        System.out.println("-------------------------");
        
        int[] su4=new int['Z'-'A'+1];
        int a='A';
        for(int i=0;i<su4.length;i++){
            
            
            su4[i] = a;
            System.out.print((char)(su4[i]));
            System.out.print(' ');
            a++;
           
        }

        System.out.println();
        System.out.println("----------------------");
        //다음을 오름차순 정렬 출력 하시오.
        int[] su2={7,2,4,8,3}; //7,2,4,8,3
        
        int temp=0;
        for(int i=0;i<su2.length-1;i++){
            for(int j=i+1;j<su2.length;j++){
                if(su2[i]>su2[j]){
                    temp=su2[i];
                    su2[i]=su2[j];
                    su2[j]=temp;
                }
            }
        }
        for(int i=0;i<su2.length;i++){
            System.out.print(su2[i]+',');

        }
    }
    }
