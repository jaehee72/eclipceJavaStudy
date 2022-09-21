package ch05.quiz;


/*Q. 나열된 수에서 최솟값과 최댓값 구하기
 * - 여러 개의 수가 배열에 있을 때 그 중 가장 큰 값과 가장 작은 값을 찾는다.
 * - 배열의 몇 번째에 있는지 순서를 찾는다.
 * - 반복문을 한번만 사용하여 문제를 해결한다.
 * - {10, 55, 23, 2, 79, 101, 16, 82, 30, 45}
 * 
 * 
 * 가장 큰 값은 101이고, 위치는 6번째입니다.
 * 가장 작은 값은 2이고, 4번째입니다.
 */



public class A01MaxMin {

	public static void main(String[] args) {

		int nums[]= new int [] {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int cnt = 0;
		int cnt2 = 0;
		int max = nums[0];
		int min =nums[0];
		System.out.println(nums[9]);
		System.out.println(nums.length);
		for(int i =0; i<=(nums.length)-1;i++) {
			if(nums[i]>max) {
				max = nums[i];
				cnt = i;
			}
			if(nums[i]<min) { 
				min = nums[i];
				cnt2 = i;}
		}

		System.out.println("최대값 : "+ max+"위치"+cnt);
		System.out.println("최소값 : "+ min+"위치"+cnt2);
	}

}


