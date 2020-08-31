		//Q1. 1~50까지의 합을 구하시오.
		//Q2. 1~100까지의 짝수들의 합을 구하시오.
		//Q3. 1+3+5+7+9=25를 출력하시오.
		//Q4. 1~50까지 3의 배수를 출력하시오.
		//Q5. 2의 1승, 2의2승 ,2의3승,2의4승,2의5승을 출력하시오.
class Ex30{
	public static void main(String[] args){
	//Q1
	int sum1=0;
	int a=1;
	while(a<51){
		sum1=a+sum1;
		
		a++;
	}
	System.out.println(sum1);
	System.out.println("----------------------");
	//Q2
	int sum2=0;
	int b=0;
	while(b<101){	
		b++;
		if(b%2==0){
		sum2=b+sum2;
		}
	}
	System.out.println(sum2);
	System.out.println("----------------------");
	
	
	
	//Q3
	int sum3=0;
	int c=0;
	boolean first=false;
	while(c<10){
		if(c%2!=0){
			sum3+=c;
			if(c!=1){System.out.print('+');
			
		}
		System.out.print(c);
		}

	c++;
	
	
	
	}
	
	

	System.out.println("="+sum3);
	System.out.println("----------------------");	

	int sum30=0;
	int su4=1;
	
	while(su4<10){
		if(su4%2!=0){
			sum30=sum30+su4;
		
			if(su4!=1){
				System.out.print('+');
				
			}
		System.out.print(su4);
		}
	su4++;
	}
	System.out.println("="+sum30);
	System.out.println("----------------------");
	//Q4
	int sum4=0;
	int d=1;
	while(d<50){
		d++;
		if(d%3==0){
		System.out.print(d+" ");
		}
	}
	System.out.println();
	System.out.println("----------------------");
	
	
	
	
	//Q5
	int sum5=1;
	int e=1;
	while(e<6){
		sum5*=2;
		System.out.println("2의"+e+"승"+"="+sum5);
		
		
		e++;
	
	
	
	}
	


	}




}