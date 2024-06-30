class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}

class java1{
    public static void main(String[] args){
        A obj = new A();

        try{
            obj.show();
            System.out.println("This is try");
        }
        catch(ClassNotFoundException e){
            System.out.println("Something went wrong.. -> " + e);
        }

    }
}

/*
================================================Notes=================================================================================
    1. -- throws is not plural of throw 
       -- throws keyword is used in method signatures to indicate that the method may throw certain types of exceptions.
       but does not handle them directly
       -- the caller of the method is responsible for catching and handling the exception.

    2. Best case to use the throws keyword instead of handling with try and catch:
       -- throws keyword can be an appropriate way to handle exceptions in certain cases, such as when a method is part of a larger 
       program and the exception handling is being handled at a higher level. It can also be useful when creating reusable code that may 
       be used in a variety of contexts, where it's not clear how the exceptions should be handled.

       e.g 
       suppose you have three methods c , b and a and both have same Arithmetic Exception and b and a method call from c method.
       in this case you can duck the exceptions and handle in the c methods.

       void c(){
       try{
       a();
       b();
       }
       catch(ArithmeticException e){
       }
       }

       void a() throws ArithmeticException{}
       void b() throws ArithmeticException{}

       -- ducking exception most recommended for checked exception than unchecked exception
       -- throws keyword in Java is typically used to declare that a method may throw one or more 
       checked exceptions. Checked exceptions are exceptions that must be either caught or declared in the method 
       signature using the throws keyword. Examples of checked exceptions in Java include IOException, SQLException, 
       and ClassNotFoundException.


       Syntax to throws one or more Exception:

       public void myMethod() throws IOException, SQLException {
         // Method code that may throw either an IOException or a SQLException
       }

 
        Important: it's best to handle exceptions at the lowest possible level of the code where 

       suppose we have main() method inside main method we call c() method and inside c method we call a() method and in 
       a() method exception originate and we cannot handle with try and catch then propagate to c() method and if not handled 
       propagate to main method and if not handled in main method then the default exception handler handles the exception and 
       abnormally terminate the program.

    3. In java how exceptions propagate
       In Java, when an exception is thrown but not handled by the current method, the exception is propagated up 
       the call stack until it is either caught and handled by a try-catch block, or it reaches the top level of 
       the program and the program terminates.

       The order of transferring unhandled exceptions in Java is as follows:

       The current method throws an exception.
       i)If there is a try-catch block within the current method that can handle the exception, 
       the exception is caught and handled within that block. Control then passes to the code 
       following the catch block.

       ii)If there is no try-catch block within the current method that can handle the exception, 
       the exception is propagated up to the calling method.

       iii)Steps 2 and 3 repeat until either the exception is caught and handled by a try-catch block, 
       or it reaches the top level of the program.

       iv)If the exception reaches the top level of the program without being caught and handled,

       v)in this case 
       If an exception is not handled by any method in the call stack, and there is no catch block that can handle the exception, 
       then the default exception handler in Java is called to handle the exception.

       -- default exception handler in Java is part of the JVM (Java Virtual Machine) and is responsible for printing the exception 
       information to the console or to a log file, and terminating the program.

       -- the default exception handler is called, it prints a stack trace that shows the sequence of method calls that led up to the 
       exception, as well as any other relevant information about the exception.
======================================================================================================================================          
*/