package ch05.quiz;

public class quiz03 {

	public static void main(String[] args) {

		int nums[]= new int [] {100, 50, 100, 50};
		int sum = 0;
		float avg = 0;
		/// Enhanced for문 (자료 구조 알고리즘 _ for-each)
		for (int s : nums) {
//			System.out.print(s+ " ");
			sum = (sum+s);
			avg = sum/(nums.length);

		/*double avg = 0.0
		 * for(int score : score){
			sum += score;
		
		}
		 avg = 1.0 * sum/score.length;*/
			
			
			
			
		}
//		System.out.println();
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.1f",avg);
	}

}
