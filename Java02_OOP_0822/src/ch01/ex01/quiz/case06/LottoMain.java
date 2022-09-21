package ch01.ex01.quiz.case06;

public class LottoMain {
	public static void main(String[] args) {
		
		SlotMachine slot = new SlotMachine();
//		Console c = new Console();
		char isRepeat = 'y';
		
		int i = 0;
		for (; i<6 && isRepeat == 'y'; i++) {
			System.out.println(slot.hitSlot());
			isRepeat = Console.inYn("공을 계속 뽑을까요");
		}
		
		System.out.println();
		if (i == 6) System.out.printf("공을 %d개 모두 뽑았습니다.\n", i);
		System.out.println("끝.");
	}
}
