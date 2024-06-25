<<<<<<< HEAD
class java1{
    public static void main(String[] args){
        int num = 7;

        Integer num1 = num; //Autoboxing
        System.out.println(num1);

        int num2 = num1; // AutoUnboxing
        System.out.println(num2);
    }
}

/*
================================================Notes=================================================================================
    1. Java is not 100% Object Oriented Oriented programming language because of primitive data types but for primitive data types we 
       also have wrapper classes in case to make total behavior of object oriented programing language. 
       Wrapper classes do extend Object class.

    2. Now when we do 
       - Integer num1 = new Integer(num);
       This is known as boxing where you pass primitive data type in wrapper class and remeber this will give you warning because java
       prefer autoboxing as discussed above

    3. Similarly we have unboxing where we use method .intValue to convert wrapper class value to primitive datatype value
       - int num2 = num1.intValue(); 
       but rather we prefer directly passing the value without using function which is known as autounboxing.
======================================================================================================================================
=======
class java1{
    public static void main(String[] args){
        int num = 7;

        Integer num1 = num; //Autoboxing
        System.out.println(num1);

        int num2 = num1; // AutoUnboxing
        System.out.println(num2);
    }
}

/*
================================================Notes=================================================================================
    1. Java is not 100% Object Oriented Oriented programming language because of primitive data types but for primitive data types we 
       also have wrapper classes in case to make total behavior of object oriented programing language. 
       Wrapper classes do extend Object class.

    2. Now when we do 
       - Integer num1 = new Integer(num);
       This is known as boxing where you pass primitive data type in wrapper class and remeber this will give you warning because java
       prefer autoboxing as discussed above

    3. Similarly we have unboxing where we use method .intValue to convert wrapper class value to primitive datatype value
       - int num2 = num1.intValue(); 
       but rather we prefer directly passing the value without using function which is known as autounboxing.
======================================================================================================================================
>>>>>>> 1741ae1dd7107625f124fcbb00b3bc12d6ce3583
*/