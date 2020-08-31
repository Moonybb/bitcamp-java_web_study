package com.bit.day11;
class Ball{
    private int num;     // 번호 수정 불가
    boolean check;       // 번호 
    String color;
    Ball(int num){       // 번호부여
        this.num=num;
        check = false;
        if(num<11){
            color="노란색";
        }else if(num<21){
            color="파란색";
        }else if(num<31){
            color="빨간색";
        }else if(num<41){
            color="검정색";
        }else {
            color="초록색";
        }
    }
    void marking(){check = true;}       //번호 마킹
    boolean checking(){return check;}   // 번호 체크 
    void printNum(){System.out.println(color+" 공 "+num);}  //번호 확인
    int showNum(){return num;}
}


public class Ex07 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis(); 
    	Ball[] box=new Ball[45];     // 번호담긴 박스 생성 및 번호 입력
         for(int i=0; i<box.length; i++){    //생성된 박스에 번호 입력
            box[i] = new Ball(1+i);
         }
         
        // 예시
        // 박스 흔들어 섞어주고
        // Ball temp=null;
        // for(int i=0; i<99999; i++){
        //     temp=box[0];
        //     int ran= 1+(int)(Math.random()*44);   //1~45까지의 임의 랜덤한 숫자 생성
        //     box[0] = box[ran];
        //     box[ran] = temp;
        // }

        int[] note=new int[6];      //노트 저장
        int cnt=0;   
        while(true){
            int ran =(int)(Math.random()*45);                //0~44      
            Ball ball = box[ran];       //box는 배열 - 랜덤으로 숫자 출력
            if(ball.checking()){
                //중복
            }else{
                //중복아님
                ball.printNum();     //번호확인
                note[cnt] = ball.showNum();  //노트 마킹
                ball.marking();    //마킹
                cnt++;
                if(cnt==6){break;}
            }
        }
        //순서 정리
        int tmp=0;
        for(int i=0; i<note.length-1; i++){
            for(int j=i+1; j<note.length; j++){
                if(note[i]>note[j]){
                    tmp= note[i];
                    note[i]= note[j];
                    note[j]= tmp;
                }
            }
        }


        //노트를 보고 출력
        System.out.print("이번주 담첨번호는 ");
        for(int i=0; i<note.length; i++){
            System.out.print(note[i]+" ");
        }
        System.out.println("입니다. \n축하드립니다");
        long end = System.currentTimeMillis();
        
        System.out.println("main 수행시간 : " + (end-begin)+"ms");
    }
}