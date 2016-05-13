
import java.util.Scanner;

public class UserInterface 
{
	private static Scanner sc=new Scanner(System.in);
	private static StudentScheduler studSch=new StudentScheduler();
	public static void main(String[] args) 
	{
		showMenu();
		
	}

	private static void showMenu() 
	{
		int choice;
		while(true)
		{
			System.out.println("1.Add Student");
			System.out.println("2.Show all Students");
			System.out.println("3.Search by Roll Number");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: acceptStudentDetails();
						break;
				case 2: showAllStudentDetails();
						break;
				case 3: showByRollNumber();
                		break;
				case 4: System.exit(0);
				
			}
		}
		
	}
	
	private static void acceptStudentDetails() 
	{
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		int index=studSch.searchByRollNumber(rollNumber);
        if(index!=-1)
        {
             System.out.println("Roll Number already exist");
        }
        else
        {
			System.out.println("Enter name");
			String name=sc.next();
			
			System.out.println("Enter the no. of courses: ");
			int num=sc.nextInt();
			
			String[] courseName=new String[num];
			System.out.println("Enter the "+num+ " courses: ");
			for(int i=0;i<num;i++)
			{
				courseName[i]=sc.next();
			}
			
			for(int i=0;i<num;i++)
			{
				System.out.println(courseName[i]);
			}
			System.out.println(studSch.addStudent(rollNumber, name, courseName));
		}
	}
		
	private static void showAllStudentDetails() 
	{
		studSch.showAllStudents();
		
	}
	
	private static void showByRollNumber() 
	{
        System.out.println("Enter Roll number For search");
        int rollNumber=sc.nextInt();
        studSch.showByRollNumber(rollNumber);   
  }
}
