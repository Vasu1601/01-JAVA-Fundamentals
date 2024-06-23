/*
================================================Notes=================================================================================
    1. What is Access Modifiers ? Types of access Specifiers
       -- Access Modifiers are keywords that determine the visibility and access level of a class,
       method, or data member. 

       -- There are four types of access specifiers in Java: 
       
           i) public: A public class, method, or data member is visible to all classes. 
           ii) protected: A protected class, method, or data member can be accessed by classes within the same
           package, and any subclasses which extend the class. 
           iii) default: A default class, method, or data member is visible only to classes
           within the same package. 
           iv) private: A private class, method, or data member is only visible to the class it is declared in, 
           and not to any subclasses.   

    2. package flder1.folder1;
       // import flder1.folder2.B; --The type flder1.folder2.B is not visible because class is not public
       import flder1.folder2.C;
       public class A {
    
       public static  void main(String []args){
       // B obj=new B(); -- we was not making class B as public -- so we get error
       C obj =new C();  //since, Class C is public so we can use outside the package of folder2
       //for class visibility  only public is legal modifiers  has been used and if you not mention anything by default class is default.
   
       //  System.out.println(obj.def); -- The field C.def is not visible because we want to access from different package but we have not visibility in current package because access specifier is default
       //  System.out.println(obj.prot); not visible because access specifier is protected -- it is only visible in same package or visible in other package if  class is subclass of that class.
       //protected visible to inherited class of different package also.

       Child ch =new Child();
       // ch.a; -- not visible in anywhere. Since a is visible only in same class because it is private.
           }
       }

       class Child extends C{
           private int a=9;
       public void natureProtected(){
           System.out.println(prot); //here we can use protected variable becuase it is visible to inherited class in different package also
       }
       }
 
       /*
       step 1:  create a folder  flder1
       Step 2:  create two sub folder inside flder1 i) folder1 ii)folder2 
       step 3:   create A.java file in folder1
       step 4:  create B.java, C.java in folder2

       package flder1.folder2;
        class B { 
       }
       package flder1.folder2;
       public class C {
           int def=5;
          protected int prot=6;
           public int pub=7;
           private int pvt=8;
       }
======================================================================================================================================
*/