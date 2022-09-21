package ch04.ex04;

public class C03While {

	public static void main(String[] args) {
		int cnt = 0;
		int random = 1;
		
		while(!(random %3 == 0)){
			random = (int)(Math.random()*100)+1;
			cnt ++;
		}
		
		System.out.printf("%d만에 %d를 뽑았습니다.", cnt, random);
	}

}


// (출력) 5번만에 24를 뽑았습니다. (뽑히는 값은 3의 배수)
// random값의 범위는 1~100
// while (3의 배수가 뽑히면 종료)