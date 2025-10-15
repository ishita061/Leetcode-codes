/*
414. Third Maximum Number

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
*/

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int firstMax = nums[nums.length-1];
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int second = -1;
        int third = -1;
        for(int i=nums.length-2;i>=0;i--) {
            if(nums[i] < firstMax) {
                secondMax = nums[i];
                second = 1;
                break;
            }
        }
        for(int i=nums.length-2;i>=0;i--) {
            if(nums[i] < secondMax) {
                thirdMax = nums[i];
                third = 1;
                break;
            }
        }
        if(third == -1) {
            return firstMax;
        }
        return thirdMax;
    }
}
