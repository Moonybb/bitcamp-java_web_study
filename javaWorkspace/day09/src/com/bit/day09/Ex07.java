package com.bit.day09;

public class Ex07 {
    public static void main(String[] args){

    // 1~ 6까지 랜덤한 수로 배열 만들기
    // 중복 없음
    //1 2 3 4 5 6 
        int[] su=new int[6];
        int temp=0;
        for(int i=0;i<su.length;i++){//su[0]~ su[5]; 랜덤 숫자 1~6까지 넣어준다.
            su[i] = (int)(Math.random()*6)+1;//i가 증가할때마다 랜덤값 추출해 넣어준다.
            for(int j=0;j<i;j++){//j는 0이고, i가 증가했을때 만큼 반복해줌.
                if(su[i]==su[j]){//su[0]==su[0]의 값이 같으면 i를 1감소 시키고 조건문 나간다.
                    i--;
                    break;
                }       
            }
        }
        for(int i=0;i<su.length;i++){
            System.out.println(su[i]);
        }

    }//main end

}//class end