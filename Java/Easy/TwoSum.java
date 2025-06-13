package Java.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    answer.add(i);
                    answer.add(j);
                    break;
                }
            }
        }
        int[] arr = answer.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    
}