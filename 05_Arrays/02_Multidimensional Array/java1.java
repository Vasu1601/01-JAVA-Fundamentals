//The array of arrays is known as multidimensional array

import java.util.*;

class java1{
    public static void main(String[] args){
        
        int[][] arr = new int[3][4];

        for(int i  = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Same thing can be done using enhanced for loop that will be discussed later

    }
}