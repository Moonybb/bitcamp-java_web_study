/*
System.out.print("1.가위 2.바위 3.보 0.종료>>");
if(su==1){
	
		System.out.println("당신 : 가위 ");
		
		}else if(su==2){System.out.println("당신 : 바위");
		
		}else if(su==3){System.out.println("당신 : 보");
		
		}else if(su!=1&&su!=2&&su!=3){System.out.println("종료");}
		
	
	




*/
/*
1.가위 2.바위 3.보 0.종료>>3

당신 : 보 , 컴퓨터 : 보
비겼습니다.

1.가위 2.바위 3.보 0.종료>>3

당신 : 보 , 컴퓨터 : 보
비겼습니다.

1.가위 2.바위 3.보 0.종료>>3

당신 : 보 , 컴퓨터 : 보

전적 - 3무
게임을 종료합니다.
*/


import java.util.Scanner;
class Ex35{
	
	
	
	public static int random(){
		int rand=0;
		rand = (int)(Math.random()*3);
		return rand;
	}
	
	public static void if1(){
		int a=0,b=0,c=0;
		boolean A=true;
		while(A){
		int input = 0;
		int com=random();
		System.out.println("가위 바위 보 게임");
		System.out.println("-------------------------------\n\n");
		
		
		System.out.print("1.가위 , 2.바위 , 3.보 , 0.종료>>>");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt()-1;	
		
		System.out.println(com);
		String my="";
		String pc="";
		if(input==0){
			my="가위";
			}
		
		if(input==1){
			my="바위";
		}else	if(input==2){
			my="보";	
		}
		if(com==0){
			pc="가위";
		}else if(com==1){
			pc="바위";
		}else if(com==2){
			pc="보";
		}
		
		
		if(input==-1){
			A=false;
		}else{
		
		
		System.out.println("당신 :"+ my + " 컴퓨터 :" + pc);
		if(input==com){
			System.out.println("비겼습니다.\n");
				b++;
			}else if((input==0&&com==2)||(input==1&&com==0)||(input==2&&com==1)){
				System.out.println("당신이 이겼습니다.\n");
				a++;
			}else {
				System.out.println("컴퓨터가 이겼습니다.\n");
				c++;
			}	
		
		
	


	}
	
	}
		System.out.println(a+"승"+b+"무"+c+"패");
	
	}
	public static void main(String[] args){
		
	
	
		if1();
		
	}//main end
}//class end