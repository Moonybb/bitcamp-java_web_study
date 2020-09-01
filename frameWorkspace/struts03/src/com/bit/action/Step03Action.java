package com.bit.action;

import com.bit.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class Step03Action implements Action, ModelDriven<EmpVo> {
	EmpVo bean = new EmpVo();
	
	public EmpVo getBean() {
		return bean;
	}

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(bean);
		return Action.SUCCESS;
	}

	// 파라미터가 넘어오면 bean을 뿌려주고 그 안에 setter에 값을 주입시켜준다.
	@Override
	public EmpVo getModel() {
		return bean;
	}

}
