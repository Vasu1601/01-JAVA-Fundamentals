import java.util.*;
class java1{
    public static void main(String[] args){

        int i = 2;
        int j = 0;

        String str = null;

        int[] arr = new int[5];

        try{
            j = 18/i;

            System.out.println(str.length());

            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Can't Devide By Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Be In your limit");
        }
        catch(Exception e){
            System.out.println("Something went wrong -> " + e);
        }

        System.out.println("Bye");
    }
}

/*
================================================Notes=================================================================================
 --In Java, the try-catch block is used to handle exceptions. It allows you to write code that handles exceptions that may be thrown during the execution of your program. 
 we can also handle different types of exceptions with multiple catch blocks.

 -- suppose we write few lines of code and we donot know which line can generate exception but 
 we know donot which types of exception can be generated. In this case we can use try with multiple catch 
 e.g

 int num=4;
 int arr[]={3,4,5};
 try{
   int result=40/num; //we donot know what does user pass the value of num then we put inside try 
   System.out.println(arr[result]); //we donot know what the value of result but we know index of array allowed is 0 to 2 therefore we put this statement also in try 
 }
 catch(ArithmeticException ae){
   System.out.println(ae);
 }

 catch(ArrayIndexOutOfBoundsException aio){
   System.out.println(aio);
 }

#
Handling parents and child Exception both
-- when catching both child and parent exceptions in a try-catch block, it is generally recommended to catch the child 
   exceptions before the parent exception.

-- The reason for this is that if you catch the parent exception before the child exception, the catch block for the parent exception will also catch any child exceptions that are subclasses of the parent exception. 
This can make it more difficult to handle the child exceptions separately.

e.g 
int a = 10;
int arr[]={3,4,5};
try{
   int b = 3/a;
   System.out.println(arr[b]);
}
catch(Exception e){
   System.out.print("parent class of every exception");
}
catch(ArithmeticException e){
 }

-- this will give compile time error i.e error: exception ArithmeticException has already been caught by Exception class

Right way:
first child Exception then parents Exception  
int a = 10;
int arr[]={3,4,5};
try{
   int b = 3/a;
   System.out.println(arr[b]);
}
catch(ArithmeticException e){
 }
catch(Exception e){
   System.out.print("parent class of every exception");
}
======================================================================================================================================          
*/