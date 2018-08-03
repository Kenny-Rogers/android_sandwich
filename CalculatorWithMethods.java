import java.util.Scanner;

public class CalculatorWithMethods{
    
    public static void main(String[] args){
        Scanner inputScanner;
        inputScanner = new Scanner(System.in);


        displayBanner();

        System.out.print("Enter first number: ");
        double firstNumber = inputScanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = inputScanner.nextDouble();

        double result = add(firstNumber, secondNumber); //function calling

        System.out.println( firstNumber + " + " + secondNumber + " = " + result);

    }   
    
    //function definition
    private static double add(double num1, double num2){
        double answer;
        answer = num1 + num2;
        return answer;
    }

    //assignment:: write functions to perform subtraction, multiplication, division


    //method definition
    private static void displayBanner(){
        System.out.println("*******************************************");
        System.out.println("*\tFancy Calculator\t\t*");
        System.out.println("*******************************************");
    }
}