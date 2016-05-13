import java.util.Scanner;
public class Test6 {
	public static void main(String[] args) {
		
		
		int[] arr=new int[5];
		int sum=0;
		Scanner s1=new Scanner(System.in);

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the nums");
			arr[i]=s1.nextInt();	


			sum=sum+arr[i];
			
		}
		System.out.println(sum);
	}

}
