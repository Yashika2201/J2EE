package com.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import com.demo.model.HelloWorld;

public class TestHello {

	public static void main(String[] args) {
//		HelloWorld hw = new HelloWorld();
//		hw.sayHello();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		HelloWorld h = (HelloWorld) ctx.getBean("hw");
		h.sayHello();

	}

}
