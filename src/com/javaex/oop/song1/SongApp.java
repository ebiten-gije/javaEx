package com.javaex.oop.song1;

public class SongApp extends Song {

	public static void main(String[] args) {
		
		Song a = new Song();
		
		Song b = new Song();
		
		Song c = new Song();
		
		a.setAlbum("Real");
		a.setArtist("아이유");
		a.setComposer("이민수");
		a.setTitle("좋은날");
		a.setTrack(3);
		a.setYear(2010);
		
		b.setAlbum("Always");
		b.setArtist("빅뱅");
		b.setComposer("G-DRAGON");
		b.setTitle("거짓말");
		b.setTrack(2);
		b.setYear(2007);
		
		c.setAlbum("버스커버스커1집");
		c.setArtist("버스커버스커");
		c.setComposer("장범준");
		c.setTitle("벚꽃엔딩");
		c.setTrack(4);
		c.setYear(2012);
		
		a.showInfo();
		b.showInfo();
		c.showInfo();

	}

}
