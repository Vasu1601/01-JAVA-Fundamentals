import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class java1{
    public static void main(String[] args){

        System.out.println("Enter a Number -> ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        try{
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
            bf.close();
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
    1. In Java, the InputStreamReader class is used to read data from an input stream and convert it into characters. It acts as a 
       bridge between byte streams and character streams, allowing you to read characters from an input stream.

    2. The BufferedReader class is often used with InputStreamReader to provide a buffered way to read characters from an input stream. 
       This improves efficiency by reducing the number of read operations performed on the input stream.

    3. Using BufferedReader, you generally get strings as input. If you need to take an integer input, you can explicitly convert the 
       string to an integer using Integer.parseInt. This method parses the string argument as a signed decimal integer.

    4. BufferedReader is a versatile resource that allows you to take input from various sources, including files and external resources. 
       This makes it a flexible option for reading data in different scenarios.

    5. Since BufferedReader is a resource, it is important to close it after use to release the system resources associated with it. 
       The close method is used to close the BufferedReader and free up any resources it is using.

    6. It's good practice to use a try-with-resources statement to ensure that the BufferedReader is closed automatically after the 
       operations are complete, even if an exception occurs.
======================================================================================================================================          
*/