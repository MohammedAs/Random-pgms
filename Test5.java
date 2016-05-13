
public class Test5 {
	int a;
	
	Test5(int a)
	{
		System.out.println("From Constructor");
		this.a=a;
	}
	public static void main(String[] args) {
		
		Test5 obj=new Test5(10);
		System.out.println(obj.a);
	}
}
