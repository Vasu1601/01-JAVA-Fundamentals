import java.util.*;

class java1{
    public static void main(String[] args){
        int[] arr = new int[4];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 13;
        arr[3] = 4;

        for(int i = 0; i<4; i++){
            System.out.println(arr[i]);
        }
    }
}

/*
  1. Array in Java is an object
  2. By default the value in the array is 0
  3. Suppose the size of array is 6 and you try to print the values up to 7th index in that case you
     are going to get an exception(This is just an runtime error).
  4. Now suppose we dont know the length of the array so to tackle this array has some inbuilt properties
     that can help , the very first is array_name.length.
*/