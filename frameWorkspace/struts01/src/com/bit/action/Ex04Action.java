package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex04Action implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("새로운 패키지에서 ex04action...");
		return Action.SUCCESS;
	}

}
