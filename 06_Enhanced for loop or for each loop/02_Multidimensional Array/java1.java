import java.util.*;

class java1{
    public static void main(String[] args){

        int[][] nums = new int[3][];

        nums[0] = new int[2];
        nums[1] = new int[4];
        nums[2] = new int[3];

        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*100);
            }
        }

        for(int n[] : nums){ //This means for every array element n[] in array nums
            for(int m : n){//This meams for every elemnt m in array n
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}