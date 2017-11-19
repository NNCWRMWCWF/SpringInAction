package com.frolov.inaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.frolov.inaction.SqtPeppers;
@Configuration
@PropertySource(("classpath:./app.properties"))
public class CDPlayerConfig {
	
	@Autowired
	Environment env;

	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer();
	}
	
	@Bean
	public LeftDisc leftDisc() {
		return new LeftDisc();
	}
	
	@Bean
	@Qualifier("right")
	public RightDisc rightDisc() {
		return new RightDisc();
	}
	
//	@Bean
//	public CompactDisc blankDisc() {
//		List<String> list = Arrays.asList("OneTrack", "TwoTrack", "ThreeTrack");
//		return new BlankDisc(null, null);
//	}
}
