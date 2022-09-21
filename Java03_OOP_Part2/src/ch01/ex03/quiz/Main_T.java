//package ch01.ex03.quiz;
//
//import java.util.ArrayList;
//
///*
// * 아래 내용을 코드로 구현하세요.
// * -물건을 담을 수 있는 가방을 만든다
// * -가방에 지우개 하나와 연필 한 자루를 담는다.
// * -가방에 손을 넣어 물건을 꺼내는데,
// * -꺼낸 물건이 지우개면 지우고 ("지운다")
// * -꺼낸 물건이 연필이면 쓴다.("쓴다")
// * 
// * 
// * -1)상속2)타입변환 3)instanceof 4)ArrayList 사용
// * */
//
//
//class Bag{
//	public void have() {
//		
//	}
//}
//
//class Pencil extends Bag{
//	@Override
//	public void have() {
//	System.out.println("연필 한자루");	
//	}
//	public void write() {
//		System.out.println("쓴다");
//	}
//}
//class Eraser extends Bag{
//	@Override
//	public void have() {
//		System.out.println("지우개 한 개");
//	}
//	public void erase() {
//		System.out.println("지운다.");
//	}
//}
//
//
//
//
//public class Main_T {
//	public static void main(String[] args) {
//		Bag pencil = new Pencil();
//		Bag eraser = new Eraser();
//		
//		ArrayList<Bag> bagList= new ArrayList<>();
//		bagList.add(pencil);
//		bagList.add(eraser);
//		
//		Main_T test = new Main_T();
//		test.testDownCasting(bagList);
//	}
//	public void testDownCasting(ArrayList<Bag>bagList) {
//		for(int i =0; i<bagList.size();i++) {
//			Bag bag = bagList.get(i);
//			
//		if(bag instanceof Pencil) {
//			Pencil pencil = (Pencil) bag;
//			pencil.write();
//		}else if(bag instanceof Eraser) {
//			Eraser eraser = (Eraser) bag;
//			eraser.erase();
//		}
//		else {
//			System.out.println("Error");
//		}
//		}
//	}
//}
