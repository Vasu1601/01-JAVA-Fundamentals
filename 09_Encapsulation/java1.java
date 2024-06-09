import java.util.*;

class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String a){
        name = a;
    }
}

class java1{
    public static void main(String[] args){
     
     Human obj = new Human();
    //  obj.name = "Vasu"; //Name cant be changed 

    obj.setAge(11);
    obj.setName("Vasu");

    System.out.println(obj.getName()+" : "+obj.getAge());

    }
}

/*
================================================Notes=================================================================================
    1. Binding the data with the method to make our data secure is know as encapsulation, consider encapsulation as we have a capsule
       and inside capsule everything inside the class is wrapped or encapsulated.

    2. Encapsulation can be acheived through access modifiers such as public, private, protected and default.

    3. Benefit of encapsulation
       i)Helpful in to achieve abstraction 
       ii)for security point of view it is most beneficial.
       iii)you can maintain log file through method when you bind your data with method.  

    4. Now thing is how can we use private data - 
       we can use getter and setter methods to get and set the value of private variables.

    5. Note - Always make variable as private and methods as public to make a secure program    
======================================================================================================================================
*/