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
class Ex09{
	
	public static int func(int su1, int su2, int su3){
		int result=0;
		
		if(su3==1){
			result = su1+su2;
		}else if(su3==2){
			result = su1-su2;
		}else if(su3==3){
			result = su1*su2;
		}else if(su3==4){
			result = su1/su2;
	
		
			}
		return result;
	}	
	public static char func2(int su3){
		char result='E';
		
		if(su3==1){
			result='+';
		}else if(su3==2){
			result='-';			
		}else if(su3==3){
			result='×';			
		}else if(su3==4){
			result='÷';			
			}
		return result;
	}	
	

	public static int inputPrint(String msg){
		
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int su=sc.nextInt();
		return su;
		
	}
	
	
	public static void main(String[] args){
		

		
		System.out.println("\n\n계산기(ver 0.0.1)");
		System.out.println("-----------------\n\n");
		int su1=0;
		int su2=0;
		int su3=-1;
		do{
		
		su1=inputPrint("1번째 >>");
		su2=inputPrint("2번째 >>");
		su3=inputPrint("1. + 2. - 3. × 4. ÷ >>");
		
		resultPrint(su1,su2,su3);

		
		}while(inputPrint("1.계속 0.종료>>")!=0);
		 	System.out.println("Thank you");
	}
	public static void resultPrint(int su1,int su2,int su3){
		if(su3==1||su3==2||su3==3||(su3==4&&su1%su2==0)){
			System.out.println("결과 :     " +su1+func2(su3)+su2+"=" +func(su1,su2,su3));
		}else{
			System.out.println("결과 :     " +su1+func2(su3)+su2+"=" +(su1*1.0/su2));
		
		}
		
	}


}