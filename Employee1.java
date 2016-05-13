
public class Employee1 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		
		if(age<1)
		{
			System.out.println("Age is invalid");
		}
		else
		{
			System.out.println("Age is valid");
		}
	}
	
	

}
