<<<<<<< HEAD
import java.util.*;

class Human{

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        // name = name;//in this case the compiler will get confused that wether you are refering to instance variable or local variable and remember in this case local variable is setting value to itself
        this.name = name;//this.name refers to instance variable
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}

class java1{
    public static void main(String[] args){
        Human obj = new Human();
        obj.setName("Vasu");
        obj.setAge(21);

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}

/*
================================================Notes=================================================================================
    1. Instance variable:- These variables are declared within a class but outside a method.
       - These variables are created when we create an object and are destroyed when the object is destroyed.

       Local variable:- These variables are declared within a method but do not get any default value.
       - They are created when we enter a method or constructor and get destroyed when the call returns from the method.

    2. In Java, it is not allowed to declare two or more variables having the same name inside a scope either in class scope or method scope.
       - The preference is always given to the local variable.
       - Creating an object is not a good idea to solve the issue of conflicting names of instance and local variables.
       - We can differentiate between local and instance variables by passing an object itself.
       - Instead of writing and passing an object, we can simply use this keyword.  

    3. This keyword:-
       This keyword represents the current object.
       - Current object is an object which is calling the method.
       - This keyword is used to invoke the current class constructor.
       - Using the 'this' keyword, we can return the current class instance.
       -  This keyword can be used as an argument in the constructor call. 
======================================================================================================================================
=======
import java.util.*;

class Human{

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        // name = name;//in this case the compiler will get confused that wether you are refering to instance variable or local variable and remember in this case local variable is setting value to itself
        this.name = name;//this.name refers to instance variable
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}

class java1{
    public static void main(String[] args){
        Human obj = new Human();
        obj.setName("Vasu");
        obj.setAge(21);

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}

/*
================================================Notes=================================================================================
    1. Instance variable:- These variables are declared within a class but outside a method.
       - These variables are created when we create an object and are destroyed when the object is destroyed.

       Local variable:- These variables are declared within a method but do not get any default value.
       - They are created when we enter a method or constructor and get destroyed when the call returns from the method.

    2. In Java, it is not allowed to declare two or more variables having the same name inside a scope either in class scope or method scope.
       - The preference is always given to the local variable.
       - Creating an object is not a good idea to solve the issue of conflicting names of instance and local variables.
       - We can differentiate between local and instance variables by passing an object itself.
       - Instead of writing and passing an object, we can simply use this keyword.  

    3. This keyword:-
       This keyword represents the current object.
       - Current object is an object which is calling the method.
       - This keyword is used to invoke the current class constructor.
       - Using the 'this' keyword, we can return the current class instance.
       -  This keyword can be used as an argument in the constructor call. 
======================================================================================================================================
>>>>>>> ce30337b97ead2e60823986ded23ea081568e9b3
*/