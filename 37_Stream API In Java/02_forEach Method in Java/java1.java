import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

class java1{
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(4,3,5,2,6,1);

        // Consumer<Integer> con = new Consumer<Integer>(){
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        //Now Consumer interface is an functional interface so that mean we can aslo write as
        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con);

        //Now instead of writing this long code we can simply do this

        nums.forEach(n -> System.out.println(n));
    
    }
}

/*
================================================Notes=================================================================================
#1
- forEach method got introduced in Java 1.8 version.
- The forEach() method of ArrayList is used to perform a certain operation for each element in ArrayList.
- forEach traverses each element of the Iterable until all the elements have been processed.
- Collection classes that extend the Iterable interface can use forEach loop to iterate elements.

#2
- forEach method takes an object of the consumer.
- Consumer is an interface that belongs to the java.util.function package.
- Consumer is a functional interface so lambda expression will also be applicable to it.
- Consumer has a method accept(), that takes a value of the same type of which object is created.

- forEach needs an object and we will pass an object of a consumer in it.
- forEach gives a value at a time and that value gets passed to the consumer object and taken by the accept method.
- We can do operations in this accept method.
======================================================================================================================================          
*/
