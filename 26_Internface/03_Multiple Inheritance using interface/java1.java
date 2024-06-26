interface A{
    void show();
    void config();
}

interface B{
    void run();
}

class C implements A,B{

    public void show(){
        System.out.println("In Show");
    }

    public void config(){
        System.out.println("In Config");
    }

    public void run(){
        System.out.println("In Run");
    }
}

interface D extends A{
    void hello();
}

class java1{
    public static void main(String[] args){

        A obj = new C();
        obj.config();
        obj.show();
        
        B obj1 = new C();
        obj1.run();
    }
}

/*
================================================Notes=================================================================================
    1. - We can have a class implementing multiple interfaces.
        class B implemets A,X
        {
        }
       (here, A and X are two different interfaces)
       - Implementation of all the methods that are present in those interfaces should be given in a class.
       - Inheritance is also valid in between interfaces.
       - Inheritance can be achieved in between interfaces by using the extend keyword.
       - Whenever you create a reference of an interface and create an object of a class, then you can only call those methods by 
         that reference that are present in that interface of which the refernce is created.
       - Methods of another interface can be called by using another reference variable for that interface with the object of a class.

    2. class - class -> extends
       class - interface -> implements
       interface - interface -> extends
======================================================================================================================================          
*/