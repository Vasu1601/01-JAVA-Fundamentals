<<<<<<< HEAD
abstract class Car{
    public abstract void drive();

    public void show(){
        System.out.println("This is show of Car");
    }
}

class WagonR extends Car{  //Concrete Class
    public void drive(){
        System.out.println("This is Drive");
    }
}

class java1{
    public static void main(String[] args){
        Car obj = new WagonR();
        obj.drive();
        obj.show();
    }
}

/*
================================================Notes=================================================================================
    1. Abstract classes are classes that cannot be instantiated on their own and are meant to be subclassed. An abstract class can 
       have abstract methods, which are methods without a body that must be implemented by subclasses.

    2. Abstract methods are declared using the abstract keyword and do not have a body. If a class contains one or more abstract 
       methods, the class itself must be declared abstract. Note that there is no requirement for an abstract class to be static.

    3. When you inherit from an abstract class, you must provide implementations for all abstract methods in the subclass; 
       otherwise, the subclass must also be declared abstract.

    4. You cannot create an instance of an abstract class, but you can create a reference of the abstract class type and assign it to 
       an instance of a concrete subclass.
======================================================================================================================================
=======
abstract class Car{
    public abstract void drive();

    public void show(){
        System.out.println("This is show of Car");
    }
}

class WagonR extends Car{  //Concrete Class
    public void drive(){
        System.out.println("This is Drive");
    }
}

class java1{
    public static void main(String[] args){
        Car obj = new WagonR();
        obj.drive();
        obj.show();
    }
}

/*
================================================Notes=================================================================================
    1. Abstract classes are classes that cannot be instantiated on their own and are meant to be subclassed. An abstract class can 
       have abstract methods, which are methods without a body that must be implemented by subclasses.

    2. Abstract methods are declared using the abstract keyword and do not have a body. If a class contains one or more abstract 
       methods, the class itself must be declared abstract. Note that there is no requirement for an abstract class to be static.

    3. When you inherit from an abstract class, you must provide implementations for all abstract methods in the subclass; 
       otherwise, the subclass must also be declared abstract.

    4. You cannot create an instance of an abstract class, but you can create a reference of the abstract class type and assign it to 
       an instance of a concrete subclass.
======================================================================================================================================
>>>>>>> 0fad9f2d87f8ff01bd612403e6eebb1ce5871174
*/