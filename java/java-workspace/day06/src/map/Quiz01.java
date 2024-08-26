package map;

import java.util.*;

public class Quiz01 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator(); 
		
		// 위와 같이 두줄을 한줄로도 가능 
//		Iterator<String> iter = map.keySet().iterator(); 
		
		Scanner input = new Scanner(System.in);
		
		boolean bool = true;
		int num = 0;
		String food = null, money = null, key, value;
		
		while(bool) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			System.out.println();
			switch(num) {
				case 1 :
					
					boolean bool2 = true;
					
					while(bool2) {
						System.out.print("메뉴를 등록: ");
						food = input.next();
						
						if(map.containsKey(food)) {
							System.out.println();
							System.out.println(food + "은 존재하는 메뉴입니다.");
							System.out.println();
							continue;
						} 
						break;
						
					}
					
					System.out.print(food + " 가격 입력: ");
					money = input.next();
					
					map.put(food, money);
					
					System.out.println();
					break;
					
				case 2:
		
					iter = set.iterator(); 
					int i = 1;
					while(iter.hasNext()) {
						key = iter.next();
						value = map.get(key);
						System.out.println(i + ". " + key + ": " + value);
						i += 1;
					}
					
					System.out.println(" ------------------------- ");
					
					boolean bool3 = true;
					while(bool3) {
						System.out.println("1. 수정 2. 삭제 3. 나가기");
						System.out.print(">>> ");
						int num2 = input.nextInt();
						
						switch(num2) {
							case 1:
								System.out.print("수정할 메뉴: ");
								food = input.next();
								
								if(map.containsKey(food)) {
									System.out.print("수정할 금액: ");
									money = input.next();
									System.out.println(map.get(food) + " -> " + money);
									map.put(food, money);
									System.out.println("수정이 완료되었습니다.");
									bool3 = false;
									
								}else {
									System.out.println("없는 메뉴입니다.");
								}
								
								break;
							case 2: 
								System.out.print("삭제할 메뉴: ");
								food = input.next();
								
								if(map.containsKey(food)) {
									
									map.remove(food);
									System.out.println("메뉴를 삭제했습니다.");
									bool3 = false;
									
								}else {
									System.out.println("없는 메뉴입니다.");
								}
								break;
							case 3:
								System.out.println("나가기.");
								bool3 = false;
								break;
							default:
								System.out.println("다시 입력해주세요. ");
						}
					}
					
					// 나가기 할때 if 문으로 break를 입력하여 반목문 나가기! 
//					if(num == 3) {
//						break;
//					}
					
					
					System.out.println();
					break;
				case 3:
					System.out.println("종료합니다.");
					bool = false;
					System.out.println();
					break;
				default:
					System.out.println("다시 입력해주세요. ");
					System.out.println();
					break;
			}
			
		}
		
		input.close();

	}

}
