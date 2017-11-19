package com.frolov.inaction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableAspectJAutoProxy
public class PepConfig {
	
	@Bean
	@Primary
	public CompactDisc sqtPeppers() {
		BlankDisc cd = new BlankDisc("ABBA" , "NYC");
		List<String> tracks = new ArrayList<String>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
		tracks.add("With a Little Help from My Friends");
		tracks.add("Lucy in the Sky with Diamonds");
		tracks.add("Getting Better");
		tracks.add("Fixing a Hole");
		tracks.add("Summer");
		tracks.add("Autumn");
		tracks.add("Spring");
		tracks.add("Winter");
		cd.getTracks().addAll(tracks);
		return cd;
	}
	
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
	
	

}
