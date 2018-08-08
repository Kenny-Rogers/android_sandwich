public abstract class User {
	//attributes
	private String username;
	private String password;
	private String[] courses;
	private int lastCourseIndex;
	private int numberOfCourses;

	//methods
	//constructors
	public User(){}

	public User(String username, String password, int numberOfCourses){
		this.username = username;
		this.password = password;
		this.numberOfCourses = numberOfCourses;
		courses = new String[numberOfCourses];
		lastCourseIndex = 0;
	}

	//	getters
	protected String getUsername(){ 
		return this.username; 
	}

	protected String getPassword(){
		return this.password;
	} 

	public String[] getCourses(){
		String[] resultArray = new String[0];
		if( lastCourseIndex <= 0){
			//indicate an error
			System.out.println("there are no courses stored.");	
		} else {
		 resultArray = new String[lastCourseIndex];
		
		 for(int i = 0; i < lastCourseIndex; i++){
				// resultArray = courses[i]; or
				resultArray[i] = this.getCourseAtIndex(i);
			}
		}
		return resultArray;
	}

	public String getCourseAtIndex(int index){
		return courses[index];
	}	


	//setters 
	public void setUsername(String username){
		this.username = username;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public void addCourse(String course){
		if(numberOfCourses == lastCourseIndex){
			//indicate error
			System.out.println("No space left to store additional courses");
		} else {
			courses[lastCourseIndex] = course;
			lastCourseIndex++; // lastCourseIndex = lastCourseIndex + 1
		}
	}

	//instance methods
	public boolean login(String username, String password){
		if(username.equals(this.username) && password.equals(this.password)){
			return true;
		} else {
			return false;
		}
	}

	public abstract void displayInfo();
}
