package com.bit.project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;



public class UpDown {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int su = random.nextInt(50)+1;
		Set<Integer> list = null;
		list = new HashSet<Integer>();
		Iterator<Integer> iter = null;
		Integer[] su1 = null;
		su1 = new Integer[list.size()];
		int cnt = 0;
		while(true){
			System.out.println("수를 입력하시오");
			int input = sc.nextInt();
			int a = input;
			if(input>50){
				System.out.println("다시 입력하시오");
				continue;
			}else if(input<su){
				System.out.println("up");
				list.add(input);
				iter = list.iterator();
				while(iter.hasNext()){
					su1[cnt]= iter.next();
					cnt++;
				}
				for(int i=0;i<su1.length;i++){
					if(su1[i]==input){
						System.out.println("같은 값을 입력 하셨습니다. 다시 입력하세요");
						break;
					}else{continue;}
				}
			}else if(input>su){
				System.out.println("down");
				list.add(input);
				
				iter = list.iterator();
				while(iter.hasNext()){
					su1[cnt]= iter.next();
					cnt++;
				}
				for(int i=0;i<su1.length;i++){
					if(su1[i]==input){
						System.out.println("같은 값을 입력 하셨습니다. 다시 입력하세요");
						break;
					}else{continue;}
				}
			}else if(su==input){
				list.add(input);
				
				System.out.println("정답");
				break;
			}
			
		}
		
		
	}
}
