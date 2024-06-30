class java1{
    public static void main(String[] args){

        int i = 0;
        int j = 0;

        try{
            j = 18/i;
            System.out.println(j);
        }
        catch(Exception e){
            System.out.println("Something Went Wrong...." + e);
        }

        System.out.println("Bye");

    }
}

/*
================================================Notes=================================================================================
-- Exception handling is a mechanism in Java that allows developers to handle 
and recover from errors and exceptional conditions that may occur during the execution of a program. 
-- One way to handle exceptions in Java is by using the try-catch block.

General Syntax of try -catch to handle exception:
try {
    // code that may throw an exception
} catch (ExceptionType1 e1) {
    // code to handle the exception of type ExceptionType1
} catch (ExceptionType2 e2) {
    // code to handle the exception of type ExceptionType2
} finally {
    // optional block of code that is executed regardless of whether an exception was thrown or not
}

we will discussing about everything try, catch ,finally and ExceptionType one by one
-- in this lecture we are only deal with single catch statement with try


//  try to handle the exception 
class Main{
      public static void main(String[] args) {
         int i=4; //normal statement
         try{
               int a = 10/0; //critical statement
               /*Not handling excpetion then
               if you not handle the exception then it will be thrown to the JVM
               and JVM will terminate the program abnormally
               and it will not execute the remaining statements
               */
            
                 /*
                 if you handle the exception then it will not be thrown to the JVM
                 and JVM will not terminate the program abnormally
                 and it will execute the remaining statements
                 

         }catch(Exception e){
               System.out.println("Some exception occured");
         }
         System.out.println("We are coming out of the try catch block successfully");


      }
   
}
-- In the above code, the try block contains the code that may throw an exception. 
The catch block catches the exception of a specific type and handles it. 


-- statemtns of two types
 i)normal statements
 Normal Statements:
Normal statements are statements that do not require any special handling, and they are executed in a normal sequence.  
e.g Variable declarations and assignments: These statements are used to declare and assign values to variables.

 ii)critical statements
Critical statements are statements that can cause an exception or error, and they require special handling.  
Handle using :
throw statements: These statements are used to throw an exception.
try-catch statements: These statements are used to handle exceptions.
finally statements: These statements are used to specify a block of code that is always executed, whether an exception is thrown or not.
======================================================================================================================================          
*/