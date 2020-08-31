class Ex03{



		
	
	public static void func01(){
		int a=1234;	
		System.out.println("a="+a);


	}

	
	
	public static void func02(){
		System.out.println("01기능을 실행합니다.");	
	}
	public static void func03(int a){
	
		System.out.println("전달받은 데이터:" +a);
	}
	public static void func04(int a,int b){
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);

	
	}
	
	
	public static void main(String[] aaa){
		int a=1111;
		System.out.println("프로그램 시작"+a);
		func04(2,3);
		
		System.out.println("프로그램 종료"+a);

	}



}