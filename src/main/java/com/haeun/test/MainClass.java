package com.haeun.test;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
//		ConfigurableEnvironment env = ctx.getEnvironment();	//ȯ�� ����
//		MutablePropertySources propertySources = env.getPropertySources();
//		
//		//����
//		try {
//			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		//gctx�� �� ��ȯ
//		GenericXmlApplicationContext gctx = (GenericXmlApplicationContext)ctx;
//		gctx.load("applicationCTX.xml");
		//Container ���� �ҷ�����(�����̳� ����)
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		//�����̳ʷκ��� �ʿ��� ��ü ��û
		AdminConnection adminConnection = ctx.getBean("adminconnection",AdminConnection.class);
		String admin_id = adminConnection.getAdminId();
		String admin_pw = adminConnection.getAdminPw();
		
		System.out.println(admin_id);
		System.out.println(admin_pw);
		
		
		ctx.close();
	}

}
