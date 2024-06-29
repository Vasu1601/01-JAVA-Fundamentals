//The main part you should remember is that functional interface was introduced in Java8

@FunctionalInterface
interface A{
    void show();
}

class java1{
    
    public static void main(String[] args){

        A obj = ()-> System.out.println("In Show");
        obj.show();

        //or

        A obj1 = () ->{
            System.out.println("In Show 1");
            int a = 10;
            System.out.println(a);
        };

        obj1.show();

    }

}

/*
================================================Notes=================================================================================
    1. what is lambda expression in java?
       -- In Java, a lambda expression is a concise way to implement a functional interface. 
          A functional interface is an interface that has only one abstract method, and it can be implemented using a lambda expression.
       -- In the previous lecture we see that we are making a class or inner class to implement the functional interface 
          but using lambda expression we do not need of new class and inner class to implement.

    2. Concise syntax: Lambda expressions provide a concise and expressive syntax for defining functional interfaces. 
       They allow you to define the behaviour of a functional interface in a single line of code.

       Functional programming: Lambda expressions are a key component of functional programming in Java. 
       They allow you to write code that is more declarative and expressive, and less verbose than traditional imperative code.

       No need for anonymous inner classes: Lambda expressions provide an alternative to anonymous inner classes, which are often 
       used to implement functional interfaces in Java. Lambda expressions are more concise and easier to read than anonymous inner 
       classes.
======================================================================================================================================          
*/