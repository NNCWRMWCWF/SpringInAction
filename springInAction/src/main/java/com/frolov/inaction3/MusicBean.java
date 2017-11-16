package com.frolov.inaction3;

import org.springframework.stereotype.Service;

@Service
public class MusicBean {
	public MusicBean() {
		System.out.println("MusicBean was created!"); 
	}
	@Override
	public int hashCode() {
		return 2;
	}
}
