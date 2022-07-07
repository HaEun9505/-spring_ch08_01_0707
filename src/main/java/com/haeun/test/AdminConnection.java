package com.haeun.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements InitializingBean {
	private String adminId;
	private String adminPw;
	
	
	@Override
	//초기화 된 후에 바로 실행되는 메소드
	public void afterPropertiesSet() throws Exception {
		
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
}
