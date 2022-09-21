// 요구사항 : 나노 세컨드로 경과 시간을 만들어 주세요.
package ch02.quiz.quiz_sub2.step01;

public class FootNanoStopWatch {
	
	//필드
	long startTime;
	long endTime;
	
	//메소드
	public double getElapsedTime() {
		return(double)(endTime - startTime) / 1000000000;
	}
	
	public static void main(String[] args) {
		
		FootNanoStopWatch f = new FootNanoStopWatch();
		f.startTime =  System.nanoTime();
//		f.endTime = System.nanoTime();
		
		for (long i = 0; i<30_000_000_000L;i++) {
			
		}
		
		f.endTime = System.nanoTime();
		double elapseTime = f.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapseTime);
		
	}
}

