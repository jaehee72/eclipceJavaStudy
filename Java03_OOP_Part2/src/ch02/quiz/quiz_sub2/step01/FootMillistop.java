package ch02.quiz.quiz_sub2.step01;

public class FootMillistop {
	//필드
	long startTime;
	long endTime;
	
	//메소드
	public double getElapsedTime() {
		return(double)(endTime - startTime) / 1000000000;
	}
	
	public static void main(String[] args) {
		
		FootNanoStopWatch f = new FootNanoStopWatch();
		f.startTime =  System.currentTimeMillis();
//		f.endTime = System.nanoTime();
		
		for (long i = 0; i<30_000_000_000L;i++) {
			
		}
		
		f.endTime = System.currentTimeMillis();
		double elapseTime = f.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapseTime);
		
	}
}
