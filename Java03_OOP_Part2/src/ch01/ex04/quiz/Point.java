package ch01.ex04.quiz;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	@Override
	public String toString() {
		return String.format("(%d , %d)", x,y);
	}
}
