public class RegisterSystem {
	
	public static void main(String[] args){
		//create an object of the student class
		Student s1 = new Student("Prosper", "Dey", "Admin", "Common", 16); 
		//assessing the firstName attribute of student object (s1) = s1.firstName 
		//System.out.println("First Name is " + s1.firstName);
		
		//modifying student object
		s1.setFirstName("Kofi");
		s1.setAge(25);


		String firstName = s1.getFirstName();

		s1.displayInfo();
		//String displayString = "New first name is " + firstName + "and age is " 
		//			+ s1.getAge();
		//System.out.println(displayString);


		//creating an object using the default constructor
		Student s2 = new Student();
		//setting the attributes of new object s2
		s2.setFirstName("Ama");
		s2.setLastName("Mensah");
		s2.setHall("Sarbah");
		s2.setProgramme("Computer Science");
		s2.setAge(20);
		
		s2.displayInfo();
		//System.out.println("Second Student is " + s2.getFirstName());

		
	}
}
