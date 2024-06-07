//The main thing to remember is that strings are by default immutable in java

import java.util.*;

class java1{
    public static void main(String[] args){

        String name = "Vasu";
        name = name + " Mehta";//Now here you may say that i am changing the value of the string and its working so strings are mutable

        System.out.println(name);

    }
}


/*
================================================Notes===============================================
    Behind the scene -
    As we already know that String is class in java, so when we assign variable we are assigning a
    refernce variable , hence in this case the reference variable will be in the stack memory and 
    will have refence address to the value in the heap memory.

    In heap memory the String value is stored in the special place known as the String Constant pool
    and in that place there adress will be stored to which the reference variable is pointing. 

    And as the name suggest the String values are constant and whenever we change the value the new 
    name is getting stored in the String Constant pool. The reference variable then point to that 
    new value address.

    There are also mutable String types known aas String Buffer and String Builder.
====================================================================================================
*/
