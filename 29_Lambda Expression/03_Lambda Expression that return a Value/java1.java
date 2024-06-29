@FunctionalInterface
interface A{
    int add(int i, int j);
}

class java1{

    public static void main(String[] args){

        A obj = (int i, int j) ->
        {
            return i + j;
        };

        int result = obj.add(5,6);
        System.out.println(result);

        //Alternativie
        A obj1 = (i,j) -> i + j;

        int result1 = obj.add(5,7);
        System.out.println(result1);
    }
}

/*
================================================Notes=================================================================================
    1. Lambda Expression work with only functional interface because in case you have more than one method how will it know that which 
       method you are trying to implement.

    2. -- if we have a functional interface 
         interface A{
          int add(int i, int j);
         }
       in this case, we return int type from add a method for that we can write a lambda expression 
       in different ways.
       -- if we have a single statement you do not need of curly braces
       A obj1 =(i,j)- return i+j;

       -- if we want to return something in a single statement, no need to mention the return keyword
       A obj2 =(i,j)-i+j;
======================================================================================================================================          
*/