package java_study2.co.kr.jungbu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L17StreamAPIEx3 {

	public static void main(String[] args) {
		/*
		 * stream 의 중간 연산
		 * sort() stream 자료를 정렬 
		 * 
		 * Array 배열의 기본이 되는 타입 : 필드가 index 뿐인 자료형 
		 */
		int[] numAr = {99,-5,1,2,33,-7}; //
		
		//List : 배열을 제어하기 위한 자료형 :필드가 Index 와 제어에 유용한 함수를 포함 , 배열의 아이템을 추가삭제 가능 (길이가 변겨 ㅇ가능) 
		List<Integer> numList = new ArrayList<>();
		numList.add(99);
		numList.add(-5);
		numList.add(1);
		numList.add(2);
		numList.add(33);
		numList.add(-7);
		numList.sort(null);
		System.out.println(numList);
		
		int[] numAr2 = {99,-5,1,2,33,-7};
		//stream 자료형의 목표는 모든 자료형의 반복문을 통일 
		
		Arrays.stream(numAr2)
		.sorted()
	
		.forEach(System.out::println);
		
		String[] strArr = {"aaa","abc","bbc","Avv","Abc","Bbc","zzz","zzz","zzz"};
		
		Arrays.stream(strArr)
		.distinct() //중복을 제거하는 중간 연산 
		.sorted(String.CASE_INSENSITIVE_ORDER)
		.forEach(System.out::println);
		
		int[] intAr3 = {0,1,2,3,4,5,6,7,8,9};
		
		Arrays.stream(intAr3)
		.skip(3) //건너뛰는 연산자 
		.limit(4) //3개 건너뛰어서 4개 출력할게요 (길이만큼 잘라내는 연산) 
		.forEach(p->System.out.println(p));
	

	}

}
