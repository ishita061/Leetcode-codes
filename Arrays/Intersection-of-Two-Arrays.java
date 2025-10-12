/*
349. Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> result = new HashSet<>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++ ;
                j++ ;
            } else if(nums1[i] < nums2[j]) {
                i++ ;
            } else {
                j++ ;
            }
        }
        int[] res = new int[result.size()];
        int ind = 0;
        for(int k : result) {
            res[ind++] = k;
        }
        return res;
    }
}
