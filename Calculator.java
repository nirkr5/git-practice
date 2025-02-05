
/*
 * This program get 2 integers from the input and an operation symbol
 * Print the calculation
 * @author (Nir Krief)
 * @version (v1 , 28.01.2025)
 */
import java.util.Scanner;

public class Calculator {

    // Method to get input
    public static int getInput(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return scan.nextInt();
    }

    // Method to perform calculation
    public static double calculate(int num1, int num2, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("The operation is invalid.");
        }
        return result;
    }

    public static void main(String[] args) {
        // Get inputs
        int num1 = getInput("Please enter the first number:");
        char operation = getInput("Please enter +, -, *, or /:").toString().charAt(0);
        int num2 = getInput("Please enter the second number:");

        // Perform the calculation
        double result = calculate(num1, num2, operation);

        // Print the result
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
