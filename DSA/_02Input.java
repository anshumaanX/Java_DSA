
import java.util.Scanner;

/**
 * Topic: Taking Input in Java
 * Description: Reading user input, performing arithmetic operations,
 *              and calculating the area of a circle.
 */
public class _02Input {

    public static void main(String[] args) {

        // 1. Creating a Scanner object to take input from the user.
        // System.in represents standard input (usually the keyboard).
        Scanner sc = new Scanner(System.in);


        // 2. Taking string input

        System.out.print("Enter your name: ");

        // nextLine() reads the entire line of text entered by the user.
        String name = sc.nextLine();

        System.out.println("You entered: " + name);


        // 3. Taking integer input and performing arithmetic operations

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); // Reads the first integer.

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt(); // Reads the second integer.

        // Performing addition and multiplication.
        int sum = num1 + num2;
        int product = num1 * num2;

        // Displaying the results.
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);


        // 4. Calculating the area of a circle

        // Formula: Area = pi * radius * radius
        System.out.print("Enter radius of a circle: ");
        float radius = sc.nextFloat(); // Reads a decimal number.

        // Using 3.14 as an approximate value of pi.
        float area = 3.14f * radius * radius;

        System.out.println("Area of the circle is: " + area);


        // 5. Closing the Scanner
        // Releases the resource used by Scanner.
        sc.close();
    }
}
