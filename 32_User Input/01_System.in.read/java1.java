import java.io.IOException;

class java1{
    public static void main(String[] args){

        System.out.println("Enter a Number -> ");

        try{
            int num = System.in.read();
            System.out.println(num);
        }
        catch(IOException e){
            System.out.println("Please Give a valid Input " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong... " + e);
        }

    }
}

/*
================================================Notes=================================================================================
    1. System.out is an instance of PrintStream used for printing output to the console, and the println method is a member of 
       PrintStream that prints a line of text to the console.
    
    2. System.in is an instance of InputStream used for reading input from the user, and the read method of InputStream reads a single
       byte of data from the input stream.

    3. System.in.read() returns an integer value that represents the ASCII value of the character read. This method reads the next 
       byte of data from the input stream, which is usually the keyboard.
    
    4. Since System.in.read() may throw an IOException, it needs to be handled properly. You can handle exceptions using a try-catch
       block to catch and manage any potential IOException.

    5. It is generally recommended to use try-catch blocks for exception handling in production code. Using throws with the main 
       method is not recommended for production code as it passes the exception handling responsibility to the calling method, 
       which might not be practical.
======================================================================================================================================          
*/