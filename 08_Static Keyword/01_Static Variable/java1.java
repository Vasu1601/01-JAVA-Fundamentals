<<<<<<< HEAD
import java.util.*;

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}

class java1{
    public static void main(String[] args){
      
      Mobile m1 = new Mobile();
      m1.brand = "Apple";
      m1.price = 1500;
      m1.name = "Smart phone";
      m1.show();

      Mobile m2 = new Mobile();
      m2.brand = "Samsung";
      m2.price = 1000;
      m2.name = "Phone";
      m2.show();

      Mobile.name = "very good smart phone";

      System.out.println(m1.name);
      System.out.println(m2.name);
    }
}



/*
================================================Notes=================================================================================
    1. When we are using static keyword with variable, block, method it become independent of object
       , in above example the name keyword become independent of object, no doubt we can access the 
       name by making the object but it's not a good developer way to do so. It is better to access
       the static variale using class name.
    
    2. Static make the value common for every object we create for that particular class, as in 
       above example when we assign the valueto name using m2 the value of m1.name also get change 
       with the same value.
    
    3. Four place we can use static keyword 
        a) before variable declaration e.g class Calc{ static int s; }

        b) before a block  class Calc{  static {System.out.println("this is static block);}}

        c) during method creation class Calc{public static void add(int num1,int num2){};}

        d) with concept of inner class (It is not discussed in this lecture) 
        class OuterClass {
            int x = 10;

            static class InnerClass {
               int y = 5;
            }
        }

    4. When memory get allocated
        = for that we need to know some term 
        a)stack area b)heap area c)class loader system 
        Step 1: when you compile the code you get .class file 
        Step 2: when you are executing (java MainClass) first class loading to class loader System.
        Step 3: During class loading static variable initialize, static block get executed.
        Step 4: Since, static variable got memory in heap before object creation. Now we can say that it is independent of object

    5. Things to remember - 
       a) we can call and use the static property inside a non-static block without creating an object
       b) But we can not use the non static property inside the static block of code 
======================================================================================================================================
=======
import java.util.*;

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}

class java1{
    public static void main(String[] args){
      
      Mobile m1 = new Mobile();
      m1.brand = "Apple";
      m1.price = 1500;
      m1.name = "Smart phone";
      m1.show();

      Mobile m2 = new Mobile();
      m2.brand = "Samsung";
      m2.price = 1000;
      m2.name = "Phone";
      m2.show();

      Mobile.name = "very good smart phone";

      System.out.println(m1.name);
      System.out.println(m2.name);
    }
}



/*
================================================Notes=================================================================================
    1. When we are using static keyword with variable, block, method it become independent of object
       , in above example the name keyword become independent of object, no doubt we can access the 
       name by making the object but it's not a good developer way to do so. It is better to access
       the static variale using class name.
    
    2. Static make the value common for every object we create for that particular class, as in 
       above example when we assign the valueto name using m2 the value of m1.name also get change 
       with the same value.
    
    3. Four place we can use static keyword 
        a) before variable declaration e.g class Calc{ static int s; }

        b) before a block  class Calc{  static {System.out.println("this is static block);}}

        c) during method creation class Calc{public static void add(int num1,int num2){};}

        d) with concept of inner class (It is not discussed in this lecture) 
        class OuterClass {
            int x = 10;

            static class InnerClass {
               int y = 5;
            }
        }

    4. When memory get allocated
        = for that we need to know some term 
        a)stack area b)heap area c)class loader system 
        Step 1: when you compile the code you get .class file 
        Step 2: when you are executing (java MainClass) first class loading to class loader System.
        Step 3: During class loading static variable initialize, static block get executed.
        Step 4: Since, static variable got memory in heap before object creation. Now we can say that it is independent of object

    5. Things to remember - 
       a) we can call and use the static property inside a non-static block without creating an object
       b) But we can not use the non static property inside the static block of code 
======================================================================================================================================
>>>>>>> a60158535645dbf4a0c7d05ecfcc25704c3b5b31
*/