public class SchoolSystem {
	public static void main(String[] args){
		//creates user
		Student s1 = new Student("kofi", "password", 2, "10518900");
		//add courses
		s1.addCourse("Comp101");
		s1.addCourse("Stat101");
		//s1.addCourse("Admin105");
		//s1.addCourse("Admin105");

		System.out.println("the user name is " + s1.getUsername() 
						 +" the password is  " + s1.getPassword());

		Staff staff1 = new Staff("Yaa", "yaa", 3);

		s1.displayInfo();
		staff1.displayInfo();
	}
}
