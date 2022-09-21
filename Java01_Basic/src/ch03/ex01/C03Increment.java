package ch03.ex01;

public class C03Increment {

	public static void main(String[] args) {

		
		// 증감 연산자(++) : 1씩 증가
		int i = 0;
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		// 전위 연산자(++i);
		i = 0;
		int j = ++i;
		System.out.printf("i: %d, j:%d\n", i,j);
		
		// 후위 연산자(i++);
		i = 0;
		j = i++;
		System.out.printf("i: %d, j:%d\n", i,j);
		
	}

}
