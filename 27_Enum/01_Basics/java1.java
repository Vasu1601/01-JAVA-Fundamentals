enum Status{
    Running, Failed, Pending, Success;
}

class java1{
    public static void main(String[] args){
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] ss = Status.values();
        for(Status any: ss){
            System.out.println(any + " : " + any.ordinal());
        }
    }
}

/*
================================================Notes=================================================================================
    1. Enum is a short term used for Enumeration.
       Enumerations serve the purpose of representing a group of named constants in a programming language.
    
    2.-Java Enums can be thought of as classes that have a fixed set of constants 
      - Enum is named constants that we create for specific constants or error codes.
      - Enum is created in place of an object for constants.
      - Enum is pre-defined that contains all name constants.
      - Enums are used to create our data type like classes.
      - In enum, instead of returning a string format or a specific object, we can simply return a status or a value present inside 
        an enum.
      e.g.,  enum Status{
         Running, Failed, Pending, Success;
        }
      - enum is also treated as a class in Java. Objects can also be created for enum like:
       Status s= Status.Running;
      - Every enum constant represents an object of type enum.
      - enum type can be passed as an argument to switch statement

    3. - In enum, all the name constants are defined by using numbers.
       - ordinal() method is used to get the index of the name constant present in the enum.
       - values() method is used to get all the statuses or name constants of enums.
        Status [] s= Status.values();
       *values() method will give an array.
======================================================================================================================================          
*/