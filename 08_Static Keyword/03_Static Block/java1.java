import java.util.*;

class Mobile{
    String brand;
    int price;
    static String name;

    static{
        System.out.println("In the static block");
        name = "Samrt Phone";
    }

    public Mobile(){
        brand = "Apple";
        price = 1500;
        // name = "Smart Phone";
        System.out.println("In the constructor");
    }

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

}


class java1{
    public static void main(String[] args){
        
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        Mobile.name = "Smart Phone";

        Mobile m2 = new Mobile();

    }
}


/*
================================================Notes=================================================================================
    1. static block vs non static block
       = remember static block executed before the execution of static method 
       = non static block executed when you try to create the object and executed before constructor called.
    
    2. Constructor is getting called every time we create an object suppose we are creating multiple times , so static variable is 
       getting instatiated multiple times which is not required , so here comes the concept of static block, static block will get 
       executed only once and that too in the beginning.
    
    3. Now suppose we dont create any object of the class then will static block get called the answer is no, so in that case we can 
       use Class.class property but keep one thing in mind that when we use Class property we need to use exception handeling as well
       , the concet of exception handeling will be discussed later but this whole Class property concept is important because it is 
       is used in jdbc - 

       public static void main(String[] args) throws classNotFoundException{
        Class.forName("Mobile");
       }
======================================================================================================================================
*/