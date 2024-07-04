import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class java1{
    public static void main(String[] args){

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(81);
        nums.add(67);
        nums.add(79);
        nums.add(29);

        Collections.sort(nums);
        System.out.println(nums);
    }
}