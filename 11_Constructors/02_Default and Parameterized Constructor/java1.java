<<<<<<< HEAD
import java.util.*;

class Human{
    private String name;
    private int age;

    public Human(){  //Default Cnostructor
        name = "Vassu";
        age = 21;
    }

    public Human(String name, int age){  //Parameterized Constructor
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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
        Human obj1 = new Human("John", 22);

        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());
    }
}

/*
================================================Notes=================================================================================
    1. A constructor in Java is a special method that is used to initialize objects. 

       Parameterized Constructor:-
       - A constructor that takes some parameters is known as parameterized constructor.
       - The parameterized constructor is used to provide different values to different objects.

       Default Constructor:-
       - A normal constructor is known as the default constructor.
       - If you do not create any constructor, then java creates a default constructor. That constructor will be blank with no parameters.
       - The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

       - The default constructor can change into the parameterized constructor. But Parameterized constructor can’t change into the default constructor.       
======================================================================================================================================
=======
import java.util.*;

class Human{
    private String name;
    private int age;

    public Human(){  //Default Cnostructor
        name = "Vassu";
        age = 21;
    }

    public Human(String name, int age){  //Parameterized Constructor
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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
        Human obj1 = new Human("John", 22);

        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());
    }
}

/*
================================================Notes=================================================================================
    1. A constructor in Java is a special method that is used to initialize objects. 

       Parameterized Constructor:-
       - A constructor that takes some parameters is known as parameterized constructor.
       - The parameterized constructor is used to provide different values to different objects.

       Default Constructor:-
       - A normal constructor is known as the default constructor.
       - If you do not create any constructor, then java creates a default constructor. That constructor will be blank with no parameters.
       - The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

       - The default constructor can change into the parameterized constructor. But Parameterized constructor can’t change into the default constructor.       
======================================================================================================================================
>>>>>>> 08a83a0a2ef27b84e9aa976bd707fd7d4d231def
*/