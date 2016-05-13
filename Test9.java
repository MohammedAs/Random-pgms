import java.util.Scanner;

public class Test9 {
	
	public static void main(String[] args) {
		
		Student[] st=new Student[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();
			
			System.out.println("Enter the roll no.: ");
			st[i].setRollNumber(sc.nextInt());
			
			System.out.println("Enter the name: ");
			st[i].setName(sc.next());
			
			System.out.println("Enter the no. of courses: ");
			int course=sc.nextInt();
			
			String[] courseName=new String[course];
			System.out.println("Enter the courses: ");
			for(int j=0;j<course;j++)
			{
				courseName[j]=sc.next();
			}
			st[i].setCourseName(courseName);
			
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Names: "+st[i].getName());
			System.out.println("Roll no.: "+st[i].getRollNumber());
		}
			
		
	}

}
