import java.util.Random;

public class Student {	
	//define attributes of the Student class
	private String firstName;
	private String lastName;
	private String programme;
	private String hall;
	private int age;

	//define methods of the class
	//special method called the constructor
	public Student(){} // default constructor

	public Student(String fname, String lname, String prog,String hall1,int age1){
		this.firstName = fname;
		this.lastName = lname;
		this.programme = prog;
    		this.hall = hall1;	
		this.age = age1;
	}

	//setter methods
	public void setFirstName(String fname){
		if( fname.equals(firstName)){
			System.out.println("Invalid Name");
		} else {
			this.firstName = fname;
		}
	} 

	public void setLastName(String lname){
		this.lastName = lname;
	}

	public void setProgramme(String programme){
		this.programme = programme;
	}

	public void setHall(String hall){
		this.hall = hall;
	}

	public void setAge(int age){
		this.age = age;
	}

	//getter methods
	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public String getProgramme(){
		return this.programme;
	}

	public String getHall(){
		return this.hall;
	}

	public int getAge(){
		return this.age;
	}

	//instance methods
	public void displayInfo(){
		System.out.println("------------------------------------------");
		System.out.println("\t\tStudent Info");
		System.out.println("First name : " + this.getFirstName());
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Programme: " + this.programme);
		System.out.println("CGPA : " + this.getCGPA());
		System.out.println("------------------------------------------");
	}

	private double getCGPA(){
		return ((Math.random() * (4 - 0)) + 1) + 0;
	}
	
}
