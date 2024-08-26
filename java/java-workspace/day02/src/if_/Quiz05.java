package if_;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// 국,영,수학 점수를 입력 받아 평균이 60점 이상이고 각 점수가 40점 이상이면 합격,
		// 아니면 평균 불합격인지,과목 불합격인지 사유를 출력하고, 평균이 90이상이면 'A', 
		// 80이상 'B', 70이상 'C', 60미만이면 'F'를 출력하시오(출력: 불합격 또는 합격, 국, 영, 수, 합계 평균, 등급)
		
		Scanner input = new Scanner(System.in);
		
		int kor, eng, math;
		
		System.out.print("국어 점수: ");
		kor = input.nextInt();
		
		System.out.print("영어 점수: ");
		eng = input.nextInt();
		
		System.out.print("수학 점수: ");
		math = input.nextInt();
		
		int sum = kor + eng + math;
		int average = sum / 3;
		
		if(average >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
			System.out.println("합격입니다.");
			System.out.println("국어 점수: " + kor + "");
			System.out.println("영어 점수: " + eng + "");
			System.out.println("수학 점수: " + math + "");
			System.out.println("합계: " + sum);
			System.out.println("평균: " + average);
			
			
			if(average >= 90) {
				System.out.println("A등급입니다.");
			} else if(average >= 80) {
				System.out.println("B등급입니다.");
			} else if(average >= 70) {
				System.out.println("C등급입니다.");
			} else if(average >= 60) {
				System.out.println("D등급입니다.");
			} else {
				System.out.println("F등급입니다.");
			}
		
		} else {
			System.out.println("불합격입니다.");
			
			if(kor < 40 && eng < 40 && math < 40) {
				System.out.println("국어, 영어, 수학 점수 불합격입니다.");
			} else if(kor < 40) {
				System.out.println("국어 점수 불합격입니다.");
				
			} else if(math < 40) {
				System.out.println("수학 점수 불합격입니다.");
			} else {
				System.out.println("영어 점수 불합격입니다.");
			}
			
			System.out.println("국어 점수: " + kor + "");
			System.out.println("영어 점수: " + eng + "");
			System.out.println("수학 점수: " + math + "");
			System.out.println("합계: " + sum);
			System.out.println("평균: " + average);
			System.out.println("F등급입니다.");
		}
		
		// 강사님 풀이
//		int kor,eng,math,avr,sum;
//		char ch;
//		System.out.println("국어 점수 입력");    kor = input.nextInt();
//		System.out.println("영어 점수 입력");    eng = input.nextInt();
//		System.out.println("수학 점수 입력");    math = input.nextInt();
//		sum = (kor+eng+math);	avr = sum/3;
//		if(avr >= 60) {
//			if(avr>=90) ch='A';
//			else if(avr>=80) ch='B';
//			else if(avr>=70) ch='C';
//			else  ch='D';
//			if(kor < 40)  System.out.println(kor+" : kor 불합격");  
//			else if(eng < 40)  System.out.println(eng+" : eng 불합격");
//			else if(math < 40)  System.out.println(math+" : math 불합격");
//			else    System.out.println("합격 입니다");
//		}else {
//			ch = 'F'; 	System.out.println(avr+" : 평균 불합격");
//		}
//		System.out.println("국어 : "+kor);    System.out.println("영어 : "+eng);
//		System.out.println("수학 : "+math); System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+avr);    System.out.println("등급 : "+ch);
		
		input.close();

	}

}
