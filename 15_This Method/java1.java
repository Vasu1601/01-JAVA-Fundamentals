import java.util.*;

class A{
    public A(){
        System.out.println("in A");
    }

    public A(int n){
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        System.out.println("in B");
    }

    public B(int n){
        this();
        System.out.println("in B int");
    }
}

class java1{

    public static void main(String[] args){
        B obj = new B(5);
    }

}

/*
================================================Notes=================================================================================
    1. This() method:-
       - this() method calls the constructor of the same class.
       - If you do not pass any parameter in this method, then it will call the default constructor of the same class.
       -  If you pass any parameter in this method, then it will call the parameterised constructor of the same class.
    
    2. Similarities in between this() and super() method:-
       - We can use both this and super method anywhere except the static area.
       - Both this and super method can be used any number of times in a code.
       But both can be used only one time inside a constructor.
       - Both are non-static keywords.
======================================================================================================================================
*/