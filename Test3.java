

class InsufficientBalanceException extends Exception
{	
	 public InsufficientBalanceException(String message)
	 {
	    super("no sufficient balance");
	 }
	/*public String getMessage()
	{
		return "no sufficient balance";
	}*/
}

class MyClass
{
	void withdraw(double amount,double bal)throws InsufficientBalanceException
	{
		bal=amount-bal;
		if(bal<amount)
		{
			throw new InsufficientBalanceException("no sufficient balance");
		}
		System.out.println("Balance");
	}
}
public class Test3
{
	public static void main(String[] args) {
		MyClass m=new MyClass();
		try
		{
			m.withdraw(1000.0,500.0);
		}
		catch(InsufficientBalanceException e)
		{
			//System.out.println("Negative Number Error");
			System.out.println(e.getMessage());
		}
	}
}