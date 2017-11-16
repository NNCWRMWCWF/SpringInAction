package com.frolov.inaction3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.frolov.inaction.MainConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		VideoBean vBean = context.getBean(VideoBean.class);
		System.out.println(vBean.mBean.hashCode());
	}
}
