package com.haeun.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements InitializingBean {
	private String adminId;		// ������ Id
	private String adminPw;		// ������ Pw
	
//	private Environment env;	//ȯ�� ���� ����(����)
	
//	@Override
//	public void setEnvironment(Environment environment) {	// EnvironmentAware ���
//		// TODO Auto-generated method stub
//		setEnv(environment);
//	}
	
	
	@Override
	//�ʱ�ȭ �� �Ŀ� �ٷ� (�ڵ�)����Ǵ� �޼ҵ�
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

