package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex11Action implements Action {

	private String id;
	private int num;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("num::"+num+", id::"+id);
		return Action.SUCCESS;
	}

}
