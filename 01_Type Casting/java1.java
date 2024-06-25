import java.util.*;

class java1{

    public static void main(String[] args){
    //    int a = 100;
    //    byte b = 23;

    //    a = b;
    //    b = (byte)a;

    //    System.out.println(a);
    //    System.out.println(b);


    int x = (int)5.6;
    System.out.println(x);
    }
}

/*
================================================Notes=================================================================================
    1. What is type conversion or type casting ?
       -- type conversion or type casting  is the process of converting a value from one data type to another data type.
       e.g int num=5; long l=num; 

    2. Different ways to casting 
        a) Implicit type casting :- 
        It is way to in which compiler automatically convert smaller size data type in larger.
        e.g int num=4; long l=num; //now num value converted to long 

        b) Explicit  type casting :-
        manually when programmer cast one data type into other is known as explicit type casting.
        e.g float fl=4.5f; int num=fl; -- num value become 4;

       syntax for conversion:
       type1 x=value; //higher size
       type2 y=(datatype of type2)x;
    
    3.  What is effect of type casting ?
        -- one effect is narrowing conversion 
        i.e Narrowing conversions can be done from a larger data type to a smaller data type, but they can result in loss of precision or data.
        e.g float fl=5.6f; int num=fl; loss of 0.6 precision now value of num is 5.
 
       Note: if you want convert 
        -- you get error . e.g int i=5; byte b=i; //give error
        --in most cases conversion of higher datatype to lower data type give error 
           1. incompatible types: possible lossy conversion from long to byte
           2. incompatible types: possible lossy conversion from double to int
           3. incompatible types: possible lossy conversion from float to int
           4. incompatible types: possible lossy conversion from double to byte
           5. incompatible types: possible lossy conversion from float to byte
           6. incompatible types: possible lossy conversion from double to short
           7. incompatible types: possible lossy conversion from float to short
           8. incompatible types: possible lossy conversion from double to long
           9. incompatible types: possible lossy conversion from float to long
           10. incompatible types: possible lossy conversion from double to char
        -- these are some cases 

    4. Type promotion :-
       when we do arithmetic operation on two different data types, java will promote the smaller data type to the larger data type 
           int / int = int 
           int / float = float
           int * float = float
           short * short = int
           short * int = int
           short * long = long
           byte * byte = int

           System.out.println(5.2/3);
           byte b=120; byte c=120;
           System.out.println(a*b); //14400
======================================================================================================================================
*/