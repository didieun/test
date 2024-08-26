package method_;

import java.util.ArrayList;
import java.util.HashMap;
public class QuizMain01 {
	public static void main(String[] args) {
		//1.이름 입력 받아 출력
		QuizOp01 quiz = new QuizOp01();
		String name = quiz.inputName();
		quiz.printName( name );

		//2. 3개의 이름을 입력받아 출력(배열)
		String[] nameArr = quiz.inputArrName();
		quiz.printArrName(nameArr);

		//3. 두 수의 합(배열)
		int[] arrNum = quiz.inputData();
		int sum = quiz.operator( arrNum );
		quiz.printNum(arrNum[0],arrNum[1],sum);

		//4. 두 수의 합(List)
		ArrayList<Integer> list = quiz.inputList();
		int result = quiz.operatorList(list.get(0), list.get(1) );
		quiz.printList(result, list);

		//4. 두 수의 합(Map)
		HashMap<String, Integer> map = quiz.inputMap();
		int mapSum = quiz.operatorMap( map );
		quiz.printMap(mapSum, map);
	}
}








