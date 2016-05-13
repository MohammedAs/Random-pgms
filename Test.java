
class NegativeNumberException extends Exception
{	
	 public NegativeNumberException()
	 {
	    
	 }
	public String getMessage()
	{
		return "Negative Number Error";
	}
}

class MyClass
{
	void showSquare(int num)throws NegativeNumberException
	{
		if(num<0)
		{
			throw new NegativeNumberException();
		}
		System.out.println("Square= "+(num*num));
	}
}
public class Test
{
	public static void main(String[] args) {
		MyClass m=new MyClass();
		try
		{
			m.showSquare(-5);
		}
		catch(NegativeNumberException e)
		{
			//System.out.println("Negative Number Error");
			System.out.println(e.getMessage());
		}
	}
}