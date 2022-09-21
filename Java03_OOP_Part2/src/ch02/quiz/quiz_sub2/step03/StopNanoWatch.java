package ch02.quiz.quiz_sub2.step03;

public class StopNanoWatch {
	long startTime;
	long endTime;
	
	void startNano() {
		startTime = System.nanoTime();
	}
	void stopNano() {
		endTime = System.nanoTime();
		
	}
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1000000000;
	}
	
}
