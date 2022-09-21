package ch02.quiz.quiz_sub2.step04;

public class StopMilliWatch {
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
	
}
