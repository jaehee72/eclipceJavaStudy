package ch01.quiz02.case05;

import java.util.Scanner;

public class MainService {

   Scanner sc = new Scanner(System.in);
   
   int cnt = 0;
   
   public int menu() {
      System.out.println("1. 입력");
      System.out.println("2. 출력");
      System.out.println("3. 수정");
      System.out.println("4. 삭제");
      System.out.println("0. 프로그램 종료");
      System.out.print("선택 : ");
      return sc.nextInt();
   }

   public void input(Member[] m, Score[] s) {
      if (cnt == m.length) {
         System.out.println("입력할 공간이 없습니다.");
        
      }else {
    	  m[cnt] = new Member();
          s[cnt] = new Score();
          
          System.out.print("이름 : ");
          m[cnt].setName(sc.next());
          System.out.print("나이 : ");
          m[cnt].setAge(sc.nextInt());
          System.out.print("이메일 : ");
          m[cnt].setEmail(sc.next());
          System.out.print("국어 점수 : ");
          s[cnt].setKor(sc.nextInt());
          System.out.print("영어 점수 : ");
          s[cnt].setEng(sc.nextInt());
          System.out.print("수학 점수 : ");
          s[cnt].setMath(sc.nextInt());
          
          s[cnt].setSum();
          s[cnt].setAvg();
          cnt++;
      }
   }

   public void output(Member[] m, Score[] s) {

      for (int i=0; i<cnt; i++) {
         System.out.println("###" + m[i].getName()+"###");
         System.out.println("총점 : " + s[i].getSum());
         System.out.println("평균 : " + s[i].getAvg());
      }
   }

   public void modify(Member[] m, Score[] s) {
      m[cnt] = new Member();
      s[cnt] = new Score();
      int tmp = 0;
      if (cnt == 0) {
         System.out.println("\n등록된 사용자가 없습니다.\n");
         return;
      }
      System.out.print("수정할 사용자 이름을 입력 : ");
      String name = sc.next();
      for (int i=0; i<cnt; i++) {
         if (name.equals(m[i].getName())) {
        	 System.out.println("1. 나이 , 이메일");
        	 System.out.println("2. 성적");
        	 System.out.print("선택 : ");
        	 int select= sc.nextInt();
        	 
        	 if(select ==1) {
        		 System.out.println("수정할 나이 입력");
        		 m[i].setAge(sc.nextInt());
        		 m[i].setEmail(sc.next());
        	 }else if (select ==2) {
        	      System.out.print("수정할 국어 점수 입력 : ");
        	      s[i].setKor(sc.nextInt());
        	      System.out.print("수정할 영어 점수 입력 : ");
        	      s[i].setEng(sc.nextInt());
        	      System.out.print("수정할 수학 점수 입력 : ");
        	      s[i].setMath(sc.nextInt());
        	      s[i].setSum();
        	      s[i].setAvg();
        	      }
        	 break;
      	 }
         if (cnt ==i)
        	 System.out.println("사용자가 존재하지 않습니다.");
     }
}
   
/*   s[i].getName().equals(name)
 * 		name.equals(m[i].getName())
   public void delete(Member[]m, Score[] s) {
	   System.out.println("삭제할 이름 입력: ");
	   String name = sc.next();
	   for( int i =0; i<cnt; i++) {
		   if(name.equals)m[i].getName()){
        	 System.out.println(name + "님의 정보를 삭제합니다.");
        	 cnt --;
        	 for int (j =1 ;j< cnt ; j++) {
        		 m[j]= m[j+1];
        		 s[j] = s[j+1];
        	 }
        	 break;
         }
	   }
   }
  */ 
   
   
   

   public void delete(Member[] m, Score[] s) {
      int tmp = 0;
      if (cnt == 0) {
         System.out.println("등록된 사용자가 없습니다.\n");
         return;
      }
      System.out.print("수정할 사용자 이름을 입력 : ");
      String name = sc.next();
      for (int i=0; i<cnt; i++) {
         if (name.equals(m[i].getName())) {
            tmp = i;
            break;
         }else {
            System.out.println("\n" + name + "사용자가 존재하지 않습니다.\n");
            return;
         }
      }
      m[cnt] = new Member();
      s[cnt] = new Score();
      for(;tmp<cnt; tmp++) {
         m[tmp].setName(m[tmp+1].getName());
         m[tmp].setAge(m[tmp+1].getAge());
         m[tmp].setEmail(m[tmp+1].getEmail());
         s[tmp].setKor(s[tmp+1].getKor());
         s[tmp].setEng(s[tmp+1].getEng());
         s[tmp].setMath(s[tmp+1].getMath());
         s[tmp].setSum();
         s[tmp].setAvg();
      }
      System.out.println(name + " 사용자가 삭제되었습니다.\n");
      cnt--;
   }

}