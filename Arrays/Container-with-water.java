/*
11. Container With Most Water
  
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
*/

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0;
        int end=n-1;
        int area=0;
        while(start<end) {
            int width=end-start;
            int newHeight=Math.min(height[start],height[end]);
            int newArea=width * newHeight;
            area=Math.max(newArea,area);
            if(height[start]<height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return area;
    }
}
