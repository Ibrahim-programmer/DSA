class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> win = new HashSet<>();
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(j-i >k){
                win.remove(nums[i]);
                i++;
            }
            if(win.contains(nums[j])) return true;
            win.add(nums[j]);
        }
        return false;
    }
}