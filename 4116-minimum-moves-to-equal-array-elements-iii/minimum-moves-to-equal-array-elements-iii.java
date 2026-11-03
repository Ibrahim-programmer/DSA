class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int i: nums){
            max = i > max ? i : max;
        }
        int count = 0;
        for(int i : nums){
            count += max - i;
        }
        return count;
    }
}