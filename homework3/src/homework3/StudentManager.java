package homework3;

public class StudentManager  extends Student {
	
	public void add(Student student) 
	{
		System.out.println(student.getFirstName()+ " "+student.getLastName()+" "+ "The student named registered in the system.");
	}
	
	
	
	public void login(Student student) 
	{
		System.out.println(student.getFirstName()+ " " + student.getLastName()+ " " + "student named logged into the system.");
	}
	
	public void logout(Student student) 
	{
		System.out.println(student.getFirstName()+ " " + student.getLastName()+ " " + "student named logged out of the system.");
	}

}
