package music;

import java.util.ArrayList;
import java.util.Scanner;

public class Music { // 1을 누르면 커진다 2을 누르면 작아진다 3.재생된다
	
	 MusicDTO dto = new MusicDTO();
	 
	
	public void display() {

		dto.setM("팝송");
		dto.setM("발라드");
		dto.setM("댄스곡");
		dto.setM("클래식");
		
		Scanner input = new Scanner(System.in);
		
		boolean bool = true;
		while (bool) {

			System.out.println("1.볼륨");
			System.out.println("2.재생");
			System.out.println("3.장르 선택");
			System.out.println("4.나가기");
			System.out.println("---> :");
			int num = input.nextInt();

			switch (num) {
			case 1:
				System.out.println("볼륨 조절해주세요 ");
				System.out.print("볼륨업(0), 볼륨다운(1) ");
				int vol = input.nextInt();
				
				int aaa = dto.getVol();
				System.out.println("현재볼륨: " + aaa);
			
				switch(vol) {
				case 0:
					dto.Vol2(0);
					
					if(dto.getVol() >= 50) {
						System.out.println("크다");
						break;
					} 
					break;
				case 1:
					dto.Vol2(1);
					if(dto.getVol() <= 0) {
						System.out.println("음소거");
						break;
					}
					break;
				}
				
				break;
			case 2:
				boolean bool2 = true;
				while (bool2) {
					System.out.println("1.재생");
					System.out.println("2.멈춤");
					System.out.println("3.나가기");
					int num1 = input.nextInt();
					switch (num1) {
						case 1:
							System.out.println("재생됩니다");
							break;
						case 2:
							System.out.println("멈춤니다.");
							break;
						case 3: 
							System.out.println("나갑니다");
							bool2 = false;
							break;

					}
					break;
				}
				break;
			case 3:
		
				
				
		
				for(int i=0; i<dto.getList().size();i++) {
					System.out.print(i+1 +". ");
					 System.out.println(dto.getList().get(i));
				}
				System.out.println("장르를 선택하세요 :" + " ");
				int title = input.nextInt();
				String s = dto.getList().get(title-1);
				System.out.println(s);
				break;
				
			case 4:
				System.out.println("종료");
				bool = false;
				break;
			}
			
		}


	}
}