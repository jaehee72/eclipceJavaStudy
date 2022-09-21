package ch02.quiz.quiz_sub;

import java.util.Scanner;


public class ScoreService extends Score{
	Scanner sc = new Scanner(System.in);
	Score[] s = new Score[5];
	int cnt =0;

	
	public void input(Score[] s) {
		
		if (cnt == s.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		}else {
			s[cnt] = new Score();
			System.out.println("이름 입력: ");
			s[cnt].setName(sc.next());
			System.out.println("학과 입력: ");
			s[cnt].setDepart(sc.next());
			System.out.println("점수 입력: ");
			s[cnt].setGrade(sc.nextInt());
			cnt++;
		}		
	}
	public void output(Score[] s) {
		if(cnt == 0) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i =0; i<cnt;i++) {
				System.out.println("이름: "+s[i].getName());
				System.out.println("학과: "+s[i].getDepart());
				System.out.println("점수: "+s[i].getGrade());

			}
		}
	}
	
	public void modify(Score[] s) {
		if(cnt ==0){
			System.out.println("검색할 게 없어요 ");
			return;
		}
		System.out.println("수정하고 싶은 이름 입력 >>> ");
		String name = sc.next();
		for(int i=0; i<cnt; i++) {
			if(s[i].getName().equals(name)) {
				
				System.out.print("수정 할 이름 입력 >>>");
				s[i].setName(sc.next());
				System.out.print("수정 할 학과 입력 >>>");
				s[i].setDepart(sc.next());
				System.out.print("수정 할 점수 입력 >>>");
				s[i].setGrade(sc.nextInt());
				
				System.out.println("수정 완료 ");
				return;
				
			}
		}
		System.out.println("일치하는 이름이 없어요!");
		
	}
	
	public void delete(Score[] s){
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
