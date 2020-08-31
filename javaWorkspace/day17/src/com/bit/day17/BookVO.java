package com.bit.day17;

import java.util.ArrayList;

//도서관리 프로그램
//도서정보:
//	1.id
//	2.제목
//	3.저자
//	4.대여가격
//	5.현재상태(대여중 or no) -> 이게 없는 방법으로도 충분히 가능
// 인폴메이션에서 BookVO를 받아서, 인폴메이션 생성자를 통해서 생성자 파라미터값?



//프로그램기능
//	1.대여 리스트1에서 리스트2로 넘어감.
//	2.반납 리스트 2에서 리스트 1로 넘어감.
//	3.각종정보출력
//		1.	대여중인 책 출력	리스트1 출력
//		2.	대여가능한 책 출력	리스트2 출력
//		3. 	전체 책 목록 출력	리스트1+2출력
//	4. 생성자를 통해서 기본적으로 몇권의 책을 대여가능 목록에 넣는다.
public class BookVO {
	private int id;
	private String title;
	private String name;
	private int price;
	
	@Override
	public String toString() {
		return "id :" + id + ", 제목:" + title + ", 저자:" + name
				+ ", 가격:" + price + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean equals(Object o){
		
		if(o instanceof BookVO){
			BookVO b = (BookVO)o;
			if(id == b.id){
				return true;
			}
					
		}
		return false;
	}
	
	
	
	
}
