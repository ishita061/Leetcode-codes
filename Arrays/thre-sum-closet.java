/*
16. 3Sum Closest
  
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++) {
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left=i+1;
            int right= nums.length-1;
            while(left < right) {
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum) < Math.abs(target-closet)) {
                    closet = sum;
                }
                if(sum < target) {
                    left++ ;
                } else if(sum > target) {
                    right-- ;
                } else {
                    return sum;
                }
            }
        }
        return closet;
    }
}
