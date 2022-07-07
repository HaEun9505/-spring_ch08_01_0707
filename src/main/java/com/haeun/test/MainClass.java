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
//		ConfigurableEnvironment env = ctx.getEnvironment();	//환경 변경
//		MutablePropertySources propertySources = env.getPropertySources();
//		
//		//셋팅
//		try {
//			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		//gctx로 형 변환
//		GenericXmlApplicationContext gctx = (GenericXmlApplicationContext)ctx;
//		gctx.load("applicationCTX.xml");
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		AdminConnection adminConnection = ctx.getBean("adminconnection",AdminConnection.class);
		String admin_id = adminConnection.getAdminId();
		String admin_pw = adminConnection.getAdminPw();
		
		System.out.println(admin_id);
		System.out.println(admin_pw);
		
		
		ctx.close();
	}

}
