package com.sdl.demo_test;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sdl.demo_class.User;
public class TestSpring5 {
	
	@Test
	public void testAdd() {
		//������ȼ�BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
	    User user = context.getBean("user",User.class);
	    System.out.println("aaa");
		System.out.println(user);
		user.add();
		//
	}
}