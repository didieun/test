package method_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizOp01 {
	//1.이름 입력 받아 출력
	public String inputName() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("이름 입력");
		name = input.next();
		return name;
	}
	public void printName(String n) {
		System.out.println("입력 이름 : "+n);
	}

	//2. 3개의 이름을 입력받아 출력(배열)
	public String[] inputArrName() {
		System.out.println("---- 3개 이름 입력 ----");
		Scanner input = new Scanner(System.in);
		String[] name = new String[3];
		for(int i=0 ; i < name.length ; i++) {
			System.out.println(i+".이름 입력");
			name[i] = input.next();
		}
		return name;
	}
	public void printArrName(String[] n) {
		System.out.println("입력 이름(배열)");
		for(String s : n) {
			System.out.println( s );
		}
	}

	//3. 두 수의 합(배열)
	public int[] inputData() {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[2];
		System.out.println("---- 두 수 합(배열) ----");
		System.out.println("1 수 입력");
		arr[0] = input.nextInt();
		System.out.println("2 수 입력");
		arr[1] = input.nextInt();
		return arr;
	}
	public int operator(int[] arr) {
		return arr[0] + arr[1];
	}
	public void printNum(int n1, int n2, int sum) {
		System.out.println(n1 + " + " + n2 + " = "+ sum);
	}

	//4. 두 수의 합(List)
	public ArrayList<Integer> inputList() {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("---- 두 수 합(List) ----");
		System.out.println("1 수 입력");
		int num = input.nextInt();
		arr.add(num);
		System.out.println("2 수 입력");
		arr.add( input.nextInt() );
		return arr;
	}
	public int operatorList(int n1, int n2) {
		return n1 + n2;
	}
	public void printList(int sum, ArrayList<Integer> arr) {
		System.out.println(arr.get(0) + " + " + arr.get(1) + " = "+ sum);
	}

	//5. 두 수의 합(Map)
	public HashMap inputMap() {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("---- 두 수 합(Map) ----");
		System.out.println("1 수 입력");
		int num = input.nextInt();
		map.put("n1", num);
		System.out.println("2 수 입력");
		map.put("n2" , input.nextInt() );
		return map;
	}
	public int operatorMap(HashMap<String, Integer> map ) {
		return map.get("n1") + map.get("n2");
	}
	public void printMap(int sum, HashMap map) {

		System.out.println(map.get("n1") + " + " + map.get("n2") + " = "+ sum);
	}
}




