
public class StudentScheduler 
{	
	private Student[] students=new Student[10];
	private int counterStudent;//no need to create a new object each time, so "Count"
	
	public String addStudent(int rollNumber, String name, String[] courseName)
	{
		students[counterStudent++]=new Student(rollNumber, name, courseName);
		return "Student added Successfully";
		
	}
	
	public void showAllStudents()
	{
		for(int i=0;i<counterStudent;i++)
		{
			System.out.println(students[i].getName());
			System.out.println(students[i].getRollNumber());
		
			for(int j=0;j<students[i].getCourseName().length;j++)
			{
				System.out.println(students[i].getCourseName()[j]);
			}
		}
	}
	
	
	public void showByRollNumber(int rollNumber)
	{
		int index=this.searchByRollNumber(rollNumber);
        
        if(index!=-1)
        {     
        	System.out.println("Details of "+rollNumber+" :");
        	//System.out.println(students[i].getName());     
        	for(int j=0;j<students[index].getCourseName().length;j++)
        	{
                  System.out.println(students[index].getCourseName()[j]);
             }
        }
        else
        {
             System.out.println("No such Roll no");
        }
  }
  
  public int searchByRollNumber(int rollNumber)
  {
             for(int i=0;i<counterStudent;i++)
             {
             if(students[i].getRollNumber()==rollNumber)
             {
                  return i;
             }
        }
        
        return -1;
  }
}
