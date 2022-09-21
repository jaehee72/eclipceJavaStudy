package ch02.ex01_print.Quiz;

public class Quiz03 {

	public static void main(String[] args) {

		int ko = 100;
		int en = 90;
		int math = 80;
		int sum = ko + en + math;
		double avg = (double)sum/3;
		
		System.out.println("총점 :"+ sum +"\n평균" +avg);
		System.out.println();
		System.out.printf("총점은? %d", sum);
		System.out.println();
		System.out.printf("평균은? %f", avg);
		System.out.println();
		System.out.printf("총점 : %d\n  평균 : %f", sum, avg);
	}

}
