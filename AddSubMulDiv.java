
public class AddSubMulDiv {
	
	
	int add(int a,int b){
		int sum=a+b;
		return sum;
	}
	
	int sub(int a,int b){
		int diff=a-b;
		return diff;
	}
	
	int mul(int a,int b){
		int prod=a*b;
		return prod;
	}
	
	int div(int a,int b){
		int rem=a/b;
		return rem;
	}
	
	int div1(int a,int b){
		int rem=a%b;
		return rem;
	}
	
	
	public static void main(String[] args) {
		AddSubMulDiv obj=new AddSubMulDiv();
		System.out.println("Addition : "+obj.add(10,5));
		System.out.println("Subtraction : "+obj.sub(10,5));
		System.out.println("Multiplication : "+obj.mul(10,5));
		System.out.println("Quotient : "+obj.div(10,5));
		System.out.println("Remainder : "+obj.div1(10,5));
	}
	

}
