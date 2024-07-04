import java.util.function.Predicate;
import java.util.function.Function;
import java.util.*;
import java.util.stream.Stream;

class java1{
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(4,5,3,6,7,9);

        // Predicate<Integer> p = new Predicate<Integer>(){
        //     public boolean test(Integer n){
        //         if(n%2==0){
        //             return true;
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        // };

        // Predicate<Integer> p = new Predicate<Integer>(){
        //     public boolean test(Integer n){
        //         return n%2==0;
        //     }
        // };

        Predicate<Integer> p =  n ->n%2==0;

        // Function<Integer,Integer> fun = new Function<Integer, Integer>(){
        //     public Integer apply(Integer n){
        //         return n*2;
        //     }
        // };

        Function<Integer,Integer> fun = n -> n*2;
    
        int result = nums.stream()
                         .filter(p)
                         .map(fun)
                         .reduce(0, (c,e) -> c+e);

        System.out.println(result);
        System.out.println();

        Stream<Integer> s1 = nums.stream()
                                 .sorted();

        s1.forEach(n -> System.out.println(n));

        System.out.println();

        Stream<Integer> s2 = nums.parallelStream()
                                 .filter(n -> n%2==0);
        
         s2.forEach(n -> System.out.println(n));
    }
}

/*
================================================Notes=================================================================================
#1
filter() method:-
- filter method needs an object as a parameter of type Predicate.
- Predicate is an interface that contains a method called test which returns a boolean value.
- When you apply the filter method on a value, if it satisfies the condition then it goes further otherwise stops.

#2
map() method:-
- Map needs an object of a functional and it is a functional interface.
- It contains a method called apply(). In apply method, we can do the desired operation on a value.
- Function takes two types, one what is accepted and the other that it returns.

#3
reduce() method:-
- Reduce method takes two parameters, one is the type and the second is the BinaryOperator for operation.
- BinaryOperator extends the BiFunction and it calls a method to apply.

#4
sorted() and parallelStream() method:-
- By using the sorted() method with a stream, it will return a sorted stream.
- There is a method called parallelStream() used with the filter that creates multiple threads to work faster.
- parallelStream should not be used with a sorted method as sorting requires all the elements together, so there multiple threads will create an ambiguity.
======================================================================================================================================          
*/