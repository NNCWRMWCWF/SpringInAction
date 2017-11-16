package com.frolov.inaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CDPlayer {

	CompactDisc disc;
	@Autowired
	@Qualifier("right")
	public void setDisc(CompactDisc disc) {		
		this.disc = disc;
	}
	public void play() {
		disc.play();
	}
}
