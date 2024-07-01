import java.util.Scanner;

class java1{
    public static void main(String[] args){

        System.out.print("Enter the number -> ");
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        System.out.println(num);
    }
}

/*
================================================Notes=================================================================================
    1. In Java, the Scanner class is used to read input from various sources, including the keyboard, files, and other input streams. 
       It provides methods to parse primitive types and strings using regular expressions.

    2. The Scanner class can read and parse different types of input, such as integers, floating-point numbers, and strings. 
       For example, you can use nextInt() to read an integer and nextLine() to read a string.

    3. The Scanner class provides a simple and convenient way to handle input. It automatically breaks input into tokens using 
       whitespace as the default delimiter. You can also specify custom delimiters if needed.

    4. When reading input, the Scanner class handles input conversions and parsing internally, reducing the need for explicit type 
       conversions. For instance, nextInt() automatically converts the input to an integer, and nextDouble() converts it to a double.

    5. The Scanner class can be used to read input from various sources, such as the standard input stream (System.in), files, 
       and strings. This flexibility makes it a versatile choice for handling input in different scenarios.

    6.Like other input resources, it is important to close the Scanner object when it is no longer needed to free up system resources. 
      The close method is used to close the Scanner.

    7. It is good practice to handle potential exceptions when using the Scanner class, such as InputMismatchException, which can
       occur if the input does not match the expected type.
======================================================================================================================================          
*/