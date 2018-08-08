public class Staff extends User {
	private String staffId;
	private String officeNo;

	public Staff(String uname, String pass, int courses){
		super(uname, pass, courses);
		staffId = "456";
		officeNo = "45";
	}

	public void displayInfo(){
		System.out.println("\t\tUser info ");
		System.out.println("User Type : Staff");
		System.out.println("Staff Id : " + this.staffId);
		System.out.println("Username : " + this.getUsername());
		System.out.println("Password : " + this.getPassword());
	}
}
