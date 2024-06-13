import java.util.*;

class A{

    public A(){
        System.out.println("Object Created");
    }

    public void show(){
        System.out.println("This is Show Method");
    }
}

class java1{
    public static void main(String[] args){
        A obj = new A();//When we say A obj , we are creating reference variable to an Object, the object is being created at new A();

        //Now we can also do create object without using reference variable
        new A(); //Anonymous Object
        new A().show();//This is different Anonymous object
    }
}

/*
================================================Notes=================================================================================
    1. In JVM, we have both stack memory and heap memory.
       - Object is created in the heap memory that contains  variable and methods, it also have some address.
       - A obj=new A();
         obj.show();
       here, A is the classname.
                obj refers to the address say 101
           show() is a method that is called using reference variable obj.
       - Every time you call an object, it will call the constructor as well.
       - Object creation can be done in two ways:
        1. Declare an object  - creating a reference
        2. Creating an object  - and assigning the value to it
       e,g.,  A obj;
         obj=new A();
        *new A() shows that you are creating an object.
       - Reference of an object is created in the stack. 

    2. Anonymous Objects:- 
       Anonymous objects are simply created by using the new keyword.
       - It does not have any reference for an anonymous object.
       e.g., new A();
       - A method can directly be called using this object.
         new A().show();
       - We can't use the same anonymous object again. It will be use only for one time.     
======================================================================================================================================
*/