package com.haeun.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements InitializingBean {
	private String adminId;		// 관리자 Id
	private String adminPw;		// 관리자 Pw
	
//	private Environment env;	//환경 변수 정의(설정)
	
//	@Override
//	public void setEnvironment(Environment environment) {	// EnvironmentAware 상속
//		// TODO Auto-generated method stub
//		setEnv(environment);
//	}
	
	
	@Override
	//초기화 된 후에 바로 (자동)실행되는 메소드
	public void afterPropertiesSet() throws Exception {
//		setAdminId(env.getProperty("adminId"));
//		setAdminPw(env.getProperty("adminPw"));
		
//		setAdminId("adminId");
//		setAdminPw("adminPw");
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

