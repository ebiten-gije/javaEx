package com.javaex.api.objectclass.ex4;

import java.util.Arrays;

//	깊은 복제: 참조 필드의 경우, 새 객체로 만들어서 참조 필드 값을 변경

public class Scoreboard implements Cloneable {

	private int scores[];
	
	public Scoreboard(int[] scores) {
		super();
		this.scores = scores;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores = " + Arrays.toString(scores) + "]";
	}

	//	복제본 생성 메서드
	public Scoreboard getClone() {
		//	새로운 인스턴스를 저장할 변수 선언
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			//	예외 로그를 출력
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//	깊은 복제 위해서 내부 참조 데이터를 복제하여 새로운 참조로 변경
		
		//	먼저 얕은 복제를 시도
		Scoreboard clone = (Scoreboard)super.clone();
		//	내부 참조 객체를 복제 시도 (깊은 복제)
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;	//	만들어진 복제본을 반환
	}
}
