import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class java1{
    public static void main(String[] args){

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(81);
        nums.add(65);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}

/*
================================================Notes=================================================================================
- From the Java 1.7 version, it is not compulsory to mention the generic type on the right-hand side if you have already mentioned it on the left-hand side.
 
- A collection class has lots of methods. The collection class belongs to the util package.
- We can sort a list or an ArrayList by using the method sort of collection class
 Collections.sort();
- If we want to apply our own logic in sorting, then we have to use a comparator with sorting in collections.
- Comparator is also an interface.
- We have a method called compare() in the comparator interface.
- We can use an interface by implementing a class or through an anonymous class.
- Compare method works on an algorithm where it compares two values and then swaps them.
 Comparator Integer com= new Comparator Integer()
 {
  public int compare(Integer i, Integer j)
  {
   statements;
  }
 };
- So, a comparator is an interface through which you can specify your own concept of sorting.
======================================================================================================================================          
*/