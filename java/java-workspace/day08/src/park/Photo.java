package park;

import java.util.Scanner;
import java.util.ArrayList;

public class Photo {

	private static final String P_Name = "사진";
	private static final String V_Name = "동영상";
	
	Scanner input = new Scanner(System.in);
	PhotoDTO p = new PhotoDTO();
	
	int num;
	
	public void display() {
		
		boolean bool = true;
		
		while(bool) {
			System.out.println("1. 사진 촬영   2. 동영상 촬영   3. 앨범   4. 삭제   5. 나가기 ");
			System.out.print(">>> ");
			int number = input.nextInt();
			System.out.println();
			
			switch(number) {
				case 1: 
					filming(number);
					break;
				case 2:
					filming(number);
					break;
				case 3:
					ArrayList<String> name = p.getList();
					
					System.out.println("------ 앨범 목록 ------");
					for(int i = 0; i < p.getList().size(); i++) {
						System.out.println((i + 1) + ". " + name.get(i));
					}
			
					System.out.println();
					break;
					
				case 4:
					ArrayList<String> file = p.getList();
					
					System.out.println("------ 파일 삭제 ------");
					System.out.print("삭제할 파일명 입력: ");
					String inputName = input.next();
					
					boolean re = file.contains(inputName);
					
					if(re) {
						file.remove(inputName);
						System.out.println(inputName + " 파일이 삭제 되었습니다.");
					} else {
						System.out.println("검색된 파일명이 없습니다.");
					}
					
					System.err.println();
					break;
				case 5:
					System.out.println("사진 메뉴 종료!!!");
					bool = false;
					System.out.println();
					break;
				default:
					System.out.println("다시 입력해주세요.");
					System.out.println();
					break;
			}
		}
	}
	
	public void filming(int number) {
		
		String title = null;
		
		if(number == 1) {
			title = P_Name;
		} else if(number == 2) {
			title = V_Name;
		}
		
		System.out.println("------ " + title + "촬영 ------");
		
		System.out.println("1. 촬영 \t 2. 취소");
		System.out.print(">>> ");
		num = input.nextInt();
		System.out.println();
		
		switch(num) {
			case 1: 
				System.out.println(title + " 촬영 완료!!!!");
				System.out.println("1. 저장 \t 2. 취소");
				System.out.print(">>> ");
				num = input.nextInt();
				System.out.println();
				
				if(num == 1) {
					System.out.print(title + "이름 입력: ");
					
					if(number == 1) {
						p.setFileName(input.next() + ".jpg");
					} else if(number == 2) {
						p.setFileName(input.next() + ".wmv");
					}
					
					
					System.out.println(title + "이 저장되었습니다. ");
					
				} else {
					System.out.println("취소 했습니다.");
				}
				
				break;
			case 2: 
				System.out.println("취소 했습니다.");
				break;
			default:
				System.out.println("다시 입력해주세요.");
				System.out.println();
				break;
		}
		
		System.out.println();
	}
}
