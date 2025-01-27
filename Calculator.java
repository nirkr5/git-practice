
/*
 * This program get 2 integers from the input and an operation symbol
 * Print the calculation
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        double result = 0;
        char operation;
        // Getting the inputs
        System.out.println("Please enter the first num");
        num1 = scan.nextInt();
        System.out.println("Please enter + or -or * or '/'");
        operation = scan.next().charAt(0);
        System.out.println("Please enter the second num");
        num2 = scan.nextInt();
        // Print the exercise
        System.out.println("" + num1 + operation + num2 + "=");
        //switch(operation){}
        
        
        if(operation == '+')
            result = num1 + num2;
                else if(operation == '-')
               result = num1 - num2;
               else if(operation == '*')       
                  result = num1 * num2; 
                    else if(operation == '/')
                        result = (double)num1 / num2; 
          
        else
            System.out.println("The operation is invalid");
        System.out.println(result);
     
        
        
        
        
    }
}
