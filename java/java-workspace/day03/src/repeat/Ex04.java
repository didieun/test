package repeat;

public class Ex04 {

	public static void main(String[] args) {
		
		boolean bool = true;
		int i = 0;
		
		// while(bool)
		for( ; bool ; ) {
			i++;
			System.out.println(11);
			if( i > 3) {
				bool = false;
			}
		}
		
		i = 0;
		
		while(true) {
			i++;
			System.out.println(i);
			if(i > 3) {
				break; // 무한반복에서 break; 을 주면 무한반복을 끝낼수가 있다.
			}
		}
		
		i = 0;
		for( ; i < 5 ; ) {
			i++;
			if( i == 3) {
				System.out.println(33333);
//				break;
				continue;  // continue : 반복문에서 바로 반복문의 윗쪽으로 올라간다.(continue 만나는 즉시 맨 위로 올라간다.)
			}
			System.out.println("i: " + i);
		}

	}

}
