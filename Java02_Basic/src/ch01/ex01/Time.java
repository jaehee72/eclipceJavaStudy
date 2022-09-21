package ch01.ex01;

public class Time {

	int hour;
	int minute;
	int second;
	
	
	//메소드
	@Override
	public String toString() { // object 클래스 자동 상속되어잇음
		return String.format("%d시 %d분 %d초", hour, minute, second);
	}

}
