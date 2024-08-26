package variable_;

public class TestClass01 
{
	public String name = "홍길동";
	public int i;
	public void test3() {
		for(; i < 10 ;i++) {
			System.out.println(i);
		}
		System.out.println("test3 : "+name);
		name = "변경";
	}
	public void test4() {
		System.out.println("test4 : "+name);
	}
	
	public void test1() 
	{
		int var = 100;
		System.out.println("test1 : "+var);
		test2( var );
	}
	public void test2( int var ) 
	{
		System.out.println("test2 : "+var);
	}
}
