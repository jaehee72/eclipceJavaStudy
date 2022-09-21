package ch01.ex01.quiz.case06;

public class SlotMachine {
	
	public Ball hitSlot() {
		Ball ball = new Ball();
		ball.setNum((int)(Math.random() * 45) + 1);
		return ball;
	}
}
