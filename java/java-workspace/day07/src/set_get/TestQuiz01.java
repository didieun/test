package set_get;

public class TestQuiz01 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int age() {
		
		this.age -= 1;
		
		return age;
		
	}
	
}
