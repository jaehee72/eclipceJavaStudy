package ch03.ex01.case06;

public class CalculatorImpl implements Calculator {

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 ==0)
			return -999999;
		return num1 / num2;
	}
	public void showInfo() {
		System.out.println("모두 구현하였습니다.");
	}

}
