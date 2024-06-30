class HumariException extends Exception{

    public HumariException(String str){
        super(str);
    }
}

class java1{
    public static void main(String[] args){

        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
                throw new HumariException("I don't want to Print Zero");
            }
        }
        catch(HumariException e){
            j = 18/1;
            System.out.println("That's the default output " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong " + e);
        }
        
        System.out.println(j);
        System.out.println("Bye");

    }
}

/*
================================================Notes=================================================================================
    1. How to create custom exception in java?

       class MyException extends Exception{
          // this class is own exception class defined by according to our need
       }

       -- MyException is a custom exception class that extends the Exception class.

    2. Now we want to pass some message 
       -- we need a constructor that takes a String message, which is passed to the parent constructor using the super keyword.
       e.g -
       public class MyException extends Exception {
           public MyException(String message) {
               super(message);
           }
       }

       Note: we can add additional properties and methods to your custom exception class as needed, just like you would with any other Java class.

    3. As per need we can throw custom Exception
       e.g
       public class Main{
          public static void main(String []args){
             try{
                throw new NavinException("This is my exception");
             }catch(NavinException e){
                System.out.println(e.getMessage());
             }
          }
        }

        class NavinException extends Exception{
          public NavinException(String s) {
             super(s);
          }
       }

       Important Notes:
       -- we can create a custom exception by extending the Throwable class in Java 
       -- we can create a custom exception by extending the Exception class in Java
       -- we can create a custom exception by extending  the Exception class or one of its subclasses, such as RuntimeException.

       Recommended:
       -- Generally recommended to create custom exceptions by extending the Exception class or one of its subclasses, such as RuntimeException. 
       This makes it easier to handle your exception in a specific way and ensures that it behaves like other exceptions in the Java platform.

       -- it is not recommended create custom exception using Throwable, the Throwable class is typically used to create other types of exceptions, 
       such as errors and checked exceptions, rather than custom exceptions.
======================================================================================================================================          
*/