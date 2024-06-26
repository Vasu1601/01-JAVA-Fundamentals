abstract class A{
    public abstract void show();
}

class java1{
    public static void main(String[] args){

        A obj = new A(){
            public void show(){
                System.out.println("In new Show");
            }
        };

        obj.show();
    }
}

/*
================================================Notes=================================================================================
    When you want to use an interface and an abstract class only once, then you can simply use an anonymous innner class in place of that.
    - You can also provide the implementation for multiple methods in an anonymous inner class.
    - Anonymous inner class can implement only one interface at s time.
    - Anonymous inner class can either extend a class or implement an interface at a time.
    - We can create object for abstract class by providing the implementation of an abstract method in an anonymous inner class.
======================================================================================================================================          
*/