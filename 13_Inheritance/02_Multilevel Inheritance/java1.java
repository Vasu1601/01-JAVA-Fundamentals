import java.util.*;

class Calc{

    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }
}

class AdvCalc extends Calc{

    public int multi(int a, int b){
        return a * b;
    }

    public int div(int a, int b){
        return a / b;
    }

}

class VeryAdvCalc extends AdvCalc{

    public int power(int a, int b){
        return (int)(Math.pow(a,b));//Math.pow returns a double value
    }
}



class java1{

    public static void main(String[] args){

        VeryAdvCalc obj = new VeryAdvCalc();
        
        int r1 = obj.add(5, 4);
        int r2 = obj.sub(10, 4);
        int r3 = obj.multi(2, 6);
        int r4 = obj.div(15, 4);
        int r5 = obj.power(2,3);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }

}


/*
================================================Notes=================================================================================
    1. Single Inheritance:-
       - In single inheritance, subclasses inherit the features of one superclass. 
       - Only one parent class exists in single inheritance.
       - It is when there are only two classes.
       e.g., 
       Calc class inherits the properties of AdvCalc class.
       Here, Calc - child class
            AdvCalc - parent class

    2. Multi-level inheritance:-
       - In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes.
       - More than one parent class exists in multilevel inheritance.
       - It is when we have multiple layers in between the classes.
       e.g.,
       Calc class inherits the properties of AdvCalc and further AdvCalc inherits the properties of VeryAdvCalc.
       Here, Calc - child class
            AdvCalc - parent class of Calc & child class of VeryAdvCalc
            VeryAdvCalc - parent class of both other classes
======================================================================================================================================
*/