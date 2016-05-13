
public class Sample2 
{
	public static void main(String[] args) 
	{
		try
		{
			
			System.out.println("First");
			System.out.println("Inside 1st try");
			
			try
			{
				System.out.println("Second");
				int a=50,b=0,c;
				c=a/b;//get an Arithmetic Exception
				System.out.println("Inside 2nd try");
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
				System.out.println("Inside Null Catch");//error msg1
			}
			System.out.println("Third");
		}
		catch(ArithmeticException e)
		{
			int a=50,b=2;
			int c=a/b;//error msg2
			System.out.println(c);
		}
		System.out.println("Last message of main");
		
		@override
		protected void finalize() throws Throwable
		{
		    System.out.println("Program ended");
		}
	}
}
