public class Repititions {

    //main 
    public static void main(String[] args){
        System.out.println("Printing numbers with a do-while loop");
        //eg of do-while loop to print number from 1 to 10
        int count = 1; //variable declaration
        do{ 
            System.out.print(" " + count + " ");
            count = count + 1;//increament
        } while (count <= 10);//condition

        System.out.println("\n\nPrinting numbers with a while loop");

        //eg of while loop to print numbers from 100 to 0
        int index = 100;//variable declaration
        while (index >= 90){//condition
            System.out.print(" " + index + " ");
            index--;   //decreament (index = index - 1)
        }

        System.out.println("\n\nPrinting numbers with a for loop");
        //wg of for loop to print numbers from 50 to 60
        for(int i = 50; i <= 60; i++){
            System.out.print(" " + i + " ");
        }

        System.out.println("");
    }


}