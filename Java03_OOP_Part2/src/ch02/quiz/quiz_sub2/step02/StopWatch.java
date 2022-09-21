package ch02.quiz.quiz_sub2.step02;

public class StopWatch {
	// millisecond 일 때
	long startTime;
	long endTime;
	
	void start() {
		startTime = System.currentTimeMillis();
	}
	void stop() {
		endTime = System.currentTimeMillis();
		
	}
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1000;
	}
	
	//nanosecond일때
	long startNanoTime;
	long endNanoTime;
	
	void startNano(){
		startNanoTime = System.nanoTime();
	}
	void stopNano() {
		endNanoTime = System.currentTimeMillis();
	}
	public double getElapsedNanoTime() {
		return (double)(endNanoTime - startNanoTime)/1000000000;
	}
}
