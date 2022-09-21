package ch03.ex01.case03;

public class SequenceMain {
	public static void main(String[] args) {
		
		Sequence.setBasisNum(0);
		
		Sequence s1 = new Sequence();
		Sequence s2 = new Sequence();
		Sequence s3 = new Sequence();
		
		System.out.println(s1.nextNum());
		System.out.println(s2.nextNum());
		System.out.println(s3.nextNum());
		
		System.out.println();
		
		Sequence.setBasisNum(10);
		System.out.println(s1.nextNum());
		System.out.println(s2.nextNum());
		System.out.println(s3.nextNum());
	}
}
