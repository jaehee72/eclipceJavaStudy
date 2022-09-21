package ch02.quiz.quiz_sub2.step02;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		s.startNano();
		
		for(long i =0; i<30_000_000_000l; i++) {
			
		}
		s.stopNano();
		
		double elapseTime = s.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapseTime);
		
		
	}
}
