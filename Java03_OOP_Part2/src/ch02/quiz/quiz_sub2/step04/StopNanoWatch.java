package ch02.quiz.quiz_sub2.step04;

public class StopNanoWatch {
	long startTime;
	long endTime;
	
	void start() {
		startTime = System.nanoTime();
	}
	void stop() {
		endTime = System.nanoTime();
		
	}
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1000000000;
	}
	
}
