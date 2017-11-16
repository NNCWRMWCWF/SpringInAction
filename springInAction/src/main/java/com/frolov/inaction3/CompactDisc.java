package com.frolov.inaction3;

import org.springframework.stereotype.Service;

@Service
public class CompactDisc {
	public void playTrack(int track) {
		System.out.println("Playing " + track + " track");
	}

}
