package ch04.ex04;

public class C04NestedWhile {

	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		while(i<=9) {
			j=1;
			while(j<=9) {

			System.out.printf("%d * %d = %d \n",i, j, i*j);
			j++;
			}
			i++;
			System.out.println();
		}

	}

}
