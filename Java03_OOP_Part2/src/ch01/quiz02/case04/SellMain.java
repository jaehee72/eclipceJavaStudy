package ch01.quiz02.case04;

public class SellMain {

   public static void main(String[] args) {
      
      SellService ss = new SellService();
      SellFruit[] sf = new SellFruit[3];
      
      sf[0] = new SellFruit();
      sf[1] = new SellFruit();
      sf[2] = new SellFruit();
      
      while(true) {
         ss.menu();
         int menu = ss.input();
         switch(menu) {
         case 1:
            sf = ss.sell(sf);
            break;
         case 2:
            ss.sellInfo(sf);
            break;
         case 3:
            ss.amount();
            break;
         case 0:
            System.out.println("프로그램을 종료합니다.");
            return;
         default:
            System.out.println("잘못된 입력입니다.");
         }
      }
   }

}