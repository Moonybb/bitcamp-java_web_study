import java.util.Scanner;
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
Scanner sc= new Scanner(System.in);
		int su=0;
		su=sc.nextInt();
System.out.print("1.가위 2.바위 3.보 0.종료>>");
if(su==1){
	
		System.out.println("당신 : 가위 ");
		
		}else if(su==2){System.out.println("당신 : 바위");
		
		}else if(su==3){System.out.println("당신 : 보");
		
		}else if(su!=1&&su!=2&&su!=3){System.out.println("종료");}
		
	
	




*/



class Ex34{
	public static void main(String[] args){
		int a=0,b=0,c=0;
		int j=1;
		while(j<6){
		System.out.print("1.가위 2.바위 3.보 0.종료>>");
		String result="전적 : "+a+"승 "+b+"무 "+c+"패 ";
		String win = "이겼습니다."+"\n";
		String lose = "졌습니다."+"\n";
		String draw = "비겼습니다."+"\n";
		String A="---------------------------------";
		int random= (int)(Math.random()*10+1);
		while(random>3){
			random=(int)(Math.random()*10+1);
		}
		
		Scanner sc= new Scanner(System.in);
		int su=0;
		su=sc.nextInt();
		
			
		
			
			
			if(su==1&&random==1){
				System.out.print("당신 : 가위 "+"컴퓨터 : 가위"+"\n");
				System.out.print("비겼습니다."+"\n");
				b++;
				System.out.println(result);
				System.out.println(A);
			}else if(su==1&&random==2){
				System.out.print("당신 : 가위 "+"컴퓨터 : 바위"+"\n");
				System.out.print(lose);
				c++;
				System.out.println(result);
				System.out.println(A);
			}else if(su==1&&random==3){
				System.out.print("당신 : 가위 "+"컴퓨터 : 보"+"\n");
				System.out.print(win);
				a++;
				System.out.println(result);
				System.out.println(A);
			}else if(su==2&&random==1){
				System.out.print("당신 : 바위 "+"컴퓨터 : 가위"+"\n");
				System.out.print(win);
				a++;
				System.out.println(result);
				System.out.println(A);
			}else if(su==2&&random==2){
				System.out.print("당신 : 바위 "+"컴퓨터 : 바위"+"\n");
				System.out.print(draw);
				b++;
				System.out.println(result);
				System.out.println(A);
			}else if(su==2&&random==3){
				System.out.print("당신 : 바위 "+"컴퓨터 : 보"+"\n");
				System.out.print(lose);
				c++;
				System.out.println(result);
				System.out.println(A);
			}else if(su==3&&random==1){
				System.out.print("당신 : 보 "+"컴퓨터 : 가위"+"\n");
				System.out.print(lose);
				c++;
				System.out.println(result);
				System.out.println(A);
			}else if(su==3&&random==2){
				System.out.print("당신 : 보 "+"컴퓨터 : 바위"+"\n");
				System.out.print(lose);
				c++;
				System.out.println(result);
				System.out.println(A);
			}else if(su==3&&random==3){
				System.out.print("당신 : 보 "+"컴퓨터 : 보"+"\n");
				System.out.println(draw);
				b++;
				System.out.print(result);
				System.out.println(A);
			}else if(su!=1&&su!=2&&su!=3){System.out.println("종료"); break;}
			
			j++;
			
				
			}System.out.println("종료되었습니다.");
			 
		
		
		
		 
		
	
	
		






	}








}