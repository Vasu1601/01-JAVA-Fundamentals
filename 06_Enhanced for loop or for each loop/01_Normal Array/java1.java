import java.util.*;

class java1{
    public static void main(String[] args){
       int[] nums = new int[4];
       
       for(int i = 0; i<nums.length; i++){
        nums[i] = (int)(Math.random()*100);
       }

       for(int n: nums){
        System.out.println(n);
       }
       
    }
}


/*
================================================Notes===============================================
    Enhanced loops are only to be used on array or the data that are similar to array
    Now it's syntax will be like this - 
    Suppose you have an integer array nums and you want to fetch the every data in nums - 

    for(int n : nums)

    In the above syntax n refers to each element in nums not index 
    In the starting it may seem complicated but when you get used to it , this loop is very useful
====================================================================================================

=================================================Points to remember=================================================
    1. You cant take input using for each or enhanced for loop in java
    2. Enhanced for loop is prefered because in enhanced for loop you dont need to worry about the size of the array
    3. This loop can even work with array of objects
====================================================================================================================
*/