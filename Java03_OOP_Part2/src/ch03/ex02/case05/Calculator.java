package ch03.ex02.case05;

public interface Calculator {
	double PI = 3.14; // 인터페이스에서 선언한 변수는 다 상수임.
	int ERROR = -9999999;

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
}
