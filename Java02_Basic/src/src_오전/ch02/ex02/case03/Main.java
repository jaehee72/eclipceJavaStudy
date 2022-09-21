package ch02.ex02.case03;

public class Main {
	public static void main(String[] args) {
		
		Baker baker1 = new Baker();
		Baker baker2 = new Baker();
		
		Bread bread = null;
		bread = baker1.bake();  // 제빵사1이 빵을 만듦
		
		baker2.putPrice(bread, 2000);
		
		System.out.println(bread);
	}
}
