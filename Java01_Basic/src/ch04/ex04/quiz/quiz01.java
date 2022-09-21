package ch04.ex04.quiz;

public class quiz01 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (!(i==100)) {
			
			i++;
			sum += i;

		}
		System.out.println("1~100까지의 합 : " +sum);
	}

}


//int sum= 0;
//for(int i =0 ; i<=100; i++) {
//	System.out.println(i);
//	sum += i;
//	System.out.println("합계: "+sum);
//}
