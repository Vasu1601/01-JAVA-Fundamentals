import java.util.*;
import java.util.stream.Stream;

class java1{
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(4,5,3,6,7,9);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        int result = nums.stream()
                         .filter(n -> n%2==0)
                         .map(n -> n*2)
                         .reduce(0, (c,e) -> c+e);

        // s1.forEach(n -> System.out.println(n));
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));

        System.out.println(result);
    }
}

/*
================================================Notes=================================================================================
#1
- Stream is an interface, it contains a stream() method.
- Stream method return an object of type stream.
- Any operation can be performed inside the stream method.
- Any changes done inside the stream can be reflected on the actual list.
- Once we work with a stream, we can't reuse it. We can work with a stream only once.

#2
- Stream provides a lot of methods to work upon.
- filter() method returns a new Stream that contains the value which satisfies the given condition. The filter method is used to select elements as per the Predicate passed as an argument.
- map() takes each value and performs operations on it. It returns a stream consisting of the results of applying the given function to the elements of this stream.
- reduce() method does not return the stream but it gives the value of a type that you defined in the stream. It is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter.

#3
- If you want to use Big Data, then first you have to apply a filter on it to separate useful data.
- After applying a filter, you need to transform it into the required data with the help of a map.
- And the graph of it, can be made with the help of the reduce method.
- We can reduce the code by applying methods one after the other.
======================================================================================================================================          
*/