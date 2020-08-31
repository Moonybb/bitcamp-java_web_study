package com.bit.day10;


class Lotto{
    private int[] ball=new int[45];
    private int temp=0;

    void start(){
        System.out.println();
        System.out.println("땅 보러 갈 번호");
    }

    void testprintOut(){//test 출력
        
        for(int i=0;i<ball.length;i++){
            ball[i] = i+1;
        }
        for(int i=0;i<ball.length;i++){
            System.out.println(ball[i]);
        }
    }// printOut end

    void ballCreate(){
        for(int i=0;i<ball.length;i++){
            ball[i] = i+1;
        }
    }

    void random(){//1~45까지 ball 뽑기
        for(int i=0;i<10000;i++){
            temp=ball[0];
            int ran=(int)(Math.random()*44)+1;
            ball[0]=ball[ran];
            ball[ran]=temp;
        }
        
        
    }//rand end

    void sort(){
        for(int i=0;i<5;i++){
            for(int j=i+1;j<6;j++){
                if(ball[i]>ball[j]){
                    temp=ball[i];
                    ball[i]=ball[j];
                    ball[j]=temp;
                }
            }
        }   
    }

    void lottoGame(){
        start();
        ballCreate();
        random();
        sort();
    }
    

    void lottoPrint(){

        for(int i=0;i<6;i++){
            System.out.print(ball[i]);
            System.out.print(' ');
        }
        System.out.print("보너스번호 : "+ball[6]+"\n");
    }
    






}//class end


    

public class Ex13 {
    



    
    
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        int input;
        boolean boo=true;
        while(boo){
            System.out.println("---------------------------------");
            System.out.print("땅보러 가시겠습니까? 1. Yes 2.No   ");

            input = sc.nextInt();
            if(input==1){
            System.out.println("몇 게임 하시겠습니까?(최대 5게임)");
            int game = sc.nextInt();
            for(int i=0;i<game;i++){

            
            
                
                Lotto result = new Lotto();
        
                result.lottoGame();

                result.lottoPrint();

                }
                }else {

                    System.out.println("네 저희도 안합니다.");
                    boo=false;
                    break;
                }//else
        
            

        }//while end    
    
    }//main
        
    
}