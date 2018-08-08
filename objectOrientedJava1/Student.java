public class Student extends User {
	private String id;
	private double gpa;

	public Student(String username, String password, int numberofCourses,String studId){
		super(username, password, numberofCourses);
		this.id = studId;
		this.gpa = 3.59;
	}

	public void displayInfo(){
		System.out.println("\t\tUser info ");
		System.out.println("User Type : Student");
		System.out.println("Username : " + this.getUsername());
		System.out.println("Password : " + this.getPassword());
		System.out.println("Student gpa : " + this.gpa);
	}

	public void registerCourse(String course){
		this.addCourse(course);
	}
}
