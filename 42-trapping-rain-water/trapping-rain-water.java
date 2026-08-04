class Solution {
    public int trap(int[] height) {
        int n  = height.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        pre[0]=height[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]>height[i]?pre[i-1]:height[i]; 
        }
        suf[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i] = suf[i+1]>height[i]?suf[i+1]:height[i]; 
        }
        int wat = 0;
        for(int i=0;i<n;i++){
            int leftMax = pre[i];
            int rightMax = suf[i];
            if(leftMax> height[i] && rightMax > height[i]){
                wat += Math.min(leftMax,rightMax) - height[i];
            }
        }
        return wat;
    }
}