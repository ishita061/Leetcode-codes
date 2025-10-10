/*
88. Merge Sorted Array


You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 
respectively. Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, 
where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
  */

//Solution - 1

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i =0; i < n;i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}

//Solution - 2

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = m-1;
        int end = n-1;
        int pos = m+n-1;
        while(start >= 0 && end >= 0) {
            if(nums1[start] > nums2[end]) {
                nums1[pos--] = nums1[start--];
            } else {
                nums1[pos--] = nums2[end--];
            }
        }
        while(end >= 0) {
            nums1[pos--] = nums2[end--];
        }
    }
}
