/*
 Now in multidimensional array we mentioned that the upper array that is 3 will signify number of outer array
 and the inner array will have size 4, what if the inner array can be of any size yes we can acheive this.
 And this type of array is known as jagged array
*/

import java.util.*;

class java1{
    
    public static void main(String[] args){
        
        int[][] arr = new int[3][];//This is known as jagged array

        arr[0] = new int[3];//In this type array we need to define the size of the each lot later
        arr[1] = new int[2];
        arr[2] = new int[4];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
