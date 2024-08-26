package method;

import java.util.ArrayList;
import java.util.HashMap;

class TestClass08 {
	
	public int[] test1() {
		
		int num = 10, n = 20;
		int[] arr = {num, n};
		
		return arr;
		
	}
	
	public HashMap<String, Integer> test2(ArrayList<Integer> a) {
	
		System.out.println("--------- test2 ----------");
		System.out.println(a.size());
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println();
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("num", a.get(0) + 100);
		map.put("su", a.get(1) + 100);
		
		return map;
	}
}

public class MainClass08 {

	public static void main(String[] args) {
		
		TestClass08 t = new TestClass08();
		
		int[] a = t.test1();
		
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println();
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		
		HashMap<String, Integer> m = t.test2(arr);
		System.out.println("----- main -----");
		System.out.println(m);	

	}

}
