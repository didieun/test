package call;

import java.util.ArrayList;
import java.util.Scanner;

public class Call_Operate {
	
	private ArrayList<Call_DTO> contact = new ArrayList<>();
	private ArrayList<Call_DTO> call_List = new ArrayList<>();
	
	public void display() {
		boolean bool = true;
		while (bool) {
			System.out.println("1. 통화");
			System.out.println("2. 최근 통화");
			System.out.println("3. 연락처");
			System.out.println("4. 종료");
			System.out.print(">>> : ");
			
			Scanner input = new Scanner(System.in);
			String a = input.next();
			
			switch (a) {
			case "1":
				System.out.println("1. 저장된 연락처에 전화걸기");
				System.out.println("2. 저장되지 않은 연락처에 전화걸기");
				System.out.print(">>> : ");
				
				int b = input.nextInt();
				
				if (b == 1) {
					show_Contact();
					System.out.println("통화를 걸 연락처를 선택하세요");
					System.out.print(">>> : ");
					
					int c = input.nextInt();
					if (c <= contact.size()) {
						String ss = contact.get(c - 1).getName();
						String ss2 = contact.get(c - 1).getPhone_Num();
						System.out.println(ss + " 에게 전화를 겁니다");
						Call_DTO cd2 = new Call_DTO();
						cd2.setName(ss);
						cd2.setPhone_Num(ss2);
						call_List.add(cd2);
					} else {
						System.out.println("선택한 연락처는 존재하지 않습니다");
					}
					
				} else if (b == 2) {
					System.out.println("전화를 걸 연락처를 입력하세요");
					String d = input.next();
					System.out.println(d + " 에게 전화를 겁니다");
					String ss3 = "";
					String ss4 = d;
					Call_DTO cd3 = new Call_DTO();
					cd3.setName(ss3);
					cd3.setPhone_Num(ss4);
					call_List.add(cd3);
					
				} else {
					System.out.println("잘못된 번호를 입력했습니다");
				}
				break;
				
			case "2":
				System.out.println("최근 통화 목록을 조회합니다");
				show_Call_List ();
				break;
				
			case "3":
				System.out.println("1. 연락처 등록");
				System.out.println("2. 연락처 삭제");
				System.out.println("3. 연락처 보기");
				System.out.print(">>> : ");
				
				int mmm = input.nextInt();
				if (mmm == 1) {
					System.out.println("연락처 등록");
					System.out.println("등록할 연락처 이름을 입력하세요");
					String s5 = input.next();
					
					boolean b1 = false;
					for (int i = 0; i < contact.size(); i++) {
						if (s5.equals(contact.get(i).getName())) {
							b1 = true;
							break;
						}
					}
					
					if (b1 == true) {
						System.out.println("이미 저장되어 있는 이름 입니다");
					} else {
						System.out.println("등록할 연락처 번호를 입력하세요");
						String s6 = input.next();
						
						boolean c1 = false;
						for (int i = 0; i < contact.size(); i++) {
							if (s6.equals(contact.get(i).getPhone_Num())) {
								c1 = true;
								break;
							}
						}
						
						if (c1 == true) {
							System.out.println("이미 저장되어 있는 번호 입니다");
						} else {
							System.out.println("연락처가 저장되었습니다");
							Call_DTO cd4 = new Call_DTO();
							cd4.setName(s5);
							cd4.setPhone_Num(s6);
							contact.add(cd4);
						}
					}
					
				} else if (mmm == 2) {
					show_Contact();
					System.out.println("삭제할 연락처를 선택하세요");
					System.out.print(">>> : ");
					
					int c = input.nextInt();
					if (c <= contact.size()) {
						String ss = contact.get(c - 1).getName();
						System.out.println(ss + "의 연락처를 삭제합니다");
						contact.remove(c - 1);
					} else {
						System.out.println("선택한 연락처는 존재하지 않습니다");
					}
					
				} else if (mmm == 3) {
					show_Contact();
				} else {
					System.out.println("잘못된 번호를 입력했습니다");
				}
				break;
				
			case "4":
				System.out.println("전화 어플을 종료합니다");
				bool = false;
				break;

			default:
				System.out.println("잘못된 번호를 입력했습니다");
				break;
			}
		}
		
	}
	
	
	private void show_Contact() {
		System.out.println("[번호]\t[이름]\t[연락처]");
		for (Call_DTO obj : contact) {
			System.out.print(contact.indexOf(obj) + 1 + "\t");
			System.out.print(obj.getName() + "\t");
			System.out.println(obj.getPhone_Num());
		}
	}
	
	private void show_Call_List () {
		System.out.println("[번호]\t[이름]\t[연락처]");
		for (Call_DTO obj : call_List) {
			System.out.print(call_List.indexOf(obj) + 1 + "\t");
			System.out.print(obj.getName() + "\t");
			System.out.println(obj.getPhone_Num());
		}
	}
	
	
	
}
