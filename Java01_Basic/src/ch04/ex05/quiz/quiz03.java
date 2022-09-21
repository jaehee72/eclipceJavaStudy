package ch04.ex05.quiz;

public class quiz03 {

	public static void main(String[] args) {
		

		int a= 0;
		
		for (int i=0; i<=100 ; i++ ) {
			if(i%3 != 0 || i==0) 
				continue;
			System.out.println(i);
			a = i;

		}
		System.out.println("3의배수 출력 끝");
	}

}
