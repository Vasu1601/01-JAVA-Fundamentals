import java.util.*;

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(Mobile obj){
        System.out.println("This is Static method");
        System.out.println(obj.brand+" : "+obj.price+" : "+name);//name can be accessed directly because it is static other two will give error, to counter that we used them through object 
    }
}


class java1{
    public static void main(String[] args){
        
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        
        Mobile.name = "Smart Phone";

        m1.show();

        Mobile.show1(m1);

    }
}

/*
================================================Notes=================================================================================
    1. Static method vs non static method
       = remember we can call static method with object reference or class name  e.g ClassName.staticMethod() or objReference.statiMethod()
       = but non static method dependent on object so it can be called only  by object reference. e.g objReference.nonStaticMethod(); 
======================================================================================================================================
*/