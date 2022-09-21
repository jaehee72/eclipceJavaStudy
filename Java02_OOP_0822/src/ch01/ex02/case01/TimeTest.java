package ch01.ex02.case01;

public class TimeTest {
	public static void main(String[] args) {
		
		Time time = new Time();
		time.hour = 11;
		time.minute = 43;
		time.second = 40;
		
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		// toString 메소드 사용
		System.out.println(time.toString());
		System.out.println(time);  // toString() 생략 가능
	}
}
