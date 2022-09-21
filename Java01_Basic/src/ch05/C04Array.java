package ch05;

public class C04Array {

	public static void main(String[] args) {
		
		int[] ints;
		ints = new int [100];
		
		double[] doubles = new double[100];
		
		String strings[]= new String[100];
		// 기본 값으로 초기화
		
		System.out.println(ints[99]); //0
		System.out.println(doubles[0]); //0.0
		System.out.println(strings[50]); //null
		
	}

}
