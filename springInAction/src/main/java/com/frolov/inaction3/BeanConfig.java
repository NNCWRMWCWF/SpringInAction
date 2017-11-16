package com.frolov.inaction3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	@Creamy
	@Conditional(MusicBeanCondition.class)
	public MusicBean musicBean() {
		System.out.println("Creamy");
		return new MusicBean();
	}
	
	@Bean
	@Cold
	public MusicBean musicBean2() {
		System.out.println("Cold");
		return new MusicBean();
	}
	
	@Bean
	public VideoBean videoBean() {
		return new VideoBean();
	}
}
