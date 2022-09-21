package ch02.quiz.case01;

import java.util.Scanner;


public class ScoreService extends Template{
	Scanner sc = new Scanner(System.in);
	Score[] s = new Score[5];
	
	
	@Override
	int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("선택 : ");
		return sc.nextInt();
	}
	
	
	
	public void input(Object[] o) {
		
		if (cnt == s.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		}else {
			s[cnt] = new Score();
			System.out.println("이름 입력: ");
			s[cnt].setName(sc.next());
			System.out.println("국어 점수 입력 : ");
			s[cnt].setKor(sc.nextInt());
			System.out.println("수학 점수 입력 : ");
			s[cnt].setMath(sc.nextInt());
			System.out.println("영어 점수 입력 : ");
			s[cnt].setEng(sc.nextInt());
			s[cnt].setSum();
			s[cnt].setAvg();
			cnt++;
		}		
	}
	@Override
	public void output(Object[] o) {
		if(cnt == 0) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i =0; i<cnt;i++) {
				System.out.println("이름: "+s[i].getName());
				System.out.println("국어: "+s[i].getKor());
				System.out.println("수학: "+s[i].getMath());
				System.out.println("영어: "+s[i].getEng());
				System.out.println("####################");
				System.out.println("총점: "+s[i].getSum());
				System.out.println("평균 "+s[i].getAvg());
				
			}
		}
	}

	@Override
	public void modify(Object[] o) {
		Score[] s = (Score[]) o;
		
		if(cnt==0) {
			System.out.println("검색할 게 없어요 ");
			return;
		}
		System.out.print("수정하고 싶은 이름 입력 >>> ");
		String name = sc.next();
		for(int i=0; i<cnt; i++) {
			if(s[i].getName().equals(name)) {
				
				System.out.print("수정 할 국어 점수 입력 >>>");
				s[i].setKor(sc.nextInt());
				System.out.print("수정 할 영어 점수 입력 >>>");
				s[i].setEng(sc.nextInt());
				System.out.print("수정 할 수학 점수 입력 >>>");
				s[i].setMath(sc.nextInt());
				
				System.out.println("수정 완료 ");
				return;
				
			}
		}
		System.out.println("일치하는 이름이 없습니다요옹");
		
	}

	@Override
	public void delete(Object[] o) {
		Score[] s = (Score[]) o;	//down_casting
		if(cnt == 0) {
			System.out.println("삭제할게 없어용 !");
			return;
		}
		
		System.out.print("삭제하고자 하는 아이디 입력 >>>");
		String name = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(s[i].getName().equals(name)) {
				for(int j = i; j<cnt-1; j++) {
					s[j] = s[j+1];
				}
				cnt --;
				System.out.println("삭제 완료 ");
				return;
			}
		}
		System.out.println("삭제하고자 하는 아이디가 없습니다 !!!");
		
	}
}

