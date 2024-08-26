package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01_1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<String> nameArr = new ArrayList<>();
      ArrayList<String> phoneArr = new ArrayList<>();
      int num;
      String name, phoneNum;
      while(true) {
         System.out.println("1.연락처 등록");
         System.out.println("2.검색");
         System.out.println("3.삭제");
         System.out.println("4.모두 보기");
         System.out.println("5.종료");
         System.out.println(">>> : ");
         num = input.nextInt();
         switch ( num ) {
         case 1:
            //이름 중복 확인
            System.out.println("이름 입력");
            name = input.next();
            System.out.println("전화번호 입력");
            phoneNum = input.next();
            if( !nameArr.contains(name) ) {
               nameArr.add(name);
               phoneArr.add(phoneNum);
            }else {
               System.out.println("동일한 값");
            }
            break;
         case 2:
            System.out.println("검색 이름 입력");
            name = input.next();
            int re = nameArr.indexOf(name);
            if( re == -1 ) {
               System.out.println("없음");
            }else {
               System.out.println( nameArr.get(re) );
               System.out.println( phoneArr.get(re) );
            }
            break;
         case 3:
            System.out.println("삭제 이름 입력");
            name = input.next();
            int index = nameArr.indexOf(name);
            if( index == -1 ) {
               System.out.println("삭제 없음!!!!");
            }else {
               nameArr.remove(index);
               phoneArr.remove(index);
               System.out.println("삭제 완료");
            }
            break;
         case 4:
            //System.out.println( nameArr );
            //System.out.println( phoneArr );
            System.out.println("이름\t전화번호");
            System.out.println("===================");
            for(int i=0 ; i<nameArr.size() ; i++) {
               System.out.println(nameArr.get(i)+"\t"+phoneArr.get(i));
            }
            break;
         case 5:break;
         }
      }
   }
}
