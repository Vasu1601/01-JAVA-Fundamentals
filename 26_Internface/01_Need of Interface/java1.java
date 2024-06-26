interface Computer{
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code, run, Compile : Faster");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code, run, Compile");
    }
}

class Developer{
    public void show(Computer any){
        any.code();
    }
}

class java1{

    public static void main(String[] args){
        Developer vasu = new Developer();
        Computer macbook = new Laptop();
        Computer desk = new Desktop();
        vasu.show(macbook);
    }

}

/*
================================================Notes=================================================================================
    1. - We can also pass an object as a parameter in a method.
       - When you build an application, you need to make it more flexible.
       - We can create a reference of the parent class and an object of the sub-class.
       - Passing reference and the reference of an object that you accept in a method, both should be the same.

    2. Interface:-
        - Interface in Java is used to achieve abstraction.
        - Interface is used to design an application to make it loosely coupled.
        - implements keyword is used with a class to extend it to an interface
         interface Computer
         {
         }
        .........
         class Desktop implements Computer
        { 
         statement;
        }

    3. Need of an Interface:-
        - It is used to implement abstraction.
        - We can also achieve multiple inheritance in Java, by using the interface.
        - Any class can extend only 1 class but can any class implement an infinite number of interface.
        - It is also used to achieve loose coupling.
======================================================================================================================================          
*/