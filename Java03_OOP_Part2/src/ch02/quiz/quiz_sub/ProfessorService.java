package ch02.quiz.quiz_sub;
import java.util.Scanner;

public class ProfessorService extends Professor {
	Scanner sc = new Scanner(System.in);
	Professor[] s = new Professor[5];
	int cnt =0;
	

	
	public void input(Professor[] p) {
		
		if (cnt == s.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		}else {
			s[cnt] = new Professor();
			System.out.println("교수 이름 입력: ");
			s[cnt].setProf(sc.next());
			System.out.println("교수 학과 입력: ");
			s[cnt].setPdepart(sc.next());

			cnt++;
		}		
	}
	public void output(Professor[] p) {
		if(cnt == 0) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i =0; i<cnt;i++) {
				System.out.println("교수 이름: "+s[i].getProf());
				System.out.println("교수 학과: "+s[i].getPdepart());
				

			}
		}
	}
	
	public void modify(Professor[] p) {
		if(cnt ==0){
			System.out.println("검색할 게 없어요 ");
			return;
		}
		System.out.println("수정하고 싶은 교수 이름 입력 >>> ");
		String prof = sc.next();
		for(int i=0; i<cnt; i++) {
			if(s[i].getProf().equals(prof)) {
				
				System.out.print("수정 할 교수 이름 입력 >>>");
				s[i].setProf(sc.next());
				System.out.print("수정 할 교수 학과 입력 >>>");
				s[i].setPdepart(sc.next());

				
				System.out.println("수정 완료 ");
				return;
				
			}
		}
		System.out.println("일치하는 이름이 없어요!");
		
	}
	
	public void delete(Professor[] p){
		if(cnt == 0) {
			System.out.println("삭제할게 없어용 !");
			return;
		}
		
		System.out.print("삭제하고자 하는 아이디 입력 >>>");
		String prof = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(s[i].getProf().equals(prof)) {
				for(int j = i; j<cnt-1; j++) {
					s[j] = s[j+1];

				}
				System.out.println(i);
				System.out.println(cnt);

				System.out.println("삭제 완료 ");
				return;
			}
		}
		System.out.println("삭제하고자 하는 아이디가 없습니다 !!!");
	
	}
	
	
}
