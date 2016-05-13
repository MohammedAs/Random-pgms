
public class Sample1
{

    public static void main(String[] args)
    {
        try
        {
        	 String s1 = null;
             s1.charAt(2);
        } 
        catch (NullPointerException e) 
        {
            System.out.print("Caught the NullPointerException");
        }
    }
}
