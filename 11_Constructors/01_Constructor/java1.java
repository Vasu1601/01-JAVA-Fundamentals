import java.util.*;

class Human{
    private String name;
    private int age;

    public Human(){
        name = "Vassu";
        age = 21;
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

      System.out.println(obj.getName()+" : "+obj.getAge());
    }
}

/*
================================================Notes=================================================================================
    1. - When you create an object then in the heap memory, it will just create a blank object.
       - If you do not assign values than the default values will be assigned like:
        0 for int,
        NULL for string
       - We can also define values at the time of the creation of an object by giving our default values. 

    2. Properties of a constructor:
       - Constructor is almost similar to a method it has a name and it also has round brackets.
       - The change in the constructor with respect to the method is that in the constructor we do not specify the return type.
       - The name of a constructor must be the same as the class name.
       - There is no need to call a constructor. It gets called automatically at the time of the creation of an object.
       -  At the time of calling the constructor, memory for the object is allocated in the memory.
       - Constructors are called only once at the time of object creation. While method(s) can be called any number of times.       
======================================================================================================================================
*/