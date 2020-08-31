/*
계산기(ver 0.0.1)
-----------------
1번째 숫자>>2
2번째 숫자>>3
1. + 2. - 3. × 4. ÷ >>1 
결과 : 2+3 = 5
1.계속 0.종료1





*/








import java.util.Scanner;
class Ex08{

	
	
	public static void loop(){
		double first=0,second=0;
		int fao=0;
		double result=0;
		int finish=0;
		boolean A = true;
		String icon="";
		while(A){
		System.out.println("계산기(ver 0.0.1)");
		System.out.println("-------------------");
		Scanner sc = new Scanner(System.in);	
		
		
		System.out.print("1번째 숫자>>");
		first = sc.nextDouble();
		
		System.out.print("2번째 숫자>>");
		second = sc.nextDouble();
		
		System.out.print("1. + 2. - 3. × 4. ÷ >>");
		fao=sc.nextInt()-1;
		
		if(fao==0){
			icon="+";
			result=first+second;
		}else if(fao==1){
			icon="-";
			result=first-second;
		}else if(fao==2){
			icon="×";
			result=first*second;
		}else if(fao==3){
			icon="÷";
			
			result=(int)((first/second*100))/100.0;
		}
		
		
		System.out.println("결과 : " + (int)first+" "+icon+" "+(int)second +" = "+ result );
		System.out.print("1.계속 0.종료>>");
		finish=sc.nextInt();
		
		if(finish==0){
			A = false;
		}
		
		}
	
	}
	
	
	




	public static void main(String[] args){
		
		
		loop();
	
	
	}//main end


}//class end