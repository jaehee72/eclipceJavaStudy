package ch04.ex05;

public class C05Break {

	public static void main(String[] args) {
		

		// sum=  1+2+3+ ...     n>= 100 
		// 그 sum과 n의 값 출력 
		// for, break 사용
		
		int sum = 0;
		int i = 0;
		for(i=1; ;i++ ){
			sum +=i;
			if(i>=100)
				break;
		}

		System.out.println("N의 값"+ i);
		System.out.println("합계: "+sum);
		
		
		
		
		
		
		
		
	}

}
