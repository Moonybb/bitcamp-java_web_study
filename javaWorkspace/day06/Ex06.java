class Ex06{

	public static void main(String[] args){
		func01("문자열");
		


	}

	public static void func01(){
		System.out.println("func01()...run...");
	}

	public static void func01(int a){
		System.out.println(a+ "param func01()...run...");

	}	
	public static void func01(String msg){
		System.out.println(">>>"+msg);
	}


	
}