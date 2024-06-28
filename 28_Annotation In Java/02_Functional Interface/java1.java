@FunctionalInterface

interface A{
    void show();
}

class java1{
    public static void main(String[] args){

        A obj = new A(){
            public void show(){
                System.out.println("In Show");
            }
        };

        obj.show();

    }
}

/*
================================================Notes=================================================================================
    1. what is functional Interface?
       --functional interface is an interface with only one abstract method 
    
    2. The properties of a functional interface in Java are as follows:

       Single Abstract Method: A functional interface has only one abstract method. 
       This method is the signature of the interface and defines the behaviour that will be implemented in the lambda expression or with simple class.

       Functional Method: The abstract method of a functional interface is called the functional method. 
       It is the method that provides the functional behaviour of the interface.

       @FunctionalInterface Annotation: A functional interface is annotated with the @FunctionalInterface annotation.
       This annotation is optional, but it provides a compile-time check that the interface has only one abstract method.

       Compatible with Lambda Expressions: A functional interface is compatible with lambda expressions. 
       A lambda expression is a concise way of implementing the functional method of a functional interface.
       (This will discuss in next lecture of lambda expression).

       Functional interfaces are a key component of functional programming in Java, 
       and they are used extensively in the Java 8 Streams API and other Java libraries.

======================================================================================================================================          
*/
