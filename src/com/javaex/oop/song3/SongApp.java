package com.javaex.oop.song3;
//	v1. 필드, getter/setter, 일반 메서드

public class SongApp extends Song {

	public static void main(String[] args) {
		//	생성자
		Song a = new Song();
		Song b = new Song();
		Song c = new Song();
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
		Song s2 = new Song("거짓말", "빅뱅", "Always", "G-dragon", 2077, 2);
		Song s3 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커 1집", "장범준", 2012, 4);
		
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
		
/*		a.showInfo();
		b.showInfo();
		c.showInfo();
*/
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		
	}

}
