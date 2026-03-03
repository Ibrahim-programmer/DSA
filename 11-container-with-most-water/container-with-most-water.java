class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length -1;
        int maxarea = 0;
        while(i<=j){
            int area = Math.min(height[i],height[j]) * (j-i);
            maxarea = Math.max(area,maxarea);
            if(height[i] >= height[j]) j--;
            else i++;
        }
        System.gc();
        return maxarea;
    }
}