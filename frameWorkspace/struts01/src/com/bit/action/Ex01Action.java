  
package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action {
	
	@Override
	public String execute() throws Exception {
		System.out.println("스트럿츠로 화면을 뿌리겠습니다.");
		return "success";
	}

}