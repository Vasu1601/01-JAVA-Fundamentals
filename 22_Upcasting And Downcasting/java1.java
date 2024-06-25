class A{
    public void show1(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }
}

class java1{
    public static void main(String[] args){
        A obj = (A) new B();
        obj.show1();//This is known as upcasting that is calling the method of super class through child class

        B obj1 = (B) obj; //This is known as downcasting that is calling the method of Subclass From superclass
        obj1.show2();
    }
}

/*
================================================Notes=================================================================================
what is typecasting  ?
typecasting is way to converting one primitive data type into other data type using implicit or explicit type
conversion.
double d=4.5;
int i=(int)d; //explicit typecasting 

int i1=5;
double d1=i1; //implicit type conversion

When we are talking about non -primitive data type we have concept of upcasting and downcasting
condition for upcasting and downcasting:
-- for that two class should have some parents child  relationship 
-- if non-primitive data type have no any relationship so, upcasting and downcasting is not possible.

class A{
    public void show1(){
        System.out.println("In show A)
    }
}

class B extends A{
    public void show2(){
        System.out.println("In show B");
    }
}

class Demo{
    public static void main(String []args){
        A obj =(A) new B(); //upcasting 
        obj.show1();
       
    A obj1 =new B(); // upcasting 
   // obj1.show2(); // you get error and you are not able to call show2() because with parennts reference specialised method of child is not visible
    here we downcastig to use show2() method
    ((B)obj).show2(); //downcasting
    }
}

Note:
the object can also be typecasted like the datatypes. Parent and Child objects are two types of objects. 
So, there are two types of typecasting possible for an object, i.e., Parent to Child and Child to Parent or can say Upcasting and Downcasting.
======================================================================================================================================
*/