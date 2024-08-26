package list;

import java.util.*;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		
		String searchName = " ";
		int indexName = 0;
		int indexPhone = 0;
		boolean bool = true;
		
		while(bool) {
			
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			String num = input.next();
			
			System.out.println();
			
			switch(num) {
				case "1":
					
					boolean bool2 = true;
					
					while(bool2) {
						System.out.print("이름 입력: ");
						searchName = input.next();
						
						if(name.contains(searchName)) {
							System.out.println("동일한 이름을 가진 사람이 있습니다.");
							System.out.println();
						}else {
							name.add(searchName);
							
							System.out.print("연락처 입력: ");
							phone.add(input.next());
							
							System.out.println("연락처 등록이 완료되었습니다.");
							break;
						}
					}
					
					System.out.println();
					break;
				case "2":
					
					System.out.println("------------- 연락처 찾기 -------------");
					
					System.out.print("이름 검색: ");
					searchName = input.next();
					
					if(name.contains(searchName)) {
						indexName = name.indexOf(searchName);
						indexPhone = name.indexOf(searchName);
						
						System.out.println("이름: " + name.get(indexName) + ", 연락처: " + phone.get(indexPhone));
					} else {
						System.out.println("등록된 연락처가 목록에 없습니다.");
					}
					
					System.out.println();
					break;
				case "3":
					System.out.println("------------- 연락처 삭제 -------------");
					
					System.out.print("삭제할 이름 검색: ");
					searchName = input.next();
					
					if(name.contains(searchName)) {
						indexPhone = name.indexOf(searchName);
						
						name.remove(searchName);
						phone.remove(indexPhone);
						
						System.out.println(searchName + "님이 삭제되었습니다.");
					} else {
						System.out.println("등록된 연락처가 목록에 없습니다.");
					}
					
					System.out.println();
					break;
				case "4":
					System.out.println("------------- 모든 연락처 목록 -------------");
					
					if(name.size() != 0) {
						for(int i = 0; i < name.size(); i++) {
							System.out.println("이름: " + name.get(i) + ", 연락처: " + phone.get(i));
						}
					} else {
						System.out.println("등록된 연락처가 없습니다.");
					}
					
					System.out.println();
					break;
				case "5":
					System.out.println("종료합니다.");
					bool = false;
					System.out.println();
					break;
				default:
					System.out.println("메뉴를 다시 입력해주세요!!");
					System.out.println();
					break;
				
			}
		}
		
		input.close();

	}

}
