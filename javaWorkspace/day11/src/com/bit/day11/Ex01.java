package com.bit.day11;

public class Ex01 {
    
    
    
    public static void main(String[] args) {
        //래퍼클래스(박싱&언박싱)- 
        //래핑, 오토래핑, 언래핑;
        //기본자료형에 해당하는 클래스
        //int -> Integer
        
        int su1;
        su1=100;
        Integer su2;
        su2=new Integer(10000);
        Integer su3=new Integer("2000");// 문자열을 숫자열로 바꿀수 있는 객체생성
        //auto boxing
        Integer su4=1234;


        System.out.println(su2+su3);
        // unboxing을 통해서 int 타입으로
        // 이후 연산 수행 
        // 따라서 결과는 int 타입
        System.out.println("int min val "+Integer.MIN_VALUE);
        System.out.println("int max val "+Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        Integer su5 = new Integer(128);
        byte by=su5.byteValue(); // Integer 객체 참조변수 su5의 값 기본자료형 byte의 by에 반환. 
        short soh = su5.shortValue();
        int su6 = su5.intValue();

        System.out.println(su5.byteValue());
        System.out.println(su5.shortValue());
        System.out.println(su5.intValue());

        Integer su7= new Integer(100);
        Integer su8 = new Integer(100);
        System.out.println(su7==su8);//래퍼런스 비교
        System.out.println(su7.equals(su8));//벨류 비교
        System.out.println(su7==100);//su7의 언박싱

        String msg="1234";
        Integer su9 = Integer.valueOf(msg);
        int su99=su9;//일을 2번하는것. su9를 언박싱하여 int su99에 벨류값으로 리턴
        //int su99 = Integer.valueOf(msg);
        System.out.println(su9+1);
        int su10=Integer.parseInt(msg);//처음부터 리턴값이 int, int값으로 리턴.
        System.out.println(su10+1);

        int su11=Integer.max(12,9);
        int su12=Integer.min(12,9);
        System.out.println(su11);
        System.out.println(su12);
        int su13=1;
        int su14=Integer.reverse(su13);
        System.out.println(su13+"의 보수:"+su14);

        int su15=16;
        System.out.println("2진수:"+Integer.toBinaryString(su15));
        System.out.println("십진수:"+su15);
        System.out.println("8진수:"+Integer.toOctalString(su15));
        System.out.println("16진수:"+Integer.toHexString(su15));
    
        int su16=14;
        int su17=11;
        Integer su19=11;
        int su18=Integer.compare(su16, su17);//su16의 기준에서 1,0,-1으로 16이 크다,같다,적다를 표시
        int su20=su19.compareTo(su17);//많이 사용됨.
        System.out.println(su18);
    
    }
}