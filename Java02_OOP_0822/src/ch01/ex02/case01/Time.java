package ch01.ex02.case01;

public class Time {
	
	// 멤버 변수
	int hour;
	int minute;
	int second;
	
	// 메소드
	@Override
	public String toString() {  // Object 클래스는 자동상속돼 있음
		return String.format("%d시 %d분 %d초", hour, minute, second);
	}
}
