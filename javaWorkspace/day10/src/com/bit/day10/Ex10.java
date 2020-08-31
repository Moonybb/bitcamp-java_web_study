package com.bit.day10;



public class Ex10 {
    

    
    public static void main(String[] args) {
        // 로또 번호 생성기
        // 1~45까지 숫자 6
        // 랜덤, 중복 불가
        // 출력, 오름차순 정렬 출력
        // 보너스번호


        //로또 번호 랜덤 6개 생성
        int[] lotto = new int[7];
        for(int i=0;i<lotto.length;i++){
            lotto[i] = (int)(Math.random()*45)+1;
            for(int j=0;j<i;j++){
                if(lotto[i]==lotto[j]){
                i--;
                break;
                }
            }
        }
        
        //오름차순 정렬
        int temp=0;
        for(int i=0;i<lotto.length;i++){
            for(int j=i+1;j<lotto.length;j++){
                if(lotto[i]>lotto[j]){
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }
        
        //로또번호 출력
        
        for(int i=0;i<lotto.length;i++){
            System.out.print(lotto[i]);
            System.out.print(' ');
            
                

        }
        
        int bonus=0;
        for(int i=0;i<lotto.length;i++){
            bonus = (int)(Math.random()*45)+1; // bonus 랜덤값 초기화;
            for(int j=0;j<lotto.length;j++){
                
                if(lotto[j]==bonus){
                    i--;
                    break;
                }
            }
            
            
        }
        System.out.print("보너스번호 "+bonus);
        System.out.println();
        //bonus 랜덤값 생성
       
        

        
    }//main
}//class