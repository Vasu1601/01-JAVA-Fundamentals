import java.util.*;

class java1{
    public static void main(String[] args){

        String name = "Vassu";

        String name2 = new String("Vasu");

        System.out.println(name);

        //Various Methods
        System.out.println(name2.length());
        System.out.println(name2.concat(" Mehta"));
        System.out.println(name2.charAt(1));
        System.out.println(name2.toCharArray());

        char[] arr = name2.toCharArray();
        for(char c : arr){
            System.out.println(c);
        }

    }
}

/*
================================================Notes===============================================
    1. The very first thing to notice is that String is not a primitive data type it is a class but
       in most of the cases you will use String like you use primitive data types the new key word 
       syntax is very rare
    
    2. As String is a class there are many methods that you can use with string and it also support
       methods that are used by arrays
====================================================================================================
*/