package ch02.quiz.case01;

public class Score {
	private int kor; //국어
	private int eng; //영어
	private int math; //수학
	private int sum; //총점
	private double avg; //평균
	private String name; //이름
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
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
		this.sum = kor+ eng + math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = sum/3.0;
	}
}
