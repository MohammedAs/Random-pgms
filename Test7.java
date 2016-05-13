
import java.util.Scanner;
public class Test7 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll no:");
		int rollno=sc.nextInt();
		
		System.out.println("How many courses do you want to register?");
		int course=sc.nextInt();
		
		String[] arr=new String[course];
		System.out.println("Enter the courses.");
		for(int i=0;i<course;i++)
		{
			 arr[i]=sc.next();
			
		
		}
		System.out.println("Roll no.: "+rollno);
		System.out.println("No. of courses: "+course);
		for(int i=0;i<course;i++)
		{
			System.out.println("               "+arr[i]);
		}

		
		
	}

}