package com.frolov.inaction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class BlankDisc implements CompactDisc{
	private String artist;
	private String album;
	private List<String> tracks;
	
	public BlankDisc(String album, String artist) {
			this.album = album;
			this.artist = artist;
			tracks = new ArrayList<>();
			}

	public String getArtist() {
	return artist;
}

public void setArtist(String artist) {
	this.artist = artist;
}

public String getAlbum() {
	return album;
}

public void setAlbum(String album) {
	this.album = album;
}

public List<String> getTracks() {
	return tracks;
}

public void setTracks(List<String> tracks) {
	this.tracks = tracks;
}

	public void playTrack(int track) {
		System.out.println(artist + " " + album + " " + tracks.get(track));
		//tracks.stream().forEach(System.out::println);
	}

}

