
/**
 * Topic: Java Basics
 * Description: Introduction to printing output, basic patterns,
 *              variables, arithmetic operations, and data types.
 */
public class _01Hello {

    public static void main(String[] args) {

        // 1. Printing output in Java

        // println() prints the text and moves the cursor to the next line.
        System.out.println("Hello world");

        // print() prints the text without automatically moving to the next line.
        // \n is an escape sequence used to move the cursor to a new line.
        System.out.print("Hello world\nhello\n");

        // \n\n adds two newline characters, leaving a blank line.
        System.out.print("Hello world\n\n");


        // 2. Basic pattern printing

        // Printing a decreasing pattern of stars.
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");


        // 3. Variables in Java

        // A variable stores a value of a particular data type.
        int a = 10;
        int b = 20;

        // Updating the value of an existing variable.
        a = 50;

        // 4. Sum of two numbers

        // The + operator adds the values of a and b.
        int sum = a + b;

        // The + operator also joins text and variable values.
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);


        // 5. Data types in Java

        // Java has 8 primitive data types.

        // Integer types
        byte age = 20;                  // 8-bit integer
        short year = 2026;              // 16-bit integer
        int salary = 300000;            // 32-bit integer
        long population = 800000000L;   // 64-bit integer; L indicates a long literal

        // Floating-point types
        float price = 12.5f;             // 32-bit floating-point number; f indicates a float literal
        double pi = 3.14159;             // 64-bit floating-point number

        // Character type
        char grade = 'A';                // Stores a single character using single quotes

        // Boolean type
        boolean isJavaEasy = true;       // Stores either true or false

        // Reference type
        String language = "Java";        // Stores a sequence of characters using double quotes

    }
}
