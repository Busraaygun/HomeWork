package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setStudentId(1);
		student1.setFirstName("Büşra");
		student1.setLastName("Aygün");
		student1.setPassword("25820");
		student1.setEmail("aygunbusra920@gmail.com");
		student1.setCourse("Java");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setStudentId(2);
		student2.setFirstName("Oğuzha");
		student2.setLastName("Ünlü");
		student2.setPassword("13579");
		student2.setEmail("oguzunlu@gmail.com");
		student2.setCourse("C#");
		
		Instucter  instructor1 = new Instucter();
		instructor1.setId(1);
		instructor1.setInstructorId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setPassword("12345");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setCourse("Java");
		
		Instucter  instructor2 = new Instucter();
		instructor2.setId(2);
		instructor2.setInstructorId(2);
		instructor2.setFirstName("Kerem");
		instructor2.setLastName("Varis");
		instructor2.setPassword("67899");
		instructor2.setEmail("keremvaris@gmail.com");
		instructor2.setCourse("C#");
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.login(instructor1);
		userManager.logout(instructor2);
		
		
		InstucterManager instructorManager = new InstucterManager();
		instructorManager.add(instructor1);
		instructorManager.login(instructor1);
		instructorManager.logout(instructor2);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.login(student1);
	    studentManager.logout(student1);
		
		
		
	}

}
