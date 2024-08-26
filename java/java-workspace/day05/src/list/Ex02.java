package list;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		// 첫번째 소문자인 타입은 기능(메소드)이없고, 첫번째가 대문자인 타입은 기능(메소드)이 있다. (배열은 예외임) 
		// 변수명 쓰고 (".") 연산자를 쓰면 기능(메소드)을 확인 할수있다.
		
		// System.out.println(arr.add("1111")); // .add 는 데이터를 넣고 결과값은 boolean 값으로 반환함.
		// System.out.println(arr.get(0));
		boolean bool = arr.add("1111"); // 이런식으로 boolean 으로 값을 받을수도 있다.
		String s = arr.get(0);
		s += "수정";
		System.out.println(s);
		
		/*
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int i = input.nextInt();
		*/
		
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		
		//.contains(Object) : 검색 기능이라고 생각하면됨.  
		// object 값이 들어가야되는거면 아무값이나 넣어도 된다. true, false 로 반환
		System.out.println(arr.contains("222")); 
		System.out.println(arr.contains("없는값"));
		
		boolean b = arr.contains("특정 값");
		if(b) { // b == true
			System.out.println("존재합니다.");
		} else {
			System.out.println("존재하지 않습니다!!!!");
		}
		
		
		// .remove(index) : 데이터 삭제 -> 삭제하고싶은 인덱스 입략히면 삭제 
		System.out.println("삭제 전: " + arr);
		System.out.println(arr.remove(0)); // 삭제후 뒤에 있는 값들이 앞으로 당겨짐 
		System.out.println("삭제 : " + arr); 
		System.out.println(arr.size());
		// System.out.println(arr.remove(5)); // 존자하는 인덱스가 없으면 에러뜸(해결방법은 예외처리하면됨) 
		
		// 우선적으로 예외처리하기전에 에러를 잡고 싶으면 아래와 같이 작성하면된다.
		if(arr.size() > 5) {
			 System.out.println(arr.remove(5)); 
		}
		
		System.out.println("-----------------------");
		 // .remove(Object) : 는 값으로 넣을수 있다. true, false 로 반환 
		System.out.println(arr.remove("222"));
		System.out.println(arr.remove("없는 값 "));
		
	}

}
