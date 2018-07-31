import java.util.Scanner; //imports Scanner library

public class DataTypesAndVariables {

    //this is a declaration of the main method
    public static void main(String[] args){
        /*
         This class looks at how to declare variables and make use of
         variables and datatypes. 
        */
       
        //working with integers
        int first_grade; //variable declaration
        first_grade = 50; //variable assignment

        int second_grade;
        second_grade = 60;

	//joint declaration and assignment statement
	int total = first_grade + second_grade;

        System.out.println("The first grade is " + first_grade + 
                           " and the second grade is " + second_grade +
			   " and the total grade is " + total );

	//creating an object of the scanner class
	Scanner inputScanner = new Scanner(System.in);
	
	//prints prompt to user to enter a number
	System.out.print("Enter first number: ");
	//accepts the user input into variable "first_grade"
	first_grade = inputScanner.nextInt();
	
	System.out.print("Enter second number: ");
	second_grade = inputScanner.nextInt();

	//adds the two inputs and stores it in another variable total
	total = first_grade + second_grade;

	//displays inputs and total
	 System.out.println("The first grade is " + first_grade + 
                           " and the second grade is " + second_grade +
			   " and the total grade is " + total );	

	/*Working with doubles*/	
	System.out.print("Enter first decimal number: ");
	double first_decs = inputScanner.nextDouble();

	System.out.print("Enter second decimal number: ");
	double second_decs = inputScanner.nextDouble();

	double total_decs =  first_decs + second_decs;

	System.out.println("The first grade is " + first_decs + 
                           " and the second grade is " + second_decs +
			   " and the total grade is " + total_decs );	

    }    
}
