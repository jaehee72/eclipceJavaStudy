package ch03.ex03;

public class C01Ternary {
	public static void main(String[] args) {
		
		int score = 50;
		String result = "";
		
		result = (score >= 60)?"합격" :"과락";
		
		System.out.println(result); // 과락
		System.out.printf("%d점은 과락입니다", score, result);
	}

}
