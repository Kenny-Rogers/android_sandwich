//including the Scanner class tobe able to read keyboard inputs from users
import java.util.Scanner;

public class Calculator{
	/* main method -- this is where program execution starts */
	public static void main(String[] args){
		//declaration of variables to be used
		Scanner inputReader;
		double num1, num2, answer;
		char operator;

		//initialize the variables
		inputReader = new Scanner(System.in);
		num1 = 0;
		num2 = 0;
		answer = 0;
		operator = ' ';
		boolean status;


		//Read user inputs
		System.out.println("************** Simple Calculator ****************\n");


		do {
			System.out.print("Enter first number: ");
			num1 = inputReader.nextDouble();

			System.out.print("Enter second number: ");
			num2 = inputReader.nextDouble();

			System.out.print("Enter operation: ");
			operator = inputReader.next().charAt(0);


			//perform operator
			if( operator == '+'){
				//case the operation entered is +	
				//answer = num1 + num2;
				answer = CalculatorWithMethods.add(num1, num2);
			} else if( operator == '-'){
				//case the operation entered is -
				answer = num1 - num2;
			} else if( operator == '*'){
				//case the operation entered is *
				answer = num1 * num2;
			} else if( operator == '/'){
				//case the operation entered is /
				answer = num1 / num2;	
			} else {
				System.out.println("Invalid operator entered");
			} 

			/*
			Displaying results
			 2 + 2 = 4
			*/	
			System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);

			System.out.print("Do you want to perform another operation? [YES/no]");
			String checkAnswer = inputReader.next();					
			status = false;			
				
			/* variable = (condition) ? value of variable if condition is met : 
				value of variable if condition is not met
			*/
			status = checkAnswer.equals("YES") ? true : false;

		} while(status);
	}
}
