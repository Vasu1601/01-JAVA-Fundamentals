import java.util.*;

class A{
    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("in B");
    }

    public B(int n){
        super();
        System.out.println("in B int");
    }
}

class java1{

    public static void main(String[] args){
        B obj = new B();
    }

}

/*
================================================Notes=================================================================================
    1. - Whenever you call an object, it will create a constructor of a class.
       - When we create an object of a class that it calls the constructor of a sub-class as well as a constructor of a superclass.
       - If you do not pass any value in an object, then it will call the default constructor of a class.
       - But if you pass the value in an object, then it will call the parameterised constructor of that class.
    
    2. Super() method:-
       - Every constructor in Java has a method, even if you do not mention it.
       - By default, the first statement in every constructor is a method called a super() method.
       - Super() method means calls the constructor of a superclass.
       - If you do not pass any parameter in a super method, then it will call the default constructor of a superclass.
       - If you pass any parameter in a super method, then it will call the parameterised constructor of a superclass.
       - To call the parameterised constructor of a parent class, we need to explicitly call the super method.

    3. Object class:-
       - Every class in Java extends the Object class, even if you do not mention it.
       - Object is a class in Java that contains a lot of methods.
       - So, the super method of a superclass calls the constructor of an object class.
       - There is multi-level inheritance in this concept.
======================================================================================================================================
*/