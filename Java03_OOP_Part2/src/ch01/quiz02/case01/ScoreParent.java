package ch01.quiz02.case01;

public class ScoreParent {
	private String Name;
	protected int kr;
	protected int eng;
	protected int math;
	protected int sum;
	protected double avg;
	

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getKr() {
		return kr;
	}
	public void setKr(int kr) {
		this.kr = kr;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = kr+eng+math;
	}
	
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = sum/3.0;
	}


}
	
