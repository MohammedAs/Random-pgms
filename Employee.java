
public class Employee {
	int a;  //instance variable
	byte b;
	short s;
	long l;
	float f;
	double d;
	boolean boo;
	char c;
	
	public static void main(String[] args) {
		
		Employee obj=new Employee();
		System.out.println("int = "+obj.a);
		System.out.println("byte = "+obj.b);
		System.out.println("short = "+obj.s);
		System.out.println("long = "+obj.l);
		System.out.println("float = "+obj.f);
		System.out.println("double = "+obj.d);
		System.out.println("boolean = "+obj.boo);
		System.out.println("char = "+obj.c);
	}
	

}
