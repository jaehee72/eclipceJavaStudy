package ch05;

import java.util.ArrayList;

public class C08ArrayList {

	public static void main(String[] args) {
		//ArrayList 사용 - 추가, 수정, 삭제, 조회
		//ArrayList 객체 생성(제네릭 사용)
		
		ArrayList<String> s = new ArrayList<String>();
		
		
		//추가 -add()
		s.add("김재");
		s.add("김수");
		s.add("최민");
		System.out.println(s.get(1));
		
		// 수정 - set(인덱스, 수정값)
		s.set(1, "리사");
		System.out.println(s.get(1));
		System.out.println("----------------------------");
		
		//조회
		for(int i=0;i<s.size();i++)
			System.out.println(s.get(i)+"\t");
		System.out.println("----------------------------");
		
		
		//삭제 -remove()
		s.remove(1);
		
		
		for(String p : s)
			System.out.println(p+ "\t");		
			
		
	}

}
