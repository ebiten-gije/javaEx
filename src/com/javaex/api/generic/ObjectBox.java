package com.javaex.api.generic;

//	모든 객체를 담을 수 있는 박스 클래스
public class ObjectBox {

	Object content;
	
	public Object getContent() {
		return content;
	}
	
	public void setContent(Object content) {
		this.content = content;
	}
}
