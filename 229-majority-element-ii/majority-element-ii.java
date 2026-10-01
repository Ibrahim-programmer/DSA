class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for (int i : nums) {
            if (cnt1 == 0 && i != ele2) {
                cnt1 = 1;
                ele1 = i;
            } else if (cnt2 == 0 && i != ele1) {
                cnt2 = 1;
                ele2 = i;
            } else if (i == ele1) {
                cnt1++;
            } else if (i == ele2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }

        }
        cnt1 = 0;
        cnt2 = 0;

        for (int i : nums) {
            if (i == ele1)
                cnt1++;
            else if (i == ele2)
                cnt2++;
        }

        int limit = n / 3;

        if (cnt1 > limit) {
            ans.add(ele1);
        }

        if (cnt2 > limit) {
            ans.add(ele2);
        }
        return ans;
    }
}