package Leetcode_Problems;

import java.util.*;

// 0(n) soln
class Two_Sum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int difference = target - nums[i];

            if(hm.containsKey(difference)){
                return new int[]{hm.get(difference),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};


    }
}

// O(n^2) soln
// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//             for(int i=1;i<nums.length;i++){

//                 if((nums[i] + nums[i-1]) == target){
//                     return new int[]{i-1,i};
//                 }
//             }


//     }
// }




