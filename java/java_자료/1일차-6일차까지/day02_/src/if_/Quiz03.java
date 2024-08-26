package if_;
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		//usb
		Scanner input = new Scanner(System.in);
		int usb,money=0;

		System.out.print("usb 구입 개수 입력 : ");
		usb = input.nextInt();
		if(usb > 0) {
			if(usb<10) 
				money = usb*5000;
			else if(usb >=10 && usb <100 )
				money = (usb*5000) - (usb*5000)/10;
			else
				money = (usb*5000) - (usb*5000)*12/100;
		}
		System.out.println("usb 총 가격 : "+money);
		
		
		//국, 영, 수
		int kor=0,eng=0,math=0,avr,sum;
		char ch;
		
		System.out.println("국어 점수 입력");    kor = input.nextInt();
		System.out.println("영어 점수 입력");    eng = input.nextInt();
		System.out.println("수학 점수 입력");    math = input.nextInt();
		
		sum = (kor+eng+math);	
		avr = sum/3;
		
		if(avr >= 60) {
			if(avr>=90) ch='A';
			else if(avr>=80) ch='B';
			else if(avr>=70) ch='C';
			else  ch='D';
			if(kor < 40)  System.out.println(kor+" : kor 불합격");  
			else if(eng < 40)  System.out.println(eng+" : eng 불합격");
			else if(math < 40)  System.out.println(math+" : math 불합격");
			else    System.out.println("합격 입니다");
		}else {
			ch = 'F'; 	System.out.println(avr+" : 평균 불합격");
		}
		System.out.println("국어 : "+kor);    System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math); System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avr);    System.out.println("등급 : "+ch);

		
		//비행기
		int time;
		money=30000;
		System.out.print("비행기 탄 시간(분): ");
		time = input.nextInt();
		time-=30;
		if(time>0){
			//money += (500+((time-1)/10)*5000);
			if(time%10 == 0)
				money=money+time/10*5000;
			else
				money=money+time/10*5000+5000;
		}
		System.out.println(time+"분 비행기 요금 : "+money+"원 입니다");
	}
}




