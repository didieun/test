package cellphone;

import java.util.ArrayList;
import java.util.Scanner;

public class Message_Operate {
	public void display() {
		Scanner input = new Scanner(System.in);
		ArrayList<String> messages = new ArrayList<>();
		ArrayList<String> numbers = new ArrayList<>();
		Message_DTO dto = new Message_DTO();
		String inputStr = null;
		boolean bool = true;
		
		while(bool) {
			System.out.println( "1.문자보내기" );
			System.out.println( "2.보낸문자 확인하기" );
			System.out.println( "3.저장된 문자보기" );
			System.out.println( "4.종료" );
			System.out.print( ">>> : " );
			int num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("문자 보내실 번호 입력하세요.");
				
				String number = input.next();
				numbers.add(number);
				dto.setNumbers(numbers);
		        System.out.println("문자 내용을 입력하세요.");
		        input.nextLine();
		        inputStr = input.nextLine();
		        messages.add(inputStr);
		        dto.setMessage(messages);
                break;
			case 2:
				System.out.println( "보낸문자 확인하시겠습니까?" );
				System.out.print( "1.네" );
				System.out.println( "2.아니요" );
				System.out.println( ">>> : " );
				num = input.nextInt();
				if( num == 1 ) {
					if(dto.getMessages()!=null) {
						dto.showNumbers();
						dto.showMessages();
					}else {
						System.out.println("보낸 문자가 없습니다");
					}
					
				}
				break;
			case 3:
				System.out.println( "저장된 문자 보기" );
				if( messages.isEmpty() ) {
                    System.out.println("저장된 문자가 없습니다.");
                } else {
                	dto.showNumbers();
					dto.showMessages();
                }
				break;
			case 4:
                return;
                
            default:
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                break;
				

			}
		}
	}
}