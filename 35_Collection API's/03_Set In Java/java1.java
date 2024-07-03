import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

class java1{
    public static void main(String[] args){

        Set<Integer> nums = new HashSet<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>();
        nums.add(45);
        nums.add(67);
        nums.add(82);
        nums.add(91);
        nums.add(45);

        System.out.println(nums);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }

        // for(int n: nums){
        //     System.out.println(n);
        // }

    }
}

/*
================================================Notes=================================================================================
#1
The collection interface is also extended by the set interface.
- List in the collection supports repeated values. The set is an interface in Collection that supports only unique values.
- Package set in the collection is java.util.Set;
- Set extends collection but the class which implements set is different and the class name is HashSet.
- We can define its datatype through generics as well such as greater then bracket  Integer less then bracket

#2
- Set also uses the add() method to insert the values in a set.
- Set does not print the repeated values. It prints the same value only one time.
- Set does not maintain the sequence, it gives values in any random order. The set does not sort the values
- Set also does not support an index for values.

#3
- Instead of using the class HashSet, if we will use the TreeSet, it will give values in sorted order.
 
- All the elements in a TreeSet are sorted as it extends AbstractSet and implements NavigableSet and further NavigableSet extends Sorted Set.


#4
- Collection interface extends an Iterable interface through which we can iterate between the elements by using enhanced for loop, etc.
- Iterable interface contains a method called iterator().
- Iterator returns an iterator object that got all the values from a set. It can be in place of loops.

- It has also a method called next() that gives the values of the next element.
-  It has a method hasNext() that helps the loop to know that the set contains a value of the next element.
 while(values.hasNext())
  System.out.println(values.next());
======================================================================================================================================          
*/