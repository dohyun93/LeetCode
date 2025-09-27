package Easy.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static void main() {
        int[] answer = Solution.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println("[" + answer[0] + ", " + answer[1] + "]");
    }

    public class Solution{
        public static int[] twoSum(int[] nums, int target){
            Map<Integer, Integer> map = new HashMap<>();

            for (int i=0; i<nums.length-1; i++){
                int subtract = target - nums[i];
                if (map.containsKey(subtract)){
                    return new int[]{i, map.get(subtract)};
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }
    }
}


