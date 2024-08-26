package map;

import java.util.*;

public class Quiz01_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		int num;
		String menu =null, money=null;
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.가격 보기");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				while(true) {
					System.out.println("메뉴 입력");
					menu = input.next();
					if( map.containsKey(menu) ) {
						System.out.println("존재하는 메뉴.. 다시 입력..");
						continue;
					}
					break;
				}
				System.out.println("가격 입력");
				money = input.next();
				map.put(menu, money);
				break;
			case 2:
				//System.out.println( map );
				//Set<String> set = map.keySet();
				//Iterator<String> it = set.iterator();
				Iterator<String> it = map.keySet().iterator();
				//while( it.hasNext() ) {
				for( int i=1 ; it.hasNext() ; i++) {
					String key = it.next();
					System.out.println(i+"."+key+" : "+map.get(key) );
				}
				System.out.println("---------------");
				boolean bool = true;
				while( bool ) {
					System.out.println("1.수정 2.삭제 3.나가기");
					num = input.nextInt();
					switch (num) {
					case 1:	
						System.out.println("수정 메뉴 입력");
						menu = input.next();
						if( map.containsKey(menu) ) {
							System.out.println("변경 가능 메뉴");
							System.out.println("변경 가격 입력");
							money = input.next();
							System.out.println(map.get(menu)+" => "+money);
							map.put(menu, money);
						}else {
							System.out.println("메뉴 없음!!!");
						}
						break;
					case 2:	
						System.out.println("삭제 메뉴 입력");
						menu = input.next();
						if( map.containsKey(menu) ) {
							System.out.println("삭제 가능 메뉴");
							map.remove(menu);
						}else {
							System.out.println("메뉴 없음!!!");
						}
						break;
					//if( num == 3 ) break;
					case 3:	
						System.out.println("나가기");
						bool = false;
						break;
					}
				}
				
			}
		}
	}
}









