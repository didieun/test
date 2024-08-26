package cellphone;

import java.util.ArrayList;
import java.util.Iterator;

public class Message_DTO {
	ArrayList<String> messages = null;
	ArrayList<String> numbers = null;
	
	public ArrayList<String> getMessages() {
		return messages;
	}
	public void setMessage(ArrayList<String> sentMessages) {
		this.messages = sentMessages;
	}
	public ArrayList<String> getNumbers() {
		return numbers;
	}
	public void setNumbers(ArrayList<String> numbers) {
		this.numbers = numbers;
	}
	
	public void showMessages() {
		Iterator<String> it = this.messages.iterator(); 
		int i = 1;
		while(it.hasNext()) {
			String m = it.next();
			System.out.println("<" + i++ + ">" + ". 문자내용: " + m 
					);
		}
	}
	public void showNumbers() {
		Iterator<String> it = this.numbers.iterator();
		int i = 1;
		while(it.hasNext()) {
			String n = it.next();
			System.out.println( "<" + i++ + ">" + ". 번호: " + n );
		}	
	}
}
