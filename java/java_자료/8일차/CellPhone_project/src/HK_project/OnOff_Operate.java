package HK_project;
import java.util.Scanner;
//전원
public class OnOff_Operate {
	private OnOff_DTO dto = new OnOff_DTO();
	private String flag="off";
	public void OnOff(){
		// 입출력
		String On = "on",Off= "off";
		//초기값은 off였다가 on으로 바꾼걸 다시 실행했을때 넣고 싶을때
		// 초기값이 null 이면 아래 사용
		//if(dto.getFlag()!=null) {

		//if(dto.getFlag().equals("on")) {
		//	dto.setFlag(On);
		//}else {
		//dto.setFlag(Off);
		//}
		//	}else {
		//		dto.setFlag(Off);
		//}

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("현재상태 : " + dto.getFlag());
			System.out.println("on/off를 선택해 주세요\n>>>");
			String button = scan.next();
			if(button.equals(On)){
				dto.setFlag(On);
				System.out.println("켜졌습니다");
			}else if(button.equals(Off)) {
				dto.setFlag(Off);
				System.out.println("꺼졌습니다");
			}else {
				dto.setFlag(flag);
				System.out.println("다시 입력 하세요");
				continue;

			}break;

		}
	}


}
