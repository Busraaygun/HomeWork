package homework3;

public class UserManager extends User {
	
	public void add(User user) 
	{
		System.out.println(user.getFirstName()+ " " + user.getLastName()+ " " + "The user has been added to the system.");
	}

	
	public void login(User user) 
	{
		System.out.println(user.getFirstName()+ " " + user.getLastName()+ " " + "The user logged into the system.");
	}
	
	public void logout(User user) 
	{
		System.out.println(user.getFirstName()+ " " + user.getLastName()+ " " + "The user has logged out of the system.");
	}
}
