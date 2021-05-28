package homework3;

public class InstucterManager  extends Instucter {
	
	public void addCoursevideos(Instucter instructor){
		
        System.out.println("video added successfully" );

    }
	public void addHomework(Instucter instructor){
        System.out.println("homework successfully added" );
    }
	
	public void add(Instucter instructor) 
	{
		System.out.println(instructor.getFirstName()+ " " +instructor.getLastName()+ " " + "trainer added");
	}
	
	
	public void login(Instucter instructor) 
	{
		System.out.println(instructor.getFirstName()+ " " + instructor.getLastName()+ " " + "the trainer has logged into the system");
	}
	
	public void logout(Instucter instructor) 
	{
		System.out.println(instructor.getFirstName()+ " " + instructor.getLastName()+ " " + "the trainer has logged out of the system.");
	}


}
