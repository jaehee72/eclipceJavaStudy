package case01.sub_quiz;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		//ArrayList 사용-추가,수정,삭제,조회
		//ArrayList<String>
		ArrayList<String> s = new ArrayList<String>();
		//추가 -add()
		s.add("박재희"); //[0]
		s.add("박성연"); //[1]
		
		//조회 - get(인덱스)
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		
		for(int i =0; i<s.size();i++) {
			System.out.print(s.get(i)+"\t");
		}
		for(String p : s) {
			System.out.print(p+"\t");
		}
	}
}
