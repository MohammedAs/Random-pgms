
public class Parent {
	
	int a;
	Parent(int a)
	{
		this.a=a;
		System.out.println("Parent Constructor");
		a=10;
	}

}
 class Child extends Parent{
	
	int b;
	Child()
	{
		super(20);
		System.out.println("Inside Child Class");
		b=40;
	}
	
}
