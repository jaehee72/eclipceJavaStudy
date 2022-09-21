package ch05.quiz;

public class quiz07 {

	public static void main(String[] args) {
//		int [] array = new int[5];
		int [] numbers = new int[5];
//		int a=0;
//
//		for(int i =0; i<array.length;i++) {
//			array[i]=i;
////			System.out.println(array[i]);
//		}
//		
//		for(int i =0; i<array.length;i++) {
//			int temp = (int)(Math.random()*array.length);
//			int temp2 = (int)(Math.random()*array.length);
//			
//			int arr = array[temp];
//			array[temp] = array[temp2];
//			array[temp2] = arr;
//			}
//		for(int i: array) {
//			System.out.print(i+"  ");
//		}
		
		for (int i = 0; i<numbers.length;i++) {
			numbers[i]=i;
			System.out.print(numbers[i]+ " ");
		}
		
		
		for(int i=0; i<100;i++) {
			int n = (int)(Math.random()*5);
			int temp = numbers[0];
			numbers[0] = numbers[n];
			numbers[n] = temp;
		}
		System.out.println();
		for (int number : numbers)
			System.out.print(number + " ");
		

	}

}
