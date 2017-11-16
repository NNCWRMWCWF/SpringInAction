package com.frolov.inaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


public class Main {
	
	
	public static void main(String[] arg) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		BlankDisc sp = context.getBean(BlankDisc.class);
		System.out.println(sp.getArtist());
	}
}
