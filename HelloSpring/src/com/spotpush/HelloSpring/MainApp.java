package com.spotpush.HelloSpring;

/*
 * Spring MVC Example
 * @author www.spotpush.com
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource") //resource leak: 'context' never closed
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
		obj.getMessage();
	}
}
